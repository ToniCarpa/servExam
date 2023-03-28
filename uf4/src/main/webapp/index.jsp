<%@ page import="model.Usuari" %>
<%@ page import="java.util.ArrayList" %>
<!doctype html>
<html lang="en">
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

    <style>
        .center {
            display: block;
            margin-left: auto;
            margin-right: auto;
        }
    </style>

    <%
        String id = (String) request.getAttribute("id");
        ArrayList<Usuari> listArrayUsuari = (ArrayList<Usuari>) request.getAttribute("listUsuari");
    %>

</head>
<body>
<form action="home" method="POST">
    <div class="card-body w-50 center">
        <div class="form-row">
            <div class="form-group col-md-6">
                <label>Email</label>
                <input hidden class="form-control" type="text" name="id" value="<%=id%>">
                <input type="email" name="mail" class="form-control" placeholder="Email">
            </div>
            <div class="form-group col-md-6">
                <label>Password</label>
                <input type="password" name="pass" class="form-control" placeholder="Password">
            </div>
        </div>
        <div class="form-group">
            <label>Address</label>
            <input type="text" name="adres" class="form-control" placeholder="1234 Main St">
        </div>
        <div class="form-group">
            <label>Address 2</label>
            <input type="text" name="adres2" class="form-control" placeholder="Apartment, studio, or floor">
        </div>
        <div class="form-row">
            <div class="form-group col-md-6">
                <label>City</label>
                <input type="text" name="city" class="form-control">
            </div>
            <div class="form-group col-md-4">
                <label name ="prov">Province</label>
                <select class="form-control">
                    <option selected>Choose...</option>
                    <option>Barcelona</option>
                    <option>Tarragona</option>
                    <option>Lleida</option>
                    <option>Girona</option>
                </select>
            </div>
            <div class="form-group col-md-2">
                <label>Zip</label>
                <input type="text" name="stu" class="form-control">
            </div>
        </div>
        <div class="form-group">
            <div class="form-check">
                <input class="form-check-input" type="checkbox">
                <label class="form-check-label">
                    Student
                </label>
            </div>
        </div>
        <button type="submit" class="btn btn-primary">Save</button>
    </div>
</form>
</body>
</html>
