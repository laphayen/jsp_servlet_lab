package app.phone;

import org.springframework.stereotype.Component;

@Component("sony")
public class SonyCamera implements Camera {
	
	public void takeAPicture() {
		System.out.println("소니 카메라가 사진을 찍습니다!");
	}
}
