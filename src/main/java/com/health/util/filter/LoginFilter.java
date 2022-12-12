package com.health.util.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebFilter({"/board/board_write.board", 
		"/board/board_modify.board", 
		"/board/registForm.board", 
		"/board/updateForm.board", 
		"/board/board_delete.board"})
public class LoginFilter implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		request.setCharacterEncoding("utf-8");

		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;

		HttpSession session = req.getSession();
		String id = (String) session.getAttribute("id");
		System.out.println(id);
		if(id == null) {		//권한이 없다면
			String path = req.getContextPath();
			res.setContentType("text/html; charset=utf-8");
			PrintWriter out = res.getWriter();
			out.println("<script>");
			out.println("alert('권한이 필요한 기능입니다');");
			out.println("location.href='" + path + "/user/user_login.user';");
			out.println("</script>");

			return;	
		}


		//필터가 여러개라면 다음필터로 연결한다
		chain.doFilter(request, response);
	}

}
