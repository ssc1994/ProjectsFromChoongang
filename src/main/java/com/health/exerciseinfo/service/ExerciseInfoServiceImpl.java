package com.health.exerciseinfo.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.health.exercise.model.ExerciseVO;
import com.health.exerciseinfo.model.ExerciseinfoDAO;

public class ExerciseInfoServiceImpl implements ExerciseInfoService{
	
		public ArrayList<ExerciseVO> getRoutine(HttpServletRequest request, HttpServletResponse response) {
			
			int rno = (int)request.getAttribute("rno");
			int rdayno = Integer.parseInt(request.getParameter("day"));   
			
			ExerciseinfoDAO dao = ExerciseinfoDAO.getInstance();
			ArrayList<ExerciseVO> list = dao.getRoutine(rno,rdayno);
			
			return list;
	}

}
