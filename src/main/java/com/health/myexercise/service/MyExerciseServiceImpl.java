package com.health.myexercise.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.health.exercise.model.ExerciseVO;
import com.health.exerciseinfo.model.ExerciseinfoDAO;
import com.health.myexercise.model.MyExerciseDAO;
import com.health.myexercise.model.MyExerciserVO;

public class MyExerciseServiceImpl implements MyExerciseService {

	@Override
	public ArrayList<MyExerciserVO> getdate(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		String id = (String)session.getAttribute("id");
		
		MyExerciseDAO dao = MyExerciseDAO.getInstance();
		ArrayList<MyExerciserVO> list = dao.getdate(id);
		
		return list;
	}

	@Override
	public ArrayList<MyExerciserVO> getExercise(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
		

}
