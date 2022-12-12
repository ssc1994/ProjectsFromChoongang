package com.health.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.health.board.model.BoardVO;
import com.health.board.service.BoardService;
import com.health.board.service.BoardServiceImpl;


@WebServlet("*.board")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}

	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String uri =request.getRequestURI();
		String path = request.getContextPath();
		String command = uri.substring(path.length());
		BoardService service = new BoardServiceImpl(); 
		HttpSession session = request.getSession();
		int result = 0;
		
		
		switch (command) {
		case "/board/board_write.board":	//글 작성 페이지
			request.getRequestDispatcher("board_write.jsp").forward(request, response);
			break;
			
			
		case "/board/board_content.board":	//글 상세 페이지
			
			BoardVO vo = service.getContent(request, response);
			request.setAttribute("vo", vo);
			request.setAttribute("num",request.getParameter("num"));
			
			request.getRequestDispatcher("board_content.jsp").forward(request, response);
			break;
			
			
		case "/board/board_list.board":		//글 목록 페이지
			ArrayList<BoardVO> list = service.getList(request, response);
			request.setAttribute("list", list);

			request.getRequestDispatcher("board_list.jsp").forward(request, response);
			break;
			
			
	case "/board/board_modify.board":	//글 수정 페이지
			
			vo=service.getContent(request, response);
			request.setAttribute("vo", vo);
			
			
			request.getRequestDispatcher("board_modify.jsp").forward(request, response);
			break;
			
	case "/board/board_modifyForm.board":	//글 수정 페이지
		
		service.modify(request, response);
		
		response.sendRedirect("board_content.board?bno="+request.getParameter("bno"));
		
		
		break;
		
	case "/board/writeForm.board":	//글 작성시 값을 넘겨주는 페이지(작성 완료시 목록으로 보냄)
		
		
		service.write(request, response);
		
		response.sendRedirect("board_list.board");
		break;
	case "/board/board_delete.board":	//글 작성시 값을 넘겨주는 페이지(작성 완료시 목록으로 보냄)
		
		result = service.delete(request, response);
		String msg = "";
        if(result == 1) {//삭제 성공
           msg="삭제성공";
        }else {//삭제 실패
           msg="삭제실패";
        }
		
		response.setContentType("text/html; charset=utf-8");
        PrintWriter out = response.getWriter();
        out.println("<script>");
        out.println("alert('"+msg+"');");
        out.println("location.href='board_list.board';");
        out.println("</script>");
		
		break;
		
	case "/board/board_search.board":
		ArrayList<BoardVO> searchList = service.search(request, response);
		request.setAttribute("list", searchList);
		
		request.getRequestDispatcher("board_list.board").forward(request, response);
		
		break;

		default:
			break;
		}
		
		
		
	}
	
	
	
}
