package dao.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.AppConfig;
import dao.prototype.IAccountDao;
import entity.Account;

/**
 * Spring单元测试
 * @author windows
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {AppConfig.class})
public class TestAccountDao {
	@Autowired
	private IAccountDao actDao;
	
	@Test
	public void testFindAll() {
		List<Account> acts = actDao.findAll();
		for (Account act : acts) { 
			System.out.println(act);
		}		
	}
	
	@Test
	public void testSaveOrUpdate() {
		Account act = new Account(4,"zlb",88888);
		actDao.saveOrUpdate(act);
	}
	
/*	@Test
	public void testFindById() {
		Account act = actDao.find(4);
		System.out.println(act);
	}
	
	@Test
	public void testDeleteId() {
		actDao.delete(31);
	}*/
	 
	
}















