package com.ssafy.sample.model.dao;

import java.sql.SQLException;
import java.util.List;

import com.ssafy.sample.dto.Movie;

public interface MovieDao {

	List<Movie> selectAll() throws SQLException;
	int insert(Movie product) throws SQLException;
}
