package service.prototype;

import java.util.List;

import entity.User;
import util.MiniPager;
/**
 * 业务接口
 * @author windows
 *
 */
public interface IUserService {
	@MiniPager(tableName="user")
	List<User> listUser(int pageNo,int pageSize); 
}
