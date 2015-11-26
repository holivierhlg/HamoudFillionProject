package src.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import src.Model.Conges;

/**
 * Servlet implementation class VerificationServlet
 */
//@WebServlet("/VerificationServlet")

public class VerificationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VerificationServlet() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		
		response.setContentType("text/html");
		
		// Get the chosen day
		int day = Integer.parseInt(request.getParameter("day"));
		
		// Boolean to save if the leave has been accepted or not
		boolean accepted = false;
		
		// Create an instance and check if the day is free or not
		Conges conges = Conges.instance();
		if (conges.verifierJour(day))
		{
			conges.poserJour(day);
			accepted = true;
		}
		
		// Send the result to the request
		request.setAttribute("accepted", accepted);
		
		this.getServletContext().getRequestDispatcher("/resultatDemande.jsp").forward(request, response);	

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
