package com.health.exerciseinfo.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.health.exerciseinfo.model.ExerciseinfoDAO;

public class ExerciseInfoServiceImpl implements ExerciseInfoService{
	
	@Override
	public void ExInsert(HttpServletRequest request, HttpServletResponse response) {
		
		String exeno1 = request.getParameter("exeno1");
		String exeno2 = request.getParameter("exeno2");
		String exeno3 = request.getParameter("exeno3");
		String exeno4 = request.getParameter("exeno4");
		String exeno5 = request.getParameter("exeno5");
		String exeno6 = request.getParameter("exeno6");
		String routine = (String)request.getAttribute("chooseroutine");
		String id = (String)request.getAttribute("id");
		
		ExerciseinfoDAO dao = ExerciseinfoDAO.getInstance();
		
		
		
		
		
	}

}
