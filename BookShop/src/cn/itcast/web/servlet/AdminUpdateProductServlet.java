package cn.itcast.web.servlet;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.IOUtils;

import cn.itcast.domain.Category;
import cn.itcast.domain.Product;
import cn.itcast.service.AdminService;
import cn.itcast.utils.BeanFactory;
import cn.itcast.utils.CommonsUtils;

public class AdminUpdateProductServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		//1、获取数据
		Map<String, String[]> properties = request.getParameterMap();
		//2、封装数据
		Product product = new Product();
		try {
			BeanUtils.populate(product, properties);
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}

		//此位置Product已经封装完毕----将表单的数据封装完毕
		//手动设置表单中没有数据
		//2）、private String pimage;
		product.setPimage("products/1/c_02.jpg");
		//3）、private String pdate;//上架日期
		product.setPdate(new Date());
		//4）、private int pflag;//商品是否下载 0代表未下架
		product.setPflag(0);

		//3、传递数据给service层
		AdminService service = (AdminService) BeanFactory.getBean("adminService");
		try {
			service.updateProduct(product);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		//跳转到列表页面
		response.sendRedirect(request.getContextPath()+"/admin?method=findAllProducts");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
