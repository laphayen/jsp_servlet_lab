package app.board;

import javax.sql.DataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class BoardRepositoryImpl implements BoardRepository {
	
	private DataSource ds;
	
	@Override
	public int insert(BoardDTO dto) throws Exception {
		// TODO Auto-generated method stub
		
		Connection conn = ds.getConnection();
		PreparedStatement pstmt = conn.prepareStatement("insert into board values(?, ?, ?, ?");
		pstmt.setInt(1, dto.getId());
		pstmt.setString(2, dto.getTitle());
		pstmt.setString(3, dto.getContent());
		pstmt.setString(4, dto.getWriter());
		
		int res = pstmt.executeUpdate();
		
		
		
		return 0;
	}

	@Override
	public int update(BoardDTO dto) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<BoardDTO> selectAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BoardDTO select(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
