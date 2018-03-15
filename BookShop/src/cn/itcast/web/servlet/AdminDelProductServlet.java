package cn.itcast.web.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.itcast.service.AdminService;
import cn.itcast.utils.BeanFactory;

public class AdminDelProductServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//获取要删除的pid
		String pid=request.getParameter("pid");
		//传递到service层
		AdminService service = (AdminService) BeanFactory.getBean("adminService");
		try {
			service.delProductByPid(pid);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		response.sendRedirect(request.getContextPath()+"/admin?method=findAllProducts");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
