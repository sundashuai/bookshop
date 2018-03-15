package cn.itcast.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import cn.itcast.domain.Category;
import cn.itcast.domain.Order;
import cn.itcast.domain.Product;

public interface AdminService {

	public List<Category> findAllCategory();

	public void saveProduct(Product product) throws SQLException;

	public List<Order> findAllOrders();

	public List<Map<String, Object>> findOrderInfoByOid(String oid);

	public List<Product> findAllProducts();

	public List<Category> findCategory();

	public void delProductByPid(String pid) throws SQLException;

	public Product findProductByPid(String pid) throws SQLException;

	public void updateProduct(Product product) throws SQLException;





}
