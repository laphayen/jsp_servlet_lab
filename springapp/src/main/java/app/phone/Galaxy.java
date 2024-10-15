package app.phone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("galaxy")
public class Galaxy implements Phone {

	@Autowired
	@Qualifier("sony")
	private Camera cam;
	
	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("galaxy 전화");
	}

	@Override
	public void takeAPicture() {
		// TODO Auto-generated method stub
		cam.takeAPicture();
		
		// System.out.println("galaxy 사진");
	}

	@Override
	public void playGame() {
		// TODO Auto-generated method stub
		System.out.println("galaxy 게임");
	}

}
