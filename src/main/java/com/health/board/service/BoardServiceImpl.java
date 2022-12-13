package com.health.board.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.health.board.model.BoardDAO;
import com.health.board.model.BoardVO;
import com.health.board.model.PageVO;

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

//	@Override
//	public void execute(HttpServletRequest request, HttpServletResponse response) {
//				// 1. 화면전환 시에 조회하는 페이지번호 and 화면에 그려질 데이터개수 2개를 전달받음
//				// 첫 페이지 경우
//				int pageNum = 1;
//				int amount = 5;
//				
//				// 페이지번호를 클릭하는 경우
//				if(request.getParameter("pageNum") != null && request.getParameter("amount") != null) {
//					pageNum = Integer.parseInt(request.getParameter("pageNum"));
//					amount = Integer.parseInt(request.getParameter("amount"));
//				}
//				// DAO생성
//				BoardDAO dao = BoardDAO.getInstance();
//				
//				// 2. pageVO생성
//				ArrayList<BoardVO> list = dao.getList1(pageNum, amount);
//				int total = dao.getTotal(); // 전체게시글수
//				PageVO pageVO = new PageVO(pageNum, amount, total);
//				
//				// 3. 페이지네이션을 화면에 전달
//				request.setAttribute("pageVO", pageVO);
//				
//				// 화면에 가지고 나갈 list를 request에 저장 !!
//				request.setAttribute("list", list);
//			}
	}
	
	

