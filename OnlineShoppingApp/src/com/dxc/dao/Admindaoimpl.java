package com.dxc.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.dxc.pojos.Admin;
import com.dxc.pojos.Customer;
import com.dxc.pojos.Product;


public class Admindaoimpl 
{
	 private static SessionFactory sessionFactory;
	  static
	  {
		 Configuration configuration=new Configuration().configure();
		 sessionFactory=configuration.buildSessionFactory();
	  }
	  public String checkLogin(String id,String password)
	  {
		  System.out.println("test...dao");
		  System.out.println(id+"    "+password);
		  Session session=sessionFactory.openSession();
		  Query query=session.createQuery("from Admin");
		  
		  List<Admin> list = query.getResultList();
		  System.out.println(list);
		  for(Admin l : list)
		  if(l.getId().equals(id) && l.getPassword().equals(password))
		  {
			 return "login successful";
		  }
		  else
		  {
			  return "login failed";
		  }
		return null;
		  
	  }
	  public void addProduct ( Product p)
	  {
		  Session session=sessionFactory.openSession();
		  session.beginTransaction();
		  session.save(p);
		  session.getTransaction().commit();
		  
	  }
	  public List<Product> getAllProducts() 
		{
			Session session=sessionFactory.openSession();
			Query query=session.createQuery("from Product");
			System.out.println("dao ---------"+query);
			return query.getResultList();
			
		}
		 
		   public void addCustomer(Customer c)
	  {
		  Session session=sessionFactory.openSession();
		  session.beginTransaction();
		  session.save(c);
		  session.getTransaction().commit();
	  }
		   public boolean findcustomer(int customerid) 
			{
				Customer c=null;
				Session session=sessionFactory.openSession();
				Query query=session.createQuery("from Customer where cId=:cId");
				query.setParameter("customerid", customerid);
				List<Customer> c1=query.getResultList();
				try {
					c=c1.get(0);
					return true;
				}
				catch(Exception e)
				{
					return false;
				}
				
			} 
		   public void removecustomer(int i) 
			{
				  Session session=sessionFactory.openSession();
				  session.beginTransaction();
				  Query query=session.createQuery("delete from Customer where customerid=:i");
				  query.setParameter("i",i);
				  query.executeUpdate();
				  session.getTransaction().commit();	
			}
		   public List<Customer> getAllCustomers() 
			{
				Session session=sessionFactory.openSession();
				Query query=session.createQuery("from Customer");
				return query.getResultList();	
				
			}
		  
		   


}

