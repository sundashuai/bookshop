package cn.itcast.service.impl;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import cn.itcast.dao.AdminDao;
import cn.itcast.domain.Category;
import cn.itcast.domain.Order;
import cn.itcast.domain.Product;
import cn.itcast.service.AdminService;

public class AdminServiceImpl implements AdminService{

	public List<Category> findAllCategory() {
		AdminDao dao = new AdminDao();
		try {
			return dao.findAllCategory();
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	public void saveProduct(Product product) throws SQLException {
		AdminDao dao = new AdminDao();
		dao.saveProduct(product);
	}
	

	
	public List<Category> findCategory(){
		AdminDao dao = new AdminDao();
		List<Category> categoryList = null;
		try {
			categoryList = dao.findCategory();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return categoryList;
	}
	
	public List<Product> findAllProducts(){
		AdminDao dao = new AdminDao();
		List<Product> productsList = null;
		try {
			productsList = dao.findAllProducts();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return productsList;
	}

	public List<Order> findAllOrders() {
		AdminDao dao = new AdminDao();
		List<Order> ordersList = null;
		try {
			ordersList = dao.findAllOrders();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ordersList;
	}

	public List<Map<String, Object>> findOrderInfoByOid(String oid) {
		AdminDao dao = new AdminDao();
		List<Map<String, Object>> mapList = null;
		try {
			mapList = dao.findOrderInfoByOid(oid);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return mapList;
	}
	
	
	public void delProductByPid(String pid) throws SQLException{
		AdminDao dao = new AdminDao();
		dao.delProductByPid(pid);
	}
	
	public Product findProductByPid(String pid) throws SQLException{
		AdminDao dao = new AdminDao();
		return dao.findProductByPid(pid);
		
	}
	
	public void updateProduct(Product product) throws SQLException{
		AdminDao dao = new AdminDao();
		dao.updateProduct(product);
	}
}
