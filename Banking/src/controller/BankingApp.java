package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import business.Customer;
import BankBalanceLookup.CustomerSimpleMap;

/**
 * Servlet implementation class BankingApp
 */
@WebServlet("/BankingApp")
public class BankingApp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BankingApp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

        CustomerSimpleMap aBank = new CustomerSimpleMap();
        String userid = (String) request.getParameter("loginname");
        String message = "";
        String jspName = "";
        double changeAmount = 0.0;
//        if (session.getAttribute("changeamount") != null) {
//        	changeAmount = Double.parseDouble((String) session.getAttribute("changeamount"));
        if (request.getParameter("changeamount") != null) {
            	changeAmount = Double.parseDouble((String) request.getParameter("changeamount"));
        }
        Customer aCustomer = new Customer();
    	aCustomer = aBank.findCustomer(userid);
        double newBalance = aCustomer.getBalance() + changeAmount;
    	if (userid != null) {

        	if (newBalance > CustomerSimpleMap.highBar) {
        		message = "Hey, you are our great honored customer! ";
        		jspName = "Honor";
        	} else if (newBalance < 0.0) {
        		message = "Your balance is in negative. Panelty may apply!";
        		jspName = "Warning";
        	} else {
        		message = "Your new balance is: ";
        		jspName = "Report";
        	}
        } else {
        	message = "You are not bank customer yet. Please register first, then login.";
 			jspName = "Error";	     			
        }
//        session.setAttribute("message", message);
//        session.setAttribute("newbalance", newBalance);
        request.setAttribute("message", message);
        request.setAttribute("newbalance", newBalance);
        String JSPname = "/"+jspName+".jsp";
        getServletContext().getRequestDispatcher(JSPname).forward(request, response);	
	}

}
