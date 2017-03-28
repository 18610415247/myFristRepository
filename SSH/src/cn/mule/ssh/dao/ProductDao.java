package cn.mule.ssh.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.mule.ssh.domain.Product;

/**
 * ��Ʒ����DAO����
 */
public class ProductDao extends HibernateDaoSupport{

	/**
	 * DAO�б�����Ʒ�ķ���
	 */
	public void save(Product product){
		System.out.println("DAO��save����������");
		this.getHibernateTemplate().save(product);
	}
}