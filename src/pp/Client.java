package pp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("resources/spring.xml");
		Dept dept = (Dept) ctx.getBean("obj");
		System.out.println(dept);
		System.out.println(dept);
		System.out.println(dept);

	}

}
