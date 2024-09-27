package com.ssafy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ssafy.dto.MemberDto;
import com.ssafy.util.DBUtil;

public class MemberDaoImpl implements MemberDAO{

	@Override
	public int insertMember(MemberDto m) throws Exception {
		// TODO Auto-generated method stub
		Connection conn = DBUtil.getConnection();
		String sql = "insert into members(member_id, member_pass, member_name) values(?, ?, ?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		pstmt.setString(1, m.getMemberId());
		pstmt.setString(2, m.getMemberPw());
		pstmt.setString(3, m.getMemberName());
		
		int res = pstmt.executeUpdate();
		DBUtil.close(pstmt, conn);
		
		return res;
	}

	@Override
	public int updateMember(MemberDto m) throws Exception {
		// TODO Auto-generated method stub
		Connection conn = DBUtil.getConnection();
		String sql = "update members set member_pass = ?, member_name = ? where member_id = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		pstmt.setString(1, m.getMemberPw());
		pstmt.setString(2, m.getMemberName());
		pstmt.setString(3, m.getMemberId());
		
		int res = pstmt.executeUpdate();
		
		DBUtil.close(pstmt, conn);
		
		return res;
	}

	@Override
	public int deleteMember(MemberDto m) throws Exception {
		// TODO Auto-generated method stub
		Connection conn = DBUtil.getConnection();
		String sql = "delete from members where member_id = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		pstmt.setString(1, sql);
	
		int res = pstmt.executeUpdate();
		
		DBUtil.close(pstmt, conn);
		
		return 0;
	}

	@Override
	public List<MemberDto> selectMember() throws Exception {
		// TODO Auto-generated method stub
		
		Connection conn = DBUtil.getConnection();
		String sql = "select member_id, member_pass, member_name from members";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		List<MemberDto> list = new ArrayList();
		
		while(rs.next()) {
			list.add(new MemberDto(rs.getString("member_id"), rs.getString("member_pass"), rs.getString("member_name")));
		}

		DBUtil.close(conn);
		return list;
	}

	@Override
	public MemberDto selectMember(String memberId) throws Exception {
		// TODO Auto-generated method stub
		Connection conn = DBUtil.getConnection();
		String sql = "select member_id, member_pass, member_name from members where member_id = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		pstmt.setString(1, memberId);
		
		ResultSet rs = pstmt.executeQuery();
		
		rs.next();
	
		MemberDto m = new MemberDto(rs.getString("member_id"), rs.getString("member_pass"), rs.getString("member_name"));
		
		DBUtil.close(pstmt, conn);
		
		return m;
	}

	@Override
	public MemberDto login(String memberId, String memberPw) throws Exception {
		// TODO Auto-generated method stub
		Connection conn = DBUtil.getConnection();
		String sql = "select member_id, member_pass, member_name from members where id = ? and pw = ?";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		pstmt.setString(1, memberId);
		pstmt.setString(2, memberPw);
		
		ResultSet rs = pstmt.executeQuery();
		
		MemberDto m = null;
		
		if(rs.next()) {
			m = new MemberDto(rs.getString("member_id"), rs.getString("member_pass"), rs.getString("member_name"));
		}
		
		DBUtil.close(conn);
		
		return m;
	}

}
