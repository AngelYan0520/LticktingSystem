package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;

import entity.Account;
import service.prototype.IAccountService;


/**
 * 账户管理Controller类
 * @author windows
 *
 */
@Controller		// @Component
public class AccountController {

	@Autowired
	private IAccountService actService;
	
	@RequestMapping("/user/{id}")
	@ResponseBody
	public String getUser(@PathVariable() int id) {
		Account u = (Account)actService.searchAccount(id); 
		return JSON.toJSONString(u);
	}
	@RequestMapping("/users")
	public ModelAndView getUsers() {
		ModelAndView mv = new ModelAndView("list");
		List<Account> acts = actService.listPaged(1, 100);
		mv.addObject("acts", acts);
		return mv;
		
	}
	@RequestMapping("/deletuser/{id}")
	@ResponseBody
	public String delete(@PathVariable() int id) {
		Account u = (Account)actService.searchAccount(id); 
		return JSON.toJSONString(u);
	}
}
