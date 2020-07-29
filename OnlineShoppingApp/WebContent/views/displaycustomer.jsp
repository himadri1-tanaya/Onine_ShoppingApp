<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>

<table border="1" align="center">
   <thead>
       <tr>
           <th>CustomerId</th>
            <th>CustomerName</th>
           <th>password</th>
       <th>balance</th>
       </tr>
   </thead>
			<c:forEach var="Customer" items="${list }">
						<tbody>
							<tr>
								<td>
									<h5><c:out value="${Customer.getCustomerid()}"></c:out></h5>
								</td>
								<td>
									<h5><c:out value="${Customer.getCustomername()}"></c:out></h5>
								</td>
								<td>
									<h5><c:out value="${Customer.getPassword()}"></c:out></h5>
								</td>	
								
								<td>
									<h5><c:out value="${Customer.getBalance()}"></c:out></h5>
								</td>	
							</tr>
						</tbody>
	     </c:forEach>
	     </table>
		
	
		
</body>
</html>
