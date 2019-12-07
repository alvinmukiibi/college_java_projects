
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>index</title>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
        <link rel="stylesheet" href="css/main.css" />
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
        <header id="header">
            <h1>CHANGE PASSWORD PAGE</h1>
            <p>HONGERA CHILDREN'S CLOTHING </p>
        </header>
        <form id="signup-form" method="post" action="/Mobile/change_pwd.jsp">
            <input type="password" name="password"  placeholder="Password" />
            <input type="password" name="pwd" id="pwd" placeholder="password" />
            <input type="submit" value="Change Password" name ="change" />
        </form>
    </body>
    <%
        if (request.getParameter("change") != null) {
            
            String password = request.getParameter("password");
            String uname = session.getAttribute("username").toString();

   

    %>
    
    
    
   
    <sql:setDataSource 
        var="dbcon" driver="com.mysql.jdbc.Driver"  
        url="jdbc:mysql://localhost/mobile"  
        user="root" password=""
        />
    <sql:update dataSource="${dbcon}" var="rs">update user set password="<%=password%>" where username= "<%=uname%>" </sql:update>
     <script>
        shout("Password Successfully changed");
        window.location = '/Mobile/agent_login.jsp';
        </script>
    
    <%
        
}
    %>
    
    
   <p>You are logged in as <%=session.getAttribute("username")%>   </p>
</html>


