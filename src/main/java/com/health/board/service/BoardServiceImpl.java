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
		String bid = request.getParameter("bid");
		String btitle = request.getParameter("btitle");
		String bcontent = request.getParameter("bcontent");
		
		dao.write(bid, btitle, bcontent);
	}

	@Override
	public ArrayList<BoardVO> getList(HttpServletRequest request, HttpServletResponse response) {
		
		ArrayList<BoardVO> list=dao.getList();		
		return list;
	}

	@Override
	public BoardVO getContent(HttpServletRequest request, HttpServletResponse response) {
		String bno = request.getParameter("bno");
		dao.hit(bno);//조회수 수정
		BoardVO vo = dao.getContent(bno);
		return vo;
	}

	@Override
	public void modify(HttpServletRequest request, HttpServletResponse response) {
		String bno = request.getParameter("bno");
		String btitle = request.getParameter("btitle");
		String bcontent = request.getParameter("bcontent");
		
		 dao.modify(bno, btitle, bcontent);
	}

	@Override
	public int delete(HttpServletRequest request, HttpServletResponse response) {
		String bno = request.getParameter("bno") ;
		int result = dao.delete(bno);
		return result;
	}

	@Override
	public ArrayList<BoardVO> search(HttpServletRequest request, HttpServletResponse response) {
		String search = request.getParameter("search");
		ArrayList<BoardVO> list = dao.search(search);

		return list;
	}
	
	

}
