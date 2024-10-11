package com.ssafy.sample.model.service;

import java.sql.SQLException;
import java.util.List;

import com.ssafy.sample.dto.Movie;


public interface MovieService {

	List<Movie> selectAll() throws SQLException;
	int insert(Movie product) throws SQLException;
}
