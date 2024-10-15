package springapp.app;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	
	public static void main(String[] args) {
		
//		Hello h = new Hello();
//		System.out.println(h.toString());
		
		
		
		// spring framework
		// 1번 방법
		ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		/*
		 * xml에 등록된 빈들을 classpathxmlapplication이 실행되면서 객체 생성해서 필요할 때 의존성을 주입하겠다.
		 */
		
		Hello sh = (Hello) cxt.getBean("h");
		System.out.println(sh.toString());
		
		Hello sh2 = (Hello) cxt.getBean("h");
		System.out.println(sh.toString());
		
		if (sh == sh2) {
			System.out.println("같은 객체이다.");
		}
		
		SSafy s = (SSafy) cxt.getBean("ssafy");
		
		/*
		 * 기본으로 싱글통 구조이기 때문에 같은 해시코드를 가진 객체를 반환한다.
		 * 
		 * 사전에 객체가 생성되어 있고 각 객체가 필요할 때 마다 호출해서 가져다 주는 것.
		 * 
		 */
		
		BeanFactory ctx1 = new AnnotationConfigApplicationContext(Config.class);
		Hello ha = (Hello) ctx1.getBean("h");
		System.out.println(ha);
		/*
		 * 어차피 getbean이기 때문에 beanfactory를 가져와서 처리하겠다.
		 */
		
		SSafy ssafy = (SSafy) ctx1.getBean("ssafy");
		System.out.println(ssafy);
	}
	
}
