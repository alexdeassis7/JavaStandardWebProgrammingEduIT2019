package com.edu.ir.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FormController")
public class FormController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FormController() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
		// 
		String em = request.getParameter("email");
		String un = request.getParameter("name");
		String pa = request.getParameter("Apellido");
		String ge = request.getParameter("email");
		String message = request.getParameter("message");
		String[] co = request.getParameterValues("lista");

		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"estilos/estilo.css\" />");
		pw.write("<h2> gracias por enviarnos su formulario .. <h2> <br>");
		pw.write("<h3> Email: " + em + " </h3>");
		pw.write("<h3> Name: " + un + " </h3>");
		pw.write("<h3> Apellido: " + pa + " </h3>");
		pw.write("<h3> message: " + message + " </h3>");
		pw.write("<h3> Curso:  ");
		for (String c : co) {
			pw.write(c + "   ");
		}
		pw.write("</h3>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
