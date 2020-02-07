package com.educacionit.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.educacionit.database.AlumnoDAO;
import com.educacionit.models.AlumnoVO;

@WebServlet("/FormController")
public class FormController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FormController() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		pw.write("<h1> te contactaremos pronto </h1>");
		pw.write("<h1>gracias por enviar tu formulario  </h1>");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String Apellido = request.getParameter("Apellido");
		String phone = request.getParameter("phone");
		String message = request.getParameter("message");

		String[] con = request.getParameterValues("lista");
		
		AlumnoVO a = new AlumnoVO(name , Apellido,email,phone,message,"lala") ; 
		AlumnoDAO ad = new AlumnoDAO();
		try {
			ad.inserta(a);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		pw.write("<h3> Curso:");
		for (String c : con) {
			pw.write(c + "   ");
		}
		pw.write("</h3>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
