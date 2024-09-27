package com.ssafy.controller;

import java.io.IOException;

import com.ssafy.service.MemberService;
import com.ssafy.service.MemberServiceImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MovieServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private MemberService service = new MemberServiceImpl();
	private String uri = "index.jsp";
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		process(request, response);
	}


	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		process(request, response);
	}
	
	
	private void process(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		try {
			String act = request.getParameter("act");
			
			if (act != null) {
				
				if ("init".equals(act)) {
					uri = "test.jsp";
				} else if ("memberselectall".equals(act)) {
					uri = memberse
				}
			}
			
			
		}
	}

}
