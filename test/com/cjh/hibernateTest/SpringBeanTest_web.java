package com.cjh.hibernateTest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bookStore.Domain.Users;

/**
 * @author Caijh
 *
 * 2017年5月9日 下午10:42:43
 */
@Controller
public class SpringBeanTest_web {
	@RequestMapping("/myindex")
	public String set(){
		System.out.println("调用");
		return "myindex";
	}
}
