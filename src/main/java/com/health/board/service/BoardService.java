package com.health.board.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.health.board.model.BoardVO;

public interface BoardService {
	
	//작성
	void write(HttpServletRequest request, HttpServletResponse response);
	
	//리스트 출력
	ArrayList<BoardVO> getList(HttpServletRequest request, HttpServletResponse response);
	
	//상세페이지
	BoardVO getContent(HttpServletRequest request, HttpServletResponse response);
	
	//수정
	void modify(HttpServletRequest request, HttpServletResponse response);
	
	//삭제
	int delete(HttpServletRequest request, HttpServletResponse response);
	
	
}
