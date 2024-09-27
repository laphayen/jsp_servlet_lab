package com.ssafy.dao;

import java.util.List;

import com.ssafy.dto.MemberDto;
import com.ssafy.dto.MovieDto;

public interface MovieDAO {
	
	/*
	 * 1. 영화 삽입, 수정, 삭제, 조회, 전체 조회
	 * 
	 */
	
	int insertMovie(MovieDto m) throws Exception;
	int updateMovie(MovieDto m) throws Exception;
	int deleteMovie(MovieDto m) throws Exception;
	List<MovieDto> selectMoive() throws Exception;
	MovieDto selectMovie(String movieCode) throws Exception;
}
