<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
table, tr, td {
	border: 2px solid black;
	width: 30%;
	text-align: center;
}
</style>
</head>

		
	<h2>PAYMENTPAGE</h2>
	<table>
		<form action="confirmpaybill">
<!-- int productno, double price, int quantity, double discount, String details -->
			
			<h2>
				Product Id - <input type="hidden" name="productno"
					value="${Product.getProductno()}">${Product.getProductno()}</h2>
			<h2>
				Product Cost - <input type="hidden" name="price"
					value="${Product.getPrice()}">${Product.getPrice()}</h2>
			<h2>
				Product Quantity - <input type="hidden" name="quantity"
					value="${Product.getQuantity()}">${Product.getQuantity()}</h2>
			<h2>
				Discount - <input type="hidden" name="discount"
					value="${Product.getDiscount()}">${Product.getDiscount()}</h2>
					
			<c:set var="cost" value="${Product.getPrice()}"></c:set>
			<c:set var="quant" value="${Product.getQuantity()}"></c:set>
			<c:set var="discount" value="${Product.getDiscount()}"></c:set>
			<c:set var="totalcost" value="${cost*quant}"></c:set>
			<c:set var="finalcost" value="${totalcost-discount}"></c:set>
			<h2>
				Total Amount - <input type="hidden" name="finalcost" value="${finalcost}">${finalcost}</h2>
			<input type="submit" name="btn" value="confirmpaybill">
		</form>
	</table>
</body>
</html>