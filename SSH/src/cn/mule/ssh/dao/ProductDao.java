package cn.mule.ssh.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.mule.ssh.domain.Product;

/**
 * 商品管理DAO的类
 */
public class ProductDao extends HibernateDaoSupport{

	/**
	 * DAO中保存商品的方法
	 */
	public void save(Product product){
		System.out.println("DAO中save方法執行了");
		this.getHibernateTemplate().save(product);
	}
}
