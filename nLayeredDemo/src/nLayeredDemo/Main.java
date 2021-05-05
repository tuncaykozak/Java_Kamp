package nLayeredDemo;

import java.util.ArrayList;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;


public class Main {

	public static void main(String[] args) {
		
		
		/*
		 * int[] sayilar = {1,2,3,4,5};
		 * 
		 * sayilar[5] = 7; // hata verecek
		 * 
		 * ArrayList<Integer> sayilar2 =new ArrayList<Integer>();
		 */
		
		
		//testing
		
		//ToDo: Spring IoC ile cozulecek
		ProductService productService = new ProductManager(new HibernateProductDao()
											,new JLoggerManagerAdapter());
		
		Product product1 =new Product(1,1,"Elma",12,50);
		productService.add(product1);
		
		Product product2 =new Product(2,2,"Armut",12,50);
		productService.add(product2);
		
		System.out.println();
		
		
		ProductService productService2 = new ProductManager(new AbcProductDao()
											,new JLoggerManagerAdapter());
		
		productService2.add(product1);
		productService2.add(product2);
	}

}
