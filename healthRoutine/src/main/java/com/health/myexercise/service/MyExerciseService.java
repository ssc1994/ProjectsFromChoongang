package com.health.myexercise.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.health.myexercise.model.MyExerciserVO;

public interface MyExerciseService {
	
	public ArrayList<MyExerciserVO> getdate(HttpServletRequest request, HttpServletResponse response);
	public ArrayList<MyExerciserVO> getExercise(HttpServletRequest request, HttpServletResponse response);
}
