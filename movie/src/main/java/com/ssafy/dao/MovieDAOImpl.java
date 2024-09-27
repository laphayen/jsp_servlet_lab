package com.ssafy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ssafy.dto.MovieDto;
import com.ssafy.util.DBUtil;
import com.ssafy.dto.MovieDto;

public class MovieDAOImpl implements MovieDAO {

	@Override
	public int insertMovie(MovieDto m) throws Exception {
		// TODO Auto-generated method stub
		
		Connection conn = DBUtil.getConnection();
		String sql = "insert into movies(mcode, mtitle, mtime, mdirector, mgenre) values(?, ?, ?, ?, ?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		pstmt.setString(1, m.getMoiveCode());
		pstmt.setString(2, m.getMoiveTitle());
		pstmt.setString(3, m.getMoiveTitle());
		pstmt.setString(4, m.getMovieDirector());
		pstmt.setString(5, m.getMovieGenre());
		
		int res = pstmt.executeUpdate();
		
		DBUtil.close(pstmt, conn);
		
		return res;
	}

	@Override
	public int updateMovie(MovieDto m) throws Exception {
		// TODO Auto-generated method stub
		Connection conn = DBUtil.getConnection();
		String sql = "upate movies set mcode = ?, mtitle = ?, mtime = ?, mdirector = ?, mgenre = ? where mcode = ?";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		pstmt.setString(1, m.getMoiveCode());
		pstmt.setString(2, m.getMoiveTitle());
		pstmt.setInt(3, m.getMovieTime());
		pstmt.setString(4, m.getMovieDirector());
		pstmt.setString(5, m.getMovieGenre());
		
		int res = pstmt.executeUpdate();
		
		DBUtil.close(pstmt, conn);
		
		return res;
	}

	@Override
	public int deleteMovie(MovieDto m) throws Exception {
		// TODO Auto-generated method stub
		Connection conn = DBUtil.getConnection();
		String sql = "delete from movies where mcode = ?";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		pstmt.setString(1, sql);
		
		int res = pstmt.executeUpdate();
		DBUtil.close(pstmt, conn);
		
		
		
		return 0;
	}

	@Override
	public List<MovieDto> selectMoive() throws Exception {
		// TODO Auto-generated method stub
		Connection conn = DBUtil.getConnection();
		String sql = "select mcode, mtitle, mtime, mdirector, mgenre from movies";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		List<MovieDto> list = new ArrayList();
		
		while(rs.next()) {
			list.add(new MovieDto(rs.getString("mcode"), rs.getString("mtitle"), rs.getInt("mtime"), rs.getString("mdirector"), rs.getString("mgenre")));
		}
		
		DBUtil.close(pstmt, conn);
		
		return list;
	}

	@Override
	public MovieDto selectMovie(String movieCode) throws Exception {
		// TODO Auto-generated method stub
		Connection conn = DBUtil.getConnection();
		String sql = "select mcode, mtitle, mtime, mdirector, mgenre from movies where mcode = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		pstmt.setString(1, movieCode);
		
		ResultSet rs = pstmt.executeQuery();
		rs.next();
		
		MovieDto m = new MovieDto(rs.getString("mcode"), rs.getString("mtitle"), rs.getInt("mtime"), rs.getString("mdiredctor"), rs.getString("mgenre"));
		
		DBUtil.close(pstmt, conn);
		
		return m;
	}
	
}
