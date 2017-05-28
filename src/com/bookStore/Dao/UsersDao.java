package com.bookStore.Dao;

import java.util.List;

import com.bookStore.Domain.Users;
import com.bookStore.util.SqlString;

/**
 * @author Caijh
 *
 * 2017年5月24日 下午9:37:04
 */
public class UsersDao extends BasicDao{
	/**
	 * 获取所有有用户信息
	 * @return 全部用户信息的list集合
	 */
	public List<Users> getAll(){
		return getSession().createQuery(SqlString.HQL_GETALL).list();
	}
	/**
	 * 保存或更新用户信息
	 * @param user
	 */
	public void saveOrUpdate(Users user){
		getSession().saveOrUpdate(user);
	}
}
