package dao.prototype;

import java.util.List;

import entity.Account;

/**
 * AccountDao
 * @author windows
 *
 */
public interface IAccountDao {
	// 根据id查询账号的方法
	Account find(int id);
	void saveOrUpdate(Account act);
	void delete(int id);
	List<Account> findAll();
	List<Account> find(int offset,int pageSize);	
	int totalItems();		//获取总条目数
}
