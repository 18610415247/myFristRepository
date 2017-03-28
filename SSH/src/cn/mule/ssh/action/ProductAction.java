package cn.mule.ssh.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.mule.ssh.domain.Product;
import cn.mule.ssh.service.ProductService;

/**
 * ��Ʒ�����Action��
 */
public class ProductAction extends ActionSupport implements ModelDriven<Product> {
	//ģ�ͅs��ʹ�õ��
	private Product product=new Product();
	
	@Override
	public Product getModel() {
		// TODO Auto-generated method stub
		return product;
	}
	
	
	private ProductService productService;

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	 /**
	  * ������Ʒ�Ĉ��еķ�����save
	  */
	public String save(){
		System.out.println("Action�е�save����������");
		productService.save(product);
		return NONE;
	}
	
}
