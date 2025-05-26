package quanao.webmvc.controller.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import quanao.webmvc.model.Catalog;
import quanao.webmvc.model.Product;
import quanao.webmvc.model.Transactions;
import quanao.webmvc.service.CategoryService;
import quanao.webmvc.service.ProductService;
import quanao.webmvc.service.TransactionService;
import quanao.webmvc.service.impl.CategoryServicesImpl;
import quanao.webmvc.service.impl.ProductServiceImpl;
import quanao.webmvc.service.impl.TransactionServicesImpl;

public class OrderEditController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	TransactionService transactionService = new TransactionServicesImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String id = req.getParameter("id");
		Transactions transaction = transactionService.get(Integer.parseInt(id));
		req.setAttribute("order", transaction);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/view/admin/editorder.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=UTF-8");
		Transactions transactions = new Transactions();
		transactions.setId(Integer.parseInt(req.getParameter("order-id")));
		transactions.setUser_name(req.getParameter("order-name"));
		transactions.setUser_mail(req.getParameter("order-mail"));
		transactions.setUser_phone(req.getParameter("order-phone"));
		transactions.setAddress(req.getParameter("order-address"));
		transactions.setMessage(req.getParameter("order-mess"));
		transactions.setAmount(req.getParameter("order-amount"));
		transactions.setPayment(req.getParameter("order-payment"));
		transactions.setStatus(req.getParameter("order-status"));
		transactionService.edit(transactions);
		resp.sendRedirect(req.getContextPath()+"/admin/order/list");

	}
}
