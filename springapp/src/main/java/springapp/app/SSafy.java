package springapp.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("ssafy")
public class SSafy {
	@Autowired
	@Lazy // 이건 클래스의 설계가 잘못된 것이다. 
	private Hello h;
	private int age;
	
	@Autowired
	public SSafy(Hello h, int age) {
		this.h = h;
		this.age = age;
		// 호출될 때 싸피의 디폴트 생성자가 호출되고 여
	}

	@Override
	public String toString() {
		return h.toString() + " age:" + age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
}
