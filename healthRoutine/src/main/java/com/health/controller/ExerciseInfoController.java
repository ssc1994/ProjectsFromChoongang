package com.health.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.health.exercise.model.ExerciseVO;
import com.health.exerciseinfo.service.ExerciseInfoServiceImpl;


@WebServlet("*.ExerciseInfo")
public class ExerciseInfoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}

	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String uri =request.getRequestURI();
		String path = request.getContextPath();
		String command = uri.substring(path.length());
		HttpSession session = request.getSession();
		
		ExerciseInfoServiceImpl service = new ExerciseInfoServiceImpl();
		
		System.out.println(command);
		
		if(command.equals("/exerciseinfo/Exerciseinfo_page.ExerciseInfo")) {
			request.getRequestDispatcher("Exerciseinfo_page.jsp").forward(request, response);
		}
		
		else if(command.equals("/exerciseinfo/ExInsert.ExerciseInfo")) {
			
			ArrayList<ExerciseVO> list =  service.getRoutine(request, response);
			request.setAttribute("list", list);
			request.getRequestDispatcher("Exerciseinfo_page.jsp").forward(request, response);
			
			
		}
		else if(command.equals("/exerciseinfo/ExDB.ExerciseInfo")) {
			service.insert(request, response);
			
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('입력되었습니다.')");
			out.println("location.href='../index.jsp';");
			out.println("</script>");
		}
		
	
	
}
	
	
		
	
	
	
}
