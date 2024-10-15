package app.board;

import java.util.List;

import org.springframework.stereotype.Component;

@Component("boardService")
public class BoardServiceImpl implements BoardService {

	private BoardService repo;
	
	@Override
	public int insert(BoardDTO dto) throws Exception {
		// TODO Auto-generated method stub
		return repo.insert(dto);
	}

	@Override
	public int update(BoardDTO dto) throws Exception {
		// TODO Auto-generated method stub
		return repo.update(dto);
	}

	@Override
	public int delete(int id) throws Exception {
		// TODO Auto-generated method stub
		return repo.delete(id);
	}

	@Override
	public List<BoardDTO> selectAll() throws Exception {
		// TODO Auto-generated method stub
		return repo.selectAll();
	}

	@Override
	public BoardDTO select(int id) throws Exception {
		// TODO Auto-generated method stub
		return repo.select(id);
	}

}
