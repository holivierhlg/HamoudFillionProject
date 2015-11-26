package src.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import src.Model.Employes;

/**
 * Servlet implementation class AuthentificationServlet
 */
//@WebServlet("/AuthentificationServlet")

public class AuthentificationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthentificationServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		// Get the login and password
		String login = request.getParameter("login");
		String password = request.getParameter("password");
				
		// Create an instance and check if login and password exists
		Employes employes = Employes.instance();
		
		RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/error.jsp");
		dispatcher.include(request, response);
		
		//if (employes.verifId(login, password)) this.getServletContext().getRequestDispatcher("/demandeConge.jsp");	
		//else this.getServletContext().getRequestDispatcher("/error.jsp").forward(request, response);		
		
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
