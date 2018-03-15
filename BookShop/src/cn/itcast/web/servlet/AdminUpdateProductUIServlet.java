package cn.itcast.web.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import cn.itcast.domain.Category;
import cn.itcast.domain.Product;
import cn.itcast.service.AdminService;
import cn.itcast.utils.BeanFactory;

public class AdminUpdateProductUIServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获得要查询product的pid
		String pid=request.getParameter("pid");
		//传递pid查询信息
		AdminService service = (AdminService) BeanFactory.getBean("adminService");
		Product product=null;
		try {
			product=service.findProductByPid(pid);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//显示所有分类信息
		List<Category> categoryList = service.findAllCategory();
		Gson gson = new Gson();
		String json = gson.toJson(categoryList);
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().write(json);
		request.setAttribute("categoryList", categoryList);
		request.setAttribute("product", product);
		request.getRequestDispatcher("/admin/product/edit.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
