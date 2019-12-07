<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cash and Floats</title>
        <link rel="stylesheet" href="css/cssdp.css">
        <style>
            .but {background-color:#4CAF50;color:white;border-width:thin;}  
        </style>
    </head>
    <body>
        <jsp:include page="Header.jsp"/>
        <div align="center">
            <ul class="nav">
                <td><li><a href="/MobileMoney/Menu.jsp">MENU PAGE</a></li></td>
                <td> <li><a href="/MobileMoney/Transaction.jsp">TRANSACTIONS</a></li></td>
                <td><li><a href="/MobileMoney/Commission.jsp">COMMISSION</a></li></td>
            </ul>
        </div>
    <center>
        <fieldset style="width:60%;">
            <legend align="center">SALES PERSON 
            </legend>
            <table border="1" width="850px;">
                <tr>
                    <th>FirstName</th>
                    <th>LastName</th>
                    <th>UserName</th>
                    <th>phoneNo</th>
                    <th>password</th>
                    <th>address</th>
                    <th>referencePerson</th>
                </tr> 
                <sql:setDataSource 
                    var="dbcon" driver="com.mysql.jdbc.Driver"  
                    url="jdbc:mysql://localhost/mobile"  
                    user="root" password=""
                    />
                <sql:query dataSource="${dbcon}" var="get">
                    select * from kiosk;
                </sql:query>
                <c:forEach var="write" items="${get.rows}">
                    <tr>
                        <td><c:out value="${write.FirstName}"/></td>
                        <td><c:out value="${write.LastName}"/></td>
                        <td><c:out value="${write.UserName}"/></td>
                        <td><c:out value="${write.phoneNo}"/></td>
                        <td><c:out value="${write.password}"/></td>
                        <td><c:out value="${write.address}"/></td>
                        <td><c:out value="${write.referencePerson}"/></td>
                    </tr>
                </c:forEach>    
            </table>
        </fieldset>
        
    </center>
                <center> <p>You are logged in as <%=session.getAttribute("username").toString()%>   </p>
                    <button class="but" onclick="location.href = 'LogOut.jsp'" title="Log Out">Log Out</button></center>
</body>
</html>
