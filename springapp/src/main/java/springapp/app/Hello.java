package springapp.app;

public class Hello {

	private String msg = "Hello App";
	
	
	
	public Hello() {
		
	}

	@Override
	public String toString() {
		return msg;
	}

	public Hello(String msg) {
		this.msg = msg;
	}
	
	
}

