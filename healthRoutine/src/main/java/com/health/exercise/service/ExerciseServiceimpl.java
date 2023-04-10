package com.health.exercise.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.health.exercise.model.ExerciseDAO;
import com.health.exercise.model.ExerciseVO;

public class ExerciseServiceimpl implements ExerciseService {

	public ArrayList<ExerciseVO> getExercise(HttpServletRequest request, HttpServletResponse response) {
		ArrayList<ExerciseVO> list =new  ArrayList<>();
		
		int rno = 0;
		if(request.getParameter("routine")!=null) {
		rno = Integer.parseInt(request.getParameter("routine"));
		}
		
		ExerciseDAO dao = ExerciseDAO.getInstance();
		list=dao.getExercise(rno);//이 리스트는 3분할일 경우 3분할의 D1,D2,D3의 각 운동내용들을 한번에 출력한다.
		
		return list;
	}
}