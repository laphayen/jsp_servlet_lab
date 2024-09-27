package com.ssafy.dto;

public class MovieDto {
	/*
	 * 1. 객체 필드
	 * 2. get, set, to
	 * 3. 생성자 , 빈 생성자
	 */
	
	// 1. 객체 필드
	private String moiveCode;
	private String moiveTitle;
	private int movieTime;
	private String movieDirector;
	private String movieGenre;
	
	// 2
	public String getMoiveCode() {
		return moiveCode;
	}
	public void setMoiveCode(String moiveCode) {
		this.moiveCode = moiveCode;
	}
	public String getMoiveTitle() {
		return moiveTitle;
	}
	public void setMoiveTitle(String moiveTitle) {
		this.moiveTitle = moiveTitle;
	}
	public int getMovieTime() {
		return movieTime;
	}
	public void setMovieTime(int movieTime) {
		this.movieTime = movieTime;
	}
	public String getMovieDirector() {
		return movieDirector;
	}
	public void setMovieDirector(String movieDirector) {
		this.movieDirector = movieDirector;
	}
	public String getMovieGenre() {
		return movieGenre;
	}
	public void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	}
	@Override
	public String toString() {
		return "MovieDto [moiveCode=" + moiveCode + ", moiveTitle=" + moiveTitle + ", movieTime=" + movieTime
				+ ", movieDirector=" + movieDirector + ", movieGenre=" + movieGenre + "]";
	}
	
	// 3
	public MovieDto() {
		
	}
	
	public MovieDto(String moiveCode, String moiveTitle, int movieTime, String movieDirector, String movieGenre) {
		super();
		this.moiveCode = moiveCode;
		this.moiveTitle = moiveTitle;
		this.movieTime = movieTime;
		this.movieDirector = movieDirector;
		this.movieGenre = movieGenre;
	}
	
}
