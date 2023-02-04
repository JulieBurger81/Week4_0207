package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.RPSWinner;

/**
 * Servlet implementation class getWinnerServlet
 */
@WebServlet("/getWinnerServlet")
public class getWinnerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getWinnerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstHand = request.getParameter("first-hand");
		String secondHand = request.getParameter("second-hand");
		
		RPSWinner winner = new RPSWinner(firstHand, secondHand);
		
		request.setAttribute("RSPWinnerPage", winner);
		
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
	}

}
