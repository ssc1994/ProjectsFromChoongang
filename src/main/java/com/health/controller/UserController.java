package com.health.controller;

import java.io.IOException;
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
				response.sendRedirect("user_login.user");
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
				session.setAttribute("vo", vo.getId());
				session.setAttribute("vo", vo.getPw());
			}
			
			break;
			
		case "/user/user_modify.user":
			
			break;
			
		case "/user/user_mypage.user":
			
			break;
			
			default :
				break;
		
		}
		
		
		
		
		
		
		
		
		
				
	}
}
