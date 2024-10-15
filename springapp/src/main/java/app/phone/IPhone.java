package app.phone;

import org.springframework.stereotype.Component;

@Component("IPhone")
public class IPhone implements Phone {

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("IPhone 전화");
	}

	@Override
	public void takeAPicture() {
		// TODO Auto-generated method stub
		System.out.println("IPhone 사진");
	}

	@Override
	public void playGame() {
		// TODO Auto-generated method stub
		System.out.println("IPhone 게임");
	}

}
