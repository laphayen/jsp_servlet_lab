package app.board;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BoardClient {
	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		BoardService service = (BoardService) cxt.getBean("boardService");
		try {
			service.insert(new BoardDTO());
			service.update(new BoardDTO());
			service.delete(new BoardDTO().getId());
			service.selectAll();
			service.select(new BoardDTO().getId());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
