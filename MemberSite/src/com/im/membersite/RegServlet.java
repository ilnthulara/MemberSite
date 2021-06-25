package com.im.membersite;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.im.myframework.MyFramework;

@WebServlet("/reg")
public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		Member member = new Member();
		member.id = 1;
		member.name = name;
		member.email = email;
		member.password = password;
		
		MyFramework.init("membersite", "root", "");
		MyFramework.save(member);
		
		PrintWriter out = response.getWriter();
		out.print("Successfull Registration");
	}

}
