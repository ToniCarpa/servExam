<%@ page import="model.Usuari" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: a201691ac
  Date: 3/14/23
  Time: 4:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%
    String id = (String) request.getAttribute("id");
    ArrayList<Usuari> listArrayUsuari = (ArrayList<Usuari>) request.getAttribute("listUsuari");
    %>
</head>
<body>
<% for (Usuari m : listArrayUsuari) {%>
<form action="home" method="POST">
    <div class="card-body w-50 center">
        <div class="form-row">
            <div class="form-group col-md-6">
                <input hidden class="form-control" type="text" name="id" value="<%=m.getId()%>">

                <label>Email</label>
                <input type="email" name="mail" class="form-control" <%=m.getEmail()%> value="disabled">
            </div>
            <div  class="form-group col-md-6">
                <label>Password</label>
                <input type="password" name="pass" class="form-control" <%=m.getPassword()%>  value="disabled" >
            </div>
        </div>

        <div class="form-group">
            <label>Address</label>
            <input type="text" name="adres" class="form-control" <%=m.getAdress()%> >
        </div>
        <div class="form-group">
            <label>Address 2</label>
            <input type="text" name="adres2" class="form-control" <%=m.getCity()%> >
        </div>

        <div class="form-row">

            <div class="form-group col-md-6">
                <label>City</label>
                <input type="text" name="city" class="form-control" <%=m.getCity()%> value="disabled">
            </div>

            <div hidden class="form-group col-md-4">
                <label name ="prov">Province</label>
                <select class="form-control">
                    <option selected name="op"><%=m.getProvince()%></option>
                    <option>Barcelona</option>
                    <option>Tarragona</option>
                    <option>Lleida</option>
                    <option>Girona</option>
                </select>
            </div>

            <div class="form-group col-md-2">
                <label>Zip</label>
                <input type="text" name="zip" class="form-control"<%=m.getZip()%>" value="disabled">
            </div>
        </div>

        <div hidden class="form-group">
            <div class="form-check">
                <input  class="form-check-input" name="check" type="checkbox">
                <label  class="form-check-label"> Student </label>
            </div>
        </div>

        <button type="submit" class="btn btn-primary">Save</button>
    </div>
<%}%>

</body>
</html>
