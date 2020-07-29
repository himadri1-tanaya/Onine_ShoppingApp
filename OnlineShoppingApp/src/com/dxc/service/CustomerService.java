package com.dxc.service;

import java.util.List;

import com.dxc.dao.CustomerDao;

import com.dxc.pojos.Cart;
import com.dxc.pojos.Customer;
import com.dxc.pojos.Product;

public class CustomerService 
{
 CustomerDao dao=new CustomerDao();
	
	public boolean loginCustomer(Customer c) 
	{
		return dao.loginCustomer(c);
	}
	
	public void AddToCart(int cid, int productno) 
	{
	dao.AddToCart(cid,productno);	
	}
	
	public List<Product> getAllProducts() {
		
		return dao.getAllProducts();
	}
	
	public List<Product> DisplayCartList(int cid) 
	{
		return dao.DisplayCartList(cid);
	}
	
	public boolean paybill(Product p, double finalcost,int cid, int pno) 
	{
		return dao.paybill(p,finalcost, cid, pno);
	}
	
	public void addmoneytowallet(int cid, double balance) 
	{
	 dao.addmoneytowallet(cid,balance);	
	}
	
	public double showBalance(int customerid)
	   {
		return dao.showBalance(customerid);	
		}

}