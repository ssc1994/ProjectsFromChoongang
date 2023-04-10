package com.health.exerciseinfo.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.health.exercise.model.ExerciseVO;
import com.health.exerciseinfo.model.ExerciseinfoVO;

public interface ExerciseInfoService {

	public ArrayList<ExerciseVO> getRoutine(HttpServletRequest request, HttpServletResponse response);
	public void insert(HttpServletRequest request, HttpServletResponse response);
}
