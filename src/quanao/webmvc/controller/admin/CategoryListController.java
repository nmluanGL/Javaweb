package quanao.webmvc.controller.admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import quanao.webmvc.model.Catalog;
import quanao.webmvc.service.CategoryService;
import quanao.webmvc.service.impl.CategoryServicesImpl;

import java.util.List;

/**
 * Servlet implementation class CategoryListController
 */

public class CategoryListController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	CategoryService cateService = new CategoryServicesImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Catalog> cateList = cateService.getAll();
		req.setAttribute("catelist", cateList);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/view/admin/show-cate.jsp");
		dispatcher.forward(req, resp);
	}

}