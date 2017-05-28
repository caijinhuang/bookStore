package com.bookStore.Service;

import java.util.List;

import com.bookStore.Dao.UsersDao;
import com.bookStore.Domain.Users;


/**
 * @author Caijh
 *
 * 2017年5月24日 下午9:40:58
 */
public class UsersServer {
	private UsersDao usersDao;
	public void setUsersDao(UsersDao usersDao) {
		this.usersDao = usersDao;
	}
	/**
	 * 获取所有用户信息
	 * @return
	 */
	public List<Users> getAll(){
		return usersDao.getAll();
	}
	/**
	 * 保存或更新用户信息
	 * @param user
	 */
	public void saveOrUpdate(Users user){
		usersDao.saveOrUpdate(user);
	}
}
