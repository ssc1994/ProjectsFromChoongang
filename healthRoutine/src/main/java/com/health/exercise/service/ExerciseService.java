package com.health.exercise.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.health.exercise.model.ExerciseVO;

public interface ExerciseService {
	public ArrayList<ExerciseVO> getExercise(HttpServletRequest request, HttpServletResponse response);

}