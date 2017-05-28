package com.bookStore.Web;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bookStore.Domain.Users;
import com.bookStore.Service.UsersServer;

/**
 * @author Caijh
 *
 * 2017年5月21日 下午11:43:03
 */
@Controller
public class registerAction {
	@Autowired
	@Qualifier("usersServer")
	private UsersServer usersServer;
	private Users user;
	private String[] prom = {"email","username","password","gender","telephone","introduce"};
	/**
	 * 注册新用户
	 * 1.需要正确填写有效邮箱格式
	 * 2.两次输入的密码必须一致
	 * 3.校验码
	 * @return 返回目标页面
	 */
	@RequestMapping(value="/register", method=RequestMethod.POST) 
	public String register(@RequestParam() Map<String,String> map){
		user = new Users();
		user.setEamil(map.get(prom[0]));
		user.setName(map.get(prom[1]));
		user.setPassword(map.get(prom[2]));
		user.setGender(map.get(prom[3]));
		user.setPhone(map.get(prom[4]));
		user.setIntrodction(map.get(prom[5]));
		usersServer.saveOrUpdate(user);
		return "success/registersuccess";
	}
}
