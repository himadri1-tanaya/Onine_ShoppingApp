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
<body>

<table border="1" align="center">
      <thead>
         <tr>
            <th>ProductNumber</th>
            <th>ProductDetails</th>
           <th>ProductDiscount</th>
             <th>ProductPrice</th>
             <th>ProductQuantity</th>
         </tr>
      </thead>
     
			
						<tbody>
						<c:forEach var="Product" items="${list }">
							<tr>
								<td>
									<h5><c:out value="${Product.getProductno()}"></c:out></h5>
								</td>
								<td>
									<h5><c:out value="${Product.getDetails()}"></c:out></h5>
								</td>
								<td>
									<h5><c:out value="${Product.getDiscount()}"></c:out></h5>
								</td>	
								<td>
									<h5><c:out value="${Product.getPrice()}"></c:out></h5>
								</td>	
								<td>
									<h5><c:out value="${Product.getQuantity()}"></c:out></h5>
								</td>	
							</tr>
							 </c:forEach>
						</tbody>
	    
</table>

		
</body>
</html>