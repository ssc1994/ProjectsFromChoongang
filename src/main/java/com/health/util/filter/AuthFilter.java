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

@WebFilter({"/board/board_modify.board", 
		"/board/updateForm.board", 
		"/board/board_delete.board"})
public class AuthFilter implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		request.setCharacterEncoding("utf-8");

		//권한검사
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;

		//각 요청에 넘어오는 writer 파라미터
		String writer = request.getParameter("bid");

		//세션에 저장된 user_id
		HttpSession session = req.getSession();
		String id = (String) session.getAttribute("id");

				System.out.println("작성자" + writer);
				System.out.println("세션ID" + id);

		//세션이 없거나 or 작성자와 세션이 다른경우
		if((id == null || !writer.equals(id)) && !id.equals("admin")) {

			String path = req.getContextPath();

			res.setContentType("text/html; charset=utf-8");
			PrintWriter out = res.getWriter();
			out.println("<script>");
			out.println("alert('권한이 필요한 기능입니다');");
			out.println("location.href='" + path + "/board/board_list.board';");
			out.println("</script>");

			return;

		}


		chain.doFilter(request, response);
	}
}
