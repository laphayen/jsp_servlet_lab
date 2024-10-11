package com.ssafy.sample.model.service;

import java.sql.SQLException;
import java.util.List;

import com.ssafy.sample.dto.Movie;
import com.ssafy.sample.model.dao.MovieDao;
import com.ssafy.sample.model.dao.MovieDaoImpl;

public class MovieServiceImpl implements MovieService {
	private MovieServiceImpl() {}
	private static MovieServiceImpl instance = new MovieServiceImpl();
	
	public static MovieServiceImpl getInstance() {
		return instance;
	}
	
	private MovieDao movieDao = MovieDaoImpl.getInstance();
	
	@Override
	public List<Movie> selectAll() throws SQLException {
		return movieDao.selectAll();
	}

	@Override
	public int insert(Movie movie) throws SQLException {
		return movieDao.insert(movie);
	}

}
