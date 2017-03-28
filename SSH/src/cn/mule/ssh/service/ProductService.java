package cn.mule.ssh.service;

import org.springframework.transaction.annotation.Transactional;

import cn.mule.ssh.dao.ProductDao;
import cn.mule.ssh.domain.Product;

/**
 * 商品管理业务层的类
 */
@Transactional
public class ProductService {
	
	private ProductDao productDao;


	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}
	
	public void save(Product product){
		System.out.println("Service中的save方法執行了");
		productDao.save(product);
	}
}
