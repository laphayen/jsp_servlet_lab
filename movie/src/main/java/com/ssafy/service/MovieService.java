package com.ssafy.service;

import java.util.List;

import com.ssafy.dto.MemberDto;
import com.ssafy.dto.MovieDto;

public interface MovieService {
	
	int insertMovie(MovieDto m) throws Exception;
	int updateMovie(MovieDto m) throws Exception;
	int deleteMovie(MovieDto m) throws Exception;
	List<MovieDto> selectMoive() throws Exception;
	MovieDto selectMovie(String movieCode) throws Exception;
}
