package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BankBalanceLookup.CustomerSimpleMap;
import business.Customer;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
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
      String firstName = (String) request.getParameter("firstname");
      String lastName = (String) request.getParameter("lastname");
      double initAmount = 0.0;
      if (request.getParameter("initbalance") != null) {
          	changeAmount = Double.parseDouble((String) request.getParameter("initbalance"));
      }
      Customer aCustomer = new Customer();
      aCustomer.setId(userid);
      aCustomer.setBalance(initAmount);
      aCustomer.setFirstName(firstName);
      aCustomer.setLastName(lastName);
      aBank.addCustomer(aCustomer);

	}

}
