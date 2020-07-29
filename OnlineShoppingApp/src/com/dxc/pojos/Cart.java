package com.dxc.pojos;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cart 
{
	@Id
 private int id;
 private int cId;
 private int productno;
 
 
 public Cart()
 {
	 
 }


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}




public int getcId() {
	return cId;
}


public void setcId(int cId) {
	this.cId = cId;
}


public int getProductno() {
	return productno;
}


public void setProductno(int productno) {
	this.productno = productno;
}


@Override
public String toString() {
	return "Cart [id=" + id + ", cId=" + cId + ", productno=" + productno + "]";
}


}
