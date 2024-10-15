package app.phone;

import org.springframework.stereotype.Component;

@Component("nikon")
public class Nikon implements Camera{

	@Override
	public void takeAPicture() {
		// TODO Auto-generated method stub
		System.out.println("니콘 카메라가 사진을 찍습니다.");
	}
	
	

}
