package com.ssafy.sample.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.ssafy.sample.dto.Movie;
import com.ssafy.sample.model.service.MovieService;
import com.ssafy.sample.model.service.MovieServiceImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet({"/movie"})
public class MovieController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private MovieService movieService = MovieServiceImpl.getInstance(); 


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");

		try {
			switch (action) {
			case "goRegistPage": {
				request.getRequestDispatcher("movie/regist.jsp").forward(request, response);
				break;
			}
			case "regist":{
				regist(request,response);
				break;
			}
			case "list":{
				list(request,response);
				break;
			}
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + action);
			}
		} catch (Exception e) {
			e.printStackTrace();
			request.getRequestDispatcher("/error.jsp").forward(request, response);
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	private void regist(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
		String code = request.getParameter("code");
		String title = request.getParameter("title");
		int time = Integer.parseInt(request.getParameter("time"));
		String director = request.getParameter("director");
		String genre = request.getParameter("genre");
		Movie movie = new Movie(code, title, time, director, genre);
		
		System.out.println("등록 제품:"+movie);
		
		int cnt = movieService.insert(movie);
		
		if(cnt!=0) {			
			response.sendRedirect(request.getContextPath()+"/movie?action=list");
		}else {
			request.getRequestDispatcher("/error.jsp").forward(request, response);
		}
	}
	private void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		List<Movie> movieList = movieService.selectAll();
		
		request.setAttribute("list", movieList);
		request.getRequestDispatcher("movie/list.jsp").forward(request, response);
	}
	
	
}
