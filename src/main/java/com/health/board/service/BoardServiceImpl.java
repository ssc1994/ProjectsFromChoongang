package com.health.board.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.health.board.model.BoardDAO;
import com.health.board.model.BoardVO;

public class BoardServiceImpl implements BoardService{
	BoardDAO dao = BoardDAO.getInstance();

	@Override
	public void write(HttpServletRequest request, HttpServletResponse response) {
		String writer = request.getParameter("writer");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		dao.write(writer, title, content);
		
	}

	@Override
	public ArrayList<BoardVO> getList(HttpServletRequest request, HttpServletResponse response) {
		
		ArrayList<BoardVO> list=dao.getList();		
		return list;
	}

	@Override
	public BoardVO getContent(HttpServletRequest request, HttpServletResponse response) {
		String bno = request.getParameter("bno");
		BoardVO vo = dao.getContent(bno);
		return vo;
	}

	@Override
	public void update(HttpServletRequest request, HttpServletResponse response) {
		
	}

	@Override
	public void delete(HttpServletRequest request, HttpServletResponse response) {
		
	}

}
