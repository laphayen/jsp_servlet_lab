package com.ssafy.sample.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ssafy.sample.dto.Movie;
import com.ssafy.sample.util.DBUtil;

public class MovieDaoImpl implements MovieDao {

	private MovieDaoImpl() {
	}

	private static MovieDaoImpl instance = new MovieDaoImpl();

	public static MovieDaoImpl getInstance() {
		return instance;
	}

	private DBUtil dbUtil = DBUtil.getInstance();

	@Override
	public List<Movie> selectAll() throws SQLException {
		String sql = "select mcode, mtitle, mgenre from movies";
		List<Movie> movieList = new ArrayList<>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = dbUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				movieList.add(new Movie(rs.getString(1), rs.getString(2), 0, null, rs.getString(3)));
			}

		} finally {
			dbUtil.close(rs, pstmt, conn);
		}

		return movieList;
	}


	@Override
	public int insert(Movie movie) throws SQLException {
		String sql = "insert into movies values(?,?,?,?,?)";
		Connection conn = null;
		PreparedStatement pstmt = null;
		int cnt = 0;
		try {
			conn = dbUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, movie.getCode());
			pstmt.setString(2, movie.getTitle());
			pstmt.setInt(3, movie.getTime());
			pstmt.setString(4, movie.getDirector());
			pstmt.setString(5, movie.getGenre());

			pstmt.executeUpdate();
		}finally {
			dbUtil.close(pstmt, conn);
		}
		return cnt;
	}

}
