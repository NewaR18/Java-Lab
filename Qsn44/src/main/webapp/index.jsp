<html>
<head>
    <title>CRUD operation</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style>
        body {
            background-color:whitesmoke;
        }
    </style>
</head>
<body><center>
    <h1>Add Student's Data</h1>
    <form action="saveServlet" method="post">
        <table  style="border-collapse: separate; border-spacing: 25px;border-radius: 20px;" >
            <tr><td>Name:</td><td><input type="text" name="name"/></td></tr>
            <tr><td>Address:</td><td><input type="text" name="address"/></td></tr>
            <tr><td>Phone No:</td><td><input type="text" name="phone"/></td></tr><br>
            <tr><td colspan="2" style="text-align: center;"><input type="submit" value="Save Data" style="padding: 8px 20px;box-shadow: 2px 2px 5px #999;"></td></tr>
        </table>   </form>  <br/>
    <form action="viewServlet" method="GET">
        <input type="submit" value="View Data" style="padding: 8px 20px;box-shadow: 2px 2px 5px #999;">
    </form>
</center> </body>
</html>