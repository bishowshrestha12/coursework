package com.EcomWeb.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter(urlPatterns = { "/home.jsp" })
public class AuthenticationFilter implements Filter {
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// Initialization code if required (for example: reading init parameters)
		System.out.println("AuthenticationFilter initialized");
	}

	@Override
	public void destroy() {
		// Cleanup code if required
		System.out.println("AuthenticationFilter destroyed");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;

		String uri = req.getRequestURI();
		
		// Check if logged in
		HttpSession session = req.getSession(false);
		boolean loggedIn = session != null && session.getAttribute("userEmail") != null;

		if (!loggedIn && (uri.endsWith("login.jsp") || uri.endsWith("LoginController"))) {
			chain.doFilter(request, response);
			return;
		}
		// Skipping filter for login page and login controller
		if (loggedIn) {
			if (uri.endsWith("login.jsp") || uri.endsWith("LoginController")) {

				res.sendRedirect(req.getContextPath() + "/home.jsp");
			} else {
				chain.doFilter(request, response);
				return;
			}
		} else {
			res.sendRedirect(req.getContextPath() + "/login.jsp");
		}

	}
}