package com.dxc.controllers;

import java.util.List;

import javax.persistence.Query;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dxc.pojos.Admin;
import com.dxc.pojos.Customer;
import com.dxc.pojos.Product;

import com.dxc.service.AdminServiceimpl;

@Controller
@RequestMapping("/views")
public class AdminController 
{
  AdminServiceimpl service=new AdminServiceimpl();
  String status =" ";
 
  @RequestMapping("/login")
  public String checkLogin(@ModelAttribute Admin a )
  {
	  System.out.println("test...controller");
	  String id=a.getId();
	  String password=a.getPassword();
      service.checkLogin(id,password);
	   return "adminmenu";
  }
  @RequestMapping("/product")
  public String add(@ModelAttribute Product p,Model m)
  {
	  String msg;
	   service.addProduct(p);
	   msg="product added succesfully!!";
	   m.addAttribute("msg", msg);
	   return "msg";
  }
  
  @RequestMapping("/display")

	public String getAllProducts(Model m)
	{
		List<Product> list=service.getAllProducts();
		System.out.println(list);
		m.addAttribute("list", list);
		return "display";
	}
  @RequestMapping("/customer")
  public String addCustomer(@ModelAttribute Customer c,Model m)
  {
	  String msg;
	  service.addCustomer(c);
	  msg="customer added!!!";
	  m.addAttribute("msg",msg);
	  
	  return "message1";
	 
  }
  @RequestMapping("/findcustomer")
	public String find(@RequestParam("customerid") int customerid, Model m, HttpSession session)
	{
		boolean status=true;
		
		session.setAttribute("customerid", customerid);
		
		status=service.findcustomer(customerid);
		String msg;
		
		
		
		if(status==true)
		{
			return "removecustomer";
			
		}
		else 
		{
			msg="customer not found !";
			m.addAttribute("msg", msg);
			return "customernotfound";
		}
	}
  @RequestMapping("/removecustomer")
	public String removecustomer(@ModelAttribute Customer c,Model m)
	{
	  String msg;
		int i=c.getCustomerid();
		service.removecustomer(i);
		msg="customer removed!!!";
		m.addAttribute("msg",msg);
		return "message2";
	}
  @RequestMapping("/displaycustomer")
	public String getAllCustomers(Model m)
	{
		List<Customer> list=service.getAllCustomers();
		m.addAttribute("list", list);
		return "displaycustomer";
	}
	
	
}
 