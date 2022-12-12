package com.health.routine.sevice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface RoutineService {
	public int getRoutine(HttpServletRequest request, HttpServletResponse response); //routine값 반환
}