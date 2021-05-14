package com.sbs.java.am;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home/main")
public class HomeMainServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 입력된 데이터의 문자셋은 UTF-8이다.
		request.setCharacterEncoding("UTF-8");
		// 출력될 문서는 html(UTF-8)
		response.setContentType("text/html; charset=UTF-8");

		String lang = request.getParameter("lang");

		if (lang == null) {
			lang = "영어";
		}

		response.getWriter().append("입력된 언어 : " + lang);
		response.getWriter().append("<br>");

		if (lang.equals("한국어")) {
			response.getWriter().append("안녕하세요");
		} else if (lang.equals("일본어")) {
			response.getWriter().append("こんにちは");
		} else {
			response.getWriter().append("Hello");
		}

	}

}
