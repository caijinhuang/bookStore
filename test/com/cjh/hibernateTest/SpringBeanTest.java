package com.cjh.hibernateTest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bookStore.Domain.Users;

/**
 * @author Caijh
 *
 * 2017年5月9日 下午10:42:43
 */
public class SpringBeanTest {
	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("Application-beans.xml");
		SessionFactory session = (SessionFactory)app.getBean("sessionFactory");
		Session sess = session.openSession();
		Users u = sess.get(Users.class, 1);
		System.out.println(u.getName());
	}
}
