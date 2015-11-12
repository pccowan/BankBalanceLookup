package BankBalanceLookup;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Process
 */
@WebServlet("/Process")
public class Process extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Process() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		processBank(request, response);

		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		processBank(request, response);

		// TODO Auto-generated method stub
	}

	protected void processBank(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		Customer cust = new Customer();
		CustomerSimpleMap csm = new CustomerSimpleMap();

		String id = request.getParameter("Id");
		cust = csm.findCustomer(id);

		if (cust.getBalance() < 0) {
			request.setAttribute("cust", cust);

			getServletContext().getRequestDispatcher("/Negative.jsp").forward(
					request, response);

		} else if (cust.getBalance() > 500.00 && cust.getBalance() < 10000.00){
			request.setAttribute("cust", cust);

		getServletContext().getRequestDispatcher("/Regular.jsp").forward(
				request, response);
		}
		else if(cust.getBalance() >10000.00){
			request.setAttribute("cust", cust );
			
			getServletContext()
			.getRequestDispatcher("/High.jsp")
			.forward(request,response);
		}
		else{
			request.setAttribute("cust", cust );
			
			getServletContext()
			.getRequestDispatcher("/None.jsp")
			.forward(request,response);
		}


		// TODO Auto-generated method stub
	}

}
