package com.health.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.health.user.model.UserVO;
import com.health.user.service.UserServiceImpl;

@WebServlet("*.user")
public class UserController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    public UserController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}

	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		
		String uri = request.getRequestURI();
		String path = request.getContextPath();
		
		UserServiceImpl service = new UserServiceImpl();
		HttpSession session = request.getSession();

		String command = uri.substring(path.length());
		System.out.println("요청경로 : " + command);
		
		switch(command) {
		
		case "/user/user_join.user":
			
			request.getRequestDispatcher("user_join.jsp").forward(request, response);
			break;
			
		case "/user/joinForm.user":
			
			int result = service.join(request, response);
			
			if(result >= 1) {
				request.setAttribute("msg", "중복된 아이디 또는 이메일");
				request.getRequestDispatcher("user_join.jsp").forward(request, response);
			}else {
				
				response.setContentType("text/html; charset=utf-8");
				PrintWriter out = response.getWriter();
				out.println("<script>");
				out.println("alert('회원가입을 완료했습니다. 앞으로 열심히 운동 해 보자고요 !')");
				out.println("location.href='user_login.user';");
				out.println("</script>");
				
			}
			
			break;
			
		case "/user/user_login.user":
			
			request.getRequestDispatcher("user_login.jsp").forward(request, response);
			
			break;
			
		case "/user/loginForm.user":
			
			UserVO vo = service.login(request, response);
			
			if(vo == null) {
				request.setAttribute("msg", "아이디 또는 비밀번호를 확인하세요");
				request.getRequestDispatcher("user_login.jsp").forward(request, response);
			}else {
				session = request.getSession();
				session.setAttribute("id", vo.getId());
				session.setAttribute("name", vo.getName());
				session.setAttribute("user_rno", vo.getRno()); //운동 루틴 설정한 값을 넘겨주기 위해 가져 온 것.
				
				response.sendRedirect("user_mypage.user");
			}
			
			break;
			
		case "/user/user_mypage.user":
			
			request.getRequestDispatcher("user_mypage.jsp").forward(request, response);
			
			break;
			
		case "/user/user_modify.user":
			
			vo = service.getInfo(request, response);
			
			request.setAttribute("name", vo.getName());
			request.setAttribute("id", vo.getId());
			request.setAttribute("pw", vo.getPw());
			request.setAttribute("cm", vo.getCm());
			request.setAttribute("kg", vo.getKg());
			request.setAttribute("email", vo.getEmail());
			request.setAttribute("rno", vo.getRno());
			
			request.getRequestDispatcher("user_modify.jsp").forward(request, response);
			
			break;
			
		case "/user/updateForm.user":
			
			int result1 = service.update(request, response);
			
			if(result1 == 1) {
				
				response.setContentType("text/html; charset=utf-8");
				PrintWriter out = response.getWriter();
				out.println("<script>");
				out.println("alert('정보가 수정되었습니다.')");
				out.println("location.href='user_mypage.user';");
				out.println("</script>");
				
			}else {
				
				response.sendRedirect("user_modify.user");
				
			}
			
			break;
			
		case "/user/user_logout.user": 
			
			session = request.getSession();
			session.invalidate();
			
			response.sendRedirect("user_login.user");
			
			break;
			
		case "/user/user_confirm.user": 
			
			request.getRequestDispatcher("user_confirm.jsp").forward(request, response);
			
			break;
			
		case "/user/user_delete.user": 
			
			int result2 = service.delete(request, response);
			
			if(result2 == 1) {
				response.setContentType("text/html; charset=utf-8");
				PrintWriter out = response.getWriter();
				out.println("<script>");
				out.println("alert('정보가 삭제되었습니다.')");
				out.println("location.href='user_login.user';");
				out.println("</script>");
			}else {
				response.sendRedirect("user_mypage.user");
			}
			
			break;
			
			default :
				break;
		
		}
		
		
		
		
		
		
		
		
		
				
	}
}
