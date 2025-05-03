package com.EcomWeb.controller;

import java.io.IOException;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.EcomWeb.dao.UsersDAO;
import com.EcomWeb.model.User;
import com.EcomWeb.utility.EncryptDecrypt;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect(request.getContextPath() + "/pages/login.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String takePassword = request.getParameter("password");
		String password = EncryptDecrypt.encrypt(takePassword);
		


		try {
			UsersDAO usersDAO = new UsersDAO();
			ArrayList<User> users = usersDAO.getUserDetails();

			for (User user : users) {
				if (user.getEmail().equalsIgnoreCase(email) && user.getPassword().equals(password)) {

					HttpSession session = request.getSession();
					session.setAttribute("userEmail", email);

					response.sendRedirect(request.getContextPath() + "/pages/home.jsp");
					return;
				}
			}

			response.sendRedirect(request.getContextPath() + "/pages/login.jsp?error=InvalidCredentials");

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			response.sendRedirect(request.getContextPath() + "/pages/login.jsp?error=ServerError");
		}
	}
}
