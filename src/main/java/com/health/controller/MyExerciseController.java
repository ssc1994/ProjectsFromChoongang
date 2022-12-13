package com.health.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.health.exercise.model.ExerciseVO;
import com.health.exerciseinfo.service.ExerciseInfoServiceImpl;
import com.health.myexercise.model.MyExerciserVO;
import com.health.myexercise.service.MyExerciseServiceImpl;


@WebServlet("*.myExercise")
public class MyExerciseController extends HttpServlet {
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
		
		MyExerciseServiceImpl service = new MyExerciseServiceImpl();
		
		System.out.println(command);
		
		if(command.equals("/myexercise/myExercise.myExercise")) {
			
			ArrayList<MyExerciserVO> list =  service.getdate(request, response);
			request.setAttribute("list", list);
			service.getExercise(request, response);
			request.setAttribute("list2", list);
			request.getRequestDispatcher("myExercise.jsp").forward(request, response);
		}
	
	}
	
	
	
}
