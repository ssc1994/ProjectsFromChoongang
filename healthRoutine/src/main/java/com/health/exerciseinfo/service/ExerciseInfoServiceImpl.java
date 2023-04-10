package com.health.exerciseinfo.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.health.exercise.model.ExerciseVO;
import com.health.exerciseinfo.model.ExerciseinfoDAO;
import com.health.user.model.UserVO;

public class ExerciseInfoServiceImpl implements ExerciseInfoService{
	
	
		public ArrayList<ExerciseVO> getRoutine(HttpServletRequest request, HttpServletResponse response) {
			HttpSession session = request.getSession();
			
			int rno = (int)session.getAttribute("user_rno");
			int rdayno = Integer.parseInt(request.getParameter("day"));  
			
			ExerciseinfoDAO dao = ExerciseinfoDAO.getInstance();
			ArrayList<ExerciseVO> list = dao.getRoutine(rno,rdayno);
			
			return list;
	}

		@Override
		public void insert(HttpServletRequest request, HttpServletResponse response) {
			HttpSession session = request.getSession();
			
			String id = (String)session.getAttribute("id");
			int rno = (int)session.getAttribute("user_rno");
			int exeno1 =0;
			int exeno2 =0;
			int exeno3 =0;
			int exeno4 =0;
			int exeno5 =0;
			int exeno6 =0;
			
			if(request.getParameter("exeno1")!=null) {
				exeno1 = Integer.parseInt(request.getParameter("exeno1"));
			}
			if(request.getParameter("exeno2")!=null) {
				exeno2 = Integer.parseInt(request.getParameter("exeno2"));
			}
			if(request.getParameter("exeno3")!=null) {
				exeno3 = Integer.parseInt(request.getParameter("exeno3"));
			}
			if(request.getParameter("exeno4")!=null) {
				exeno4 = Integer.parseInt(request.getParameter("exeno4"));
			}
			if(request.getParameter("exeno5")!=null) {
				exeno5 = Integer.parseInt(request.getParameter("exeno5"));
			}
			if(request.getParameter("exeno6")!=null) {
				exeno6 = Integer.parseInt(request.getParameter("exeno6"));
			}
			
			int rdayno = Integer.parseInt(request.getParameter("rdayno"));
			
			ExerciseinfoDAO dao = ExerciseinfoDAO.getInstance();
			dao.insert(id, rno, exeno1, exeno2, exeno3, exeno4, exeno5, exeno6, rdayno);
			
			
		}
		
		

}
