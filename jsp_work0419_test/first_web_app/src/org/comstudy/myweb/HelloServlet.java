package org.comstudy.myweb;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet 호출 - HelloServlet");
		
		//리다이렉트 - 주소가 갱신된다.
		//forward -주소는 그대로이고 화면 내용만 바뀐다.
		
		//request - 요청객체
		//response - 응답객체 - 브라우저에 보여지는 내용
		req.setAttribute("user","홍길동");
		String path = "/WEB-INF/views/saram_list.jsp";
		RequestDispatcher view = req.getRequestDispatcher(path);
		view.forward(req, resp);
	}
			

}
