package com.health.routine.sevice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.health.routine.model.RoutineDAO;

public class RoutineServiceImpl implements RoutineService {

	public int getRoutine(HttpServletRequest request, HttpServletResponse response) {//라디오박스에서 체크된 값을 db에서 비교해서 routine값으로 반환
		
		int rno = 0;
		if(request.getParameter("routine")!=null) {
			rno = Integer.parseInt(request.getParameter("routine"));//라디오박스에서 체크된 값
		}
		
		RoutineDAO dao = RoutineDAO.getInstance();
		int getrno = dao.getRoutine(rno);
		return getrno;//db값 routine(number)반환
	}
}