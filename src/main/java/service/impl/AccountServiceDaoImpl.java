package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.prototype.IAccountDao;
import entity.Account;
import service.prototype.IAccountService;
/**
 * Account业务实现类
 * @author windows
 *
 */
@Service("accountServiceDaoImpl")
public class AccountServiceDaoImpl implements IAccountService {
	
	@Autowired
	private IAccountDao actDao;
	
	@Override	// 涉及到事务 Spring 声明式的Transaction的处理（AOP动态代理模式的应用）
	public void transfer(Account from, Account to, double Money) {
		
	}

	@Override
	public Account searchAccount(int id) {
		return actDao.find(id);
	}

	@Override
	public List<Account> listAccounts(int pageNo, int pageSize) {
		return null;
	}

	@Override
	public List<Account> listPaged(int pageNo, int pageSize) {
		return actDao.find((pageNo-1)*pageSize,pageSize);
	}

}
