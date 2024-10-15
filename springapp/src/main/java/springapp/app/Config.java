package springapp.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	// 메소드명은 클래스에 있는 변수명으로 한다.
	@Bean
	public Hello h() {
		return new Hello("Hello");
	}
	
	public SSafy ssafy() {
		// 이건 너무 복잡해 return new ssafy(h, "27");
	}
}
