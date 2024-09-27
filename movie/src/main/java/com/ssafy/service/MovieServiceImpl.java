package com.ssafy.service;

import java.util.List;

import com.ssafy.dao.MovieDAO;
import com.ssafy.dao.MovieDAOImpl;
import com.ssafy.dto.MovieDto;

public class MovieServiceImpl implements MovieService{
	
	private MovieDAO dao = new MovieDAOImpl();
	
	
	@Override
	public int insertMovie(MovieDto m) throws Exception {
		// TODO Auto-generated method stub
		return dao.insertMovie(m);
	}

	@Override
	public int updateMovie(MovieDto m) throws Exception {
		// TODO Auto-generated method stub
		return dao.updateMovie(m);
	}

	@Override
	public int deleteMovie(MovieDto m) throws Exception {
		// TODO Auto-generated method stub
		return dao.deleteMovie(m);
	}

	@Override
	public List<MovieDto> selectMoive() throws Exception {
		// TODO Auto-generated method stub
		return dao.selectMoive();
	}

	@Override
	public MovieDto selectMovie(String movieCode) throws Exception {
		// TODO Auto-generated method stub
		return dao.selectMovie(movieCode);
	}

}
