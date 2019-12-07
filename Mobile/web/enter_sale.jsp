<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Agent</title>
        <link rel="stylesheet" href="css/style.css">
        <style type="text/css">
            h1 {color:cornsilk;font-size: 40pt;width: 80%;  background-color:#4CAF50;padding:40px;border-radius:40px;font-family:Century;}
            .but {background-color:#4CAF50;color:white;border-width:thin;}  
        </style>
        <script type="text/javaScript">
            <!--
            function shout(x)
            {
                alert(x);
            }
            -->
        </script>
    </head>
    <body>
    <center>
        <h1 align="center" >HONGERA CHILDREN'S CLOTHING</h1></center>
    <div class="container">  
        <form id="contact" action="/Mobile/enter_sale.jsp" method="post">
            <h3>Register Sales Person</h3>
            <h4>Enter the fields below</h4>
            <fieldset>
                
                <input placeholder="Item" list="datalist1" name="item" type="text" tabindex="1"   required autofocus>
                <datalist id="datalist1">
                    <option value="plates">Plates</option>
                    <option value="Cups">Cups</option>
                    
                    
                </datalist>
            </fieldset>
            <fieldset>
                <input placeholder="Quantity" name="qty" type="text" tabindex="1"   required autofocus>
            </fieldset>
            <fieldset>
                <input placeholder="Price(@)" name="price" type="text" tabindex="1"   required autofocus>
            </fieldset>
            <fieldset>
                <input placeholder="Total" name="tot" type="text" tabindex="1"   required autofocus>
            </fieldset>
             <fieldset>
                <input placeholder="Date" name="date" type="date" tabindex="1"   required autofocus>
            </fieldset>
            
            <fieldset>
                <button name="submit" value="enter" type="submit" id="contact-submit" data-submit="...Sending">Enter Sale</button>
                
            </fieldset>
        </form>
        <center> <p>You are logged in as <%=session.getAttribute("username").toString()%>   </p>
            <button class="but" onclick="location.href = 'LogOut.jsp'" title="Log Out">Log Out</button></center>
    </body>
    <sql:setDataSource 
        var="dbcon" driver="com.mysql.jdbc.Driver"  
        url="jdbc:mysql://localhost/mobile"  
        user="root" password=""
        />
    <%
        String check = request.getParameter("submit");
        if (check != null && check.equals("enter")) {
    %>
    <sql:update dataSource="${dbcon}" var="insert">
        insert into sales set item = '<%= request.getParameter("item")%>',
        qty = '<%= request.getParameter("qty")%>',
        price = '<%= request.getParameter("price")%>',
        total= '<%= request.getParameter("tot")%>',
        date = '<%= request.getParameter("date")%>',
        agent = '<%=session.getAttribute("username").toString()%>'
        ;
    </sql:update>
    

  
<script type="text/javascript">
    shout("Sale recorded);
    window.location = '/Mobile/view_sales.jsp';
</script>
<%
    }
%>  









</html>
