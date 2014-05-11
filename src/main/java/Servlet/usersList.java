package Servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.User;
import dao.UserDAO;

/**
 * Servlet implementation class usersList
 */

public class usersList extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String VIEW = "/WEB-INF/usersList.jsp";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public usersList() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<User> users = UserDAO.getAllUsers();
		request.setAttribute("users", users);
		
		this.getServletContext().getRequestDispatcher(VIEW).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
