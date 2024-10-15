package app.phone;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientMain {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext("applicationContext.xml");
		
	 	Phone p = (Phone) cxt.getBean("galaxy");
	 	p.call();
	 	p.playGame();
	 	p.takeAPicture();
		
		
	}
}
