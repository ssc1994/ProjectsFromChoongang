package com.health.routine.sevice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.health.routine.model.RoutineDAO;
import com.health.routine.model.RoutineVO;

public class RoutineServiceImpl implements RoutineService {

	public int getRoutine(HttpServletRequest request, HttpServletResponse response) {
		int rno = Integer.parseInt(request.getParameter("routine"));
		
		
		RoutineDAO dao = RoutineDAO.getInstance();
		int getrno = dao.getRoutine(rno);
		return getrno;
		
	}
	
	
	
}
