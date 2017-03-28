package cn.mule.ssh.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.mule.ssh.domain.Product;
import cn.mule.ssh.service.ProductService;

/**
 * 商品管理的Action类
 */
public class ProductAction extends ActionSupport implements ModelDriven<Product> {
	//模型卻動使用的類
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
	  * 保存商品的執行的方法：save
	  */
	public String save(){
		System.out.println("Action中的save方法執行了");
		productService.save(product);
		return NONE;
	}
	
}
