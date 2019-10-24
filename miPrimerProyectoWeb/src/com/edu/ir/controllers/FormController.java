package com.edu.ir.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormController
 */
@WebServlet("/FormController")
public class FormController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FormController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

		String em = request.getParameter("email");
		String un = request.getParameter("uname");
		String pa = request.getParameter("pass");
		String ge = request.getParameter("gender");
		String[] co = request.getParameterValues("course");

		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.write("<h2> Following data received sucessfully.. <h2> <br>");
		pw.write("<h3> Email: " + em + " </h3>");
		pw.write("<h3> User name: " + un + " </h3>");
		pw.write("<h3> Password: " + pa + " </h3>");
		pw.write("<h3> Gender: " + ge + " </h3>");
		pw.write("<h3> Course:  ");
		for (String c : co) {
			pw.write(c + "   ");
		}
		pw.write("</h3>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
