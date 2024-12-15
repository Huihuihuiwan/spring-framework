package com.wanshaohui.test;
import com.wanshaohui.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 * @author: wanshaohui
 * @create: 2024-12-12 00:08
 * @description: 测试demo
 **/
public class SpringDemo {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-config.xml");
		User user = (User) context.getBean("user");
		user.hello();
	}
}
