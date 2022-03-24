
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="ru.lomov.ee.model.Product" %>
<%@ page import="java.util.List" %>
<html>
<head>
    <title>Product</title>
</head>
<body>
<h1>Cart</h1>
<p>Title: ${product.title}</p>
<p>To be paid</p>
<hr>
<ul>
    <% if (((Product)request.getAttribute("product")).getChildren() != null) %>
    <% for (Product value : (List<Product>) ((Product)request.getAttribute("product")).getChildren()) { %>
    <li>id: <%=value.getId()%>; title: <%=value.getTitle()%>; cost: <%=value.getCost()%></li>
    <% } %>
</ul>
</body>
</html>