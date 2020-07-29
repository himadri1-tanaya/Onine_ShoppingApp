<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
		  	<style>
					table, tr, td{
						 border: 2px solid black;
						 width : 30%;
						 text-align: center;
					}
				</style>
</head>
<body >
   <h2> CART LIST</h2>
    <table>
			<c:forEach var="Product" items="${list }">
				     <form action="PayBill">
				                   
				                    <tr>
				                    
				                    <td>
									<h2><input type="hidden" name="productno" value="${Product.getProductno()}">${Product.getProductno()}</h2>
									  </td>
								         <td>
									<h2><input type="hidden" name="price" value="${Product.getPrice()}">${Product.getPrice()}</h2>
									  </td>
							           <td>
									<h2><input type="hidden" name="quantity"  value="${Product.getQuantity()}">${Product.getQuantity()}</h2>
									  </td>
								        <td>
									<h2><input type="hidden" name="discount"  value="${Product.getDiscount()}">${Product.getDiscount()}</h2>
									  </td>
									  <td>
				                    <h1><input type="hidden" name="details" value="${Product.getDetails()}">${Product.getDetails()}</h1>
				                    </td>
									<td>
									<input type="submit" name="btn" value="PayBill">
									</td>
									</tr>
									
									
						</form>
							
	     </c:forEach>
</table>
</body>
</html>

