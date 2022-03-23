
<html>
<head>
    <title>Category</title>
</head>
<body>
<h1>TV</h1>
<p>Brand: ${televisor.brand}</p>
<p>Diagonal: ${televisor.diagonal}</p>
<p>Televisor</p>
<hr>
<ul>
    <% if (((Televisor)request.getAttribute("televisor")).getChildren() != null) %>
    <% for (Televisor value : (List<Televisor>) ((Televisor)request.getAttribute("televisor")).getChildren()) { %>
    <li>brand: <%value.getBrand()%>; diagonal: <%value.getValue()%></li>
    <% } %>
</ul>
</body>
</html>