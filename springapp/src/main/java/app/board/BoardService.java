package app.board;

import java.util.List;

public interface BoardService {
	public int insert (BoardDTO dto) throws Exception;
	public int update (BoardDTO dto) throws Exception;
	public int delete (int id) throws Exception;
	public List<BoardDTO> selectAll() throws Exception;
	public BoardDTO select(int id) throws Exception;
}
