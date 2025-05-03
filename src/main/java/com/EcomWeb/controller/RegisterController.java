package com.EcomWeb.controller;

import java.io.IOException;


import java.text.SimpleDateFormat;
import java.sql.SQLException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.EcomWeb.dao.UsersDAO;
import com.EcomWeb.model.User;
import com.EcomWeb.utility.EncryptDecrypt;

@WebServlet("/register")

public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegisterController() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String takePassword = request.getParameter("password");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
	    String confirmPassword = request.getParameter("confirmpassword");
		String dob = request.getParameter("dob");


		String password = EncryptDecrypt.encrypt(takePassword);

		
		

		
		if (fname == null || !fname.matches("^[a-zA-Z]+$")) {
			response.sendRedirect(request.getContextPath() + "/pages/register.jsp?error=fname");
			return;
		}

		
		if (lname == null || !lname.matches("^[a-zA-Z]+$")) {
			response.sendRedirect(request.getContextPath() + "/pages/register.jsp?error=lname");
			return;
		}

	
		if (takePassword == null  ||!takePassword.matches(".*[A-Z].*") || !takePassword.matches(".*[0-9].*") || !takePassword.matches(".*[^A-Za-z0-9].*") || takePassword.length() < 6) {
			response.sendRedirect(request.getContextPath() + "/pages/register.jsp?error=password");
			return;
		}
		
		if (!takePassword.equals(confirmPassword)) {
			response.sendRedirect(request.getContextPath() + "/pages/register.jsp?error=password_mismatch");
	         return;
	    }
		
		try {
			User student = new User(email,fname,lname,dob,password); 

			UsersDAO studentDAO = new UsersDAO();
			if (studentDAO.addUser(student)) {
				response.sendRedirect(request.getContextPath() + "/pages/login.jsp?success=true");
			} else {
				response.sendRedirect(request.getContextPath() + "/pages/login.jsp?error=db");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			response.sendRedirect(request.getContextPath() + "/pages/register.jsp?error=exception");
		}
	}
}
