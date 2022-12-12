package com.health.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.health.exercise.service.ExerciseService;
import com.health.exercise.service.ExerciseServiceimpl;
import com.health.routine.sevice.RoutineService;
import com.health.routine.sevice.RoutineServiceImpl;


@WebServlet("*.routine")
public class RoutineController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
		
	}
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String uri = request.getRequestURI();
		String path = request.getContextPath();
		String command = uri.substring(path.length());
		
		System.out.println("요청경로"+command);
		
		RoutineService routineservice = new RoutineServiceImpl();
		ExerciseService exerciseservice=new ExerciseServiceimpl();
		HttpSession session = request.getSession();
		
		switch (command) {
		case "/routine/routine_info.routine":
		
			
			
			request.getRequestDispatcher("routine_info.jsp").forward(request, response);
			break;
			
		case "/routine/routineForm.routine":
			int rno = routineservice.getRoutine(request, response);//서비스-dao 연결을 통해 db에서 가져온 routine 값(number)
			session.setAttribute("rno",rno);//rno라는 세션에 routine값 세션에 저장
			session.setAttribute("exerciselist", exerciseservice.getExercise(request, response));
			
			
			
			response.sendRedirect("routine_info.routine");
			break;
		
		default:
			break;
		}
		
		
	}

}