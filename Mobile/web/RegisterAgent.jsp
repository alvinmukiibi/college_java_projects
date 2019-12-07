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
        <form id="contact" action="/MobileMoney/RegisterAgent.jsp" method="post">
            <h3>Register Sales Person</h3>
            <h4>Enter the fields below</h4>
            <fieldset>
                <input placeholder="Firstname" name="username" type="text"tabindex="1"   required autofocus>
            </fieldset>
            <fieldset>
                <input placeholder="Lastname" name="name" type="text"tabindex="1"   required autofocus>
            </fieldset>
            <fieldset>
                <input placeholder="Username" name="uname" type="text"tabindex="1"   required autofocus>
            </fieldset>
            <fieldset>
                <input placeholder="Phone Number" name="no" type="text" maxlength="10" tabindex="3" required>
            </fieldset>
            <fieldset>
                <input placeholder="Assigned Password"readonly value="1234" maxlength="10" name="pwd" type="text" tabindex="4" required>
            </fieldset>
            <fieldset>
                <input placeholder=" Address" name="address" type="text" tabindex="2" required>
            </fieldset>
            
            <fieldset>
                <input placeholder="Reference Person" name="refname" type="text" tabindex="8" required>
            </fieldset>
            <fieldset>
                <button name="submit" value="make" type="submit" id="contact-submit" data-submit="...Sending">Add SalesPerson</button>
                <button name="submit" value="skipp" type="submit" id="contact-submit" onClick="location.href = 'Menu.jsp'" data-submit="...Sending">Skip</button>
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
        if (check != null && check.equals("make")) {
    %>
    <sql:update dataSource="${dbcon}" var="insert">
        insert into kiosk set FirstName = '<%= request.getParameter("username")%>',
        LastName = '<%= request.getParameter("name")%>',
        UserName = '<%= request.getParameter("uname")%>',
        phoneNo= '<%= request.getParameter("no")%>',
        password = '<%= request.getParameter("pwd")%>',
        address = '<%= request.getParameter("address")%>',
        referencePerson= '<%= request.getParameter("refname")%>';
    </sql:update>
    <sql:update dataSource="${dbcon}" var="ins">
        insert into user set username='<%= request.getParameter("uname")%>',
        status='agent',password='<%= request.getParameter("pwd")%>';
    </sql:update>

<%--sql:update dataSource="${dbcon}" var="inss">
    insert into total_com set kiosk='<%= request.getParameter("kioskName")%>',
    agentName = '<%= request.getParameter("username")%>',
    mtn_total = '0',
    airtel_total = '0',
    total = '0';
</sql:update--%>       
<script type="text/javascript">
    shout("Agent successfully added");
    window.location = '/MobileMoney/Menu.jsp';
</script>
<%
    }
%>  









</html>
