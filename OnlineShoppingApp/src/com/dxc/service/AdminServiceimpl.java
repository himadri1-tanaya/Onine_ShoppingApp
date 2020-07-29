package com.dxc.service;

import java.util.List;

import com.dxc.dao.Admindaoimpl;
import com.dxc.pojos.Customer;
import com.dxc.pojos.Product;


public class AdminServiceimpl 
{
	
		Admindaoimpl dao=new Admindaoimpl();
		public void checkLogin(String id,String password)
		{
			
			System.out.println("test..service");
			dao.checkLogin(id,password);
			
		}
		public void addProduct(Product p)
		{
			dao.addProduct(p);
		}
		public List<Product> getAllProducts() {
			System.out.println("service------------------------");
			return dao.getAllProducts();
		}
		public void addCustomer(Customer c)
		{
			dao.addCustomer(c);
		}
		public boolean findcustomer(int cId) {
			
			return dao.findcustomer(cId);
		}
		public void removecustomer(int i) 
		{
			dao.removecustomer(i);	
		}
		public List<Customer> getAllCustomers() 
		{
		 return dao.getAllCustomers();
		}
	}

