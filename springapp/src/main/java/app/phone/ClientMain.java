package app.phone;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientMain {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext("applicationContext.xml");
		
	 	Phone p = (Phone) cxt.getBean("galaxy");
	 	p.call();
	 	p.playGame();
	 	p.takeAPicture();
		
		/*
		 * 
		 * 느슨한 연결로 객체를 생성할 필요 없이.
		 * 
		 */
	}
}
