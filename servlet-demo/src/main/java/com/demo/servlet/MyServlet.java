package com.demo.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = -38281540417086336L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Amazing! MyServlet is Running !");
	}
	
}
