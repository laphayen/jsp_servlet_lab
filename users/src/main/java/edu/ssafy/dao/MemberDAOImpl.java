package edu.ssafy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.PreparableStatement;

import edu.ssafy.dto.MemberDto;
import edu.ssafy.util.DBUtil;

public class MemberDAOImpl implements MemberDAO {

	@Override
	public int insertMember(MemberDto m) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateMember(MemberDto m) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteMember(MemberDto m) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<MemberDto> selectMember() throws Exception {
		// TODO Auto-generated method stub
		Connection conn = DBUtil.getConnection();
		String sql = "select id, pw, name, age from members";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		List<MemberDto> list = new ArrayList();
		while (rs.next()) {
			list.add(new MemberDto(rs.getString("id"),
					rs.getString("pw"),
					rs.getString("name")));
		}
		
		
		return list;
	}

	@Override
	public List<MemberDto> selectMember(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
