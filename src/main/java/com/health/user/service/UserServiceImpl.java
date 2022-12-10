package com.health.user.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.health.user.model.UserDAO;
import com.health.user.model.UserVO;

public class UserServiceImpl implements UserService{

	@Override
	public int join(HttpServletRequest request, HttpServletResponse response) {

		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		int cm = Integer.parseInt(request.getParameter("cm"));
		int kg = Integer.parseInt(request.getParameter("kg"));
		String email = request.getParameter("email");
		int rno = Integer.parseInt(request.getParameter("rno"));
		
		//아이디 중복검사 > 가입
		UserDAO dao = UserDAO.getInstance();
		int result = dao.idCheck(id, email);
		
		if(result >= 1) {//중복
			return 1;
		}else {
			UserVO vo = new UserVO(0, name, id, pw, cm, kg, email, rno);
			dao.join(vo);
			return 0;
		}
		
	}

	@Override
	public UserVO login(HttpServletRequest request, HttpServletResponse response) {
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		UserDAO dao = UserDAO.getInstance();
		UserVO vo = dao.login(id, pw);
		
		return vo;
	}


	
	
	
}
