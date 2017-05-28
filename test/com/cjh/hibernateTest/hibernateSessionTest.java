package com.cjh.hibernateTest;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bookStore.Domain.Users;
import com.bookStore.Service.UsersServer;

/**
 * @author Caijh
 * hibernate测试
 * 2017年5月8日 下午5:11:51
 */
public class hibernateSessionTest {
	private static UsersServer usersServer;
	/**
	 * @param usersServer the usersServer to set
	 */
	public void setUsersServer(UsersServer usersServer) {
		this.usersServer = usersServer;
	}
//	public static void main(String[] args) {
//		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
//		SessionFactory sessFactory = configuration.buildSessionFactory();
//		Session session = sessFactory.openSession();
//		Transaction transaction = session.beginTransaction();
//		Users use = new Users();
//		use.setEamil("cjh@163.com");
//		use.setId(1);
//		use.setIntrodction("...");
//		use.setName("caijinhuang");
//		use.setPassword("admin");
//		use.setPhone("123456");
//		use.setSex("male");
//		session.save(use);
//		transaction.commit();
//		session.close();
//	}
	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("Application-*.xml");
		chaxun();
	}
	public static void chaxun(){
		List<Users> ulist = usersServer.getAll();
		for(Users u:ulist){
			System.out.println(u.getName());
		}
	}
}
