package cn.mule.ssh.service;

import org.springframework.transaction.annotation.Transactional;

import cn.mule.ssh.dao.ProductDao;
import cn.mule.ssh.domain.Product;

/**
 * ��Ʒ����ҵ������
 */
@Transactional
public class ProductService {
	
	private ProductDao productDao;


	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}
	
	public void save(Product product){
		System.out.println("Service�е�save����������");
		productDao.save(product);
	}
}
