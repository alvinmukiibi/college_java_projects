<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Commission</title>
        <link rel="stylesheet" href="css/cssdp.css">
        <script type="text/javascript">
            function deposit()
            {
                document.getElementById('deposit').innerHTML =
                        "<form method='post' action='php/transact.php'>\n\
                            <label class='innerlabel'>Account No:</lable><br> \n\
                            <input type='text' name='accno' placeholder='Enter the customer Account number' class='innerinput'>\n\
                            <br> \n\
                            <input type='submit' value='GO' class='innersubmit' name='depositbutton'> \n\
                        </form>"
            }
        </script>
        <style type="text/css">
            .btn {
                color:#fff;background-color:#337ab7;border-color:#2e6da4;
                padding:5px 5px;font-size:18px;line-height:1.3333333;border-radius:6px
            }
            .btn:hover{color:#fff;background-color:#286090;border-color:#122b40}
        </style>
    </head>
    <body>
        <jsp:include page="Header.jsp"/>
        <div align="center">
            <ul class="nav">
                <td><li><a href="/MobileMoney/Menu.jsp">MENU PAGE</a></li></td>
                <td> <li><a href="/MobileMoney/Cash_float.jsp">CASH & FLOAT</a></li></td>
                <td><li><a href="/MobileMoney/Transaction.jsp">TRANSACTION</a></li></td>  
            </ul>
        </div>
    <center>
        <fieldset style="width:60%;">
            <div>
                <p><button class="btn"><a class="bri" href="?eachTotal">Check Total Kiosk Commission</a></button></p>

                <p><button class="btn"><a class="bri" href="?eachMtn">Check Kiosk Mtn Commission</a></button></p>
                <p><button class="btn"><a class="bri" href="?eachWarid">Check Kiosk Airtel Commission</a></button></p>
                <p><button class="btn"><a  class="bri"href="?allTotal">Check Total Commission</a></button></p>
                <p>
                <div>
                    <%

                        if (request.getParameter("eachTotal") != null) {
                    %>
                    <form action="/MobileMoney/Commission.jsp" method="POST">
                        <input type ="text" name="key" placeholder="Kiosk Name" maxlength="20"/>
                        <input type="submit" value="Check" name="submit"/></form>


                    <% }
                        if (request.getParameter("submit") != null) {

                    %>
                    <sql:setDataSource 
                        var="dbcon" driver="com.mysql.jdbc.Driver"  
                        url="jdbc:mysql://localhost/mobile"  
                        user="root" password=""
                        />
                    <sql:query dataSource="${dbcon}" var="wht">
                        select agentName from kiosk where name='<%=request.getParameter("key")%>';
                    </sql:query>
                    <c:forEach items="${wht.rows}" var="whh">
                        <c:set var="agent" value="${whh.agentName}"/>
                    </c:forEach>

                    <sql:query dataSource="${dbcon}" var="chk">
                        select commission from transaction where agent_Name="${agent}";
                    </sql:query>
                    <c:set var="sum" value="${0}"/>
                    <c:forEach items="${chk.rows}" var="val">
                        <c:set var="sum"  value="${sum+val.commission}"/>
                    </c:forEach>   
                    <c:out value="${sum}"/>
                    <%
                        } %>
                </div>
                <div>
                    <%

                        if (request.getParameter("eachMtn") != null) {
                    %>
                    <form action="/MobileMoney/Commission.jsp" method="POST">
                        <input type ="text" name="key" placeholder="Kiosk Name" maxlength="20"/>
                        <input type="submit" value="Check" name="submi"/></form>


                    <% }
                        if (request.getParameter("submi") != null) {

                    %>
                    <sql:setDataSource 
                        var="dbcon" driver="com.mysql.jdbc.Driver"  
                        url="jdbc:mysql://localhost/mobile"  
                        user="root" password=""
                        />
                    <sql:query dataSource="${dbcon}" var="wht">
                        select agentName from kiosk where name='<%=request.getParameter("key")%>';
                    </sql:query>
                    <c:forEach items="${wht.rows}" var="whh">
                        <c:set var="agent" value="${whh.agentName}"/>
                    </c:forEach>

                    <sql:query dataSource="${dbcon}" var="chk">
                        select commission from transaction where agent_Name="${agent}" and kiosk_fonNum like '%078_%';;
                    </sql:query>
                    <c:set var="sum" value="${0}"/>
                    <c:forEach items="${chk.rows}" var="val">
                        <c:set var="sum"  value="${sum+val.commission}"/>
                    </c:forEach>   
                    <c:out value="${sum}"/>
                    <%
                        } %>
                </div>
                <div>
                    <%

                        if (request.getParameter("eachWarid") != null) {
                    %>
                    <form action="/MobileMoney/Commission.jsp" method="POST">
                        <input type ="text" name="key" placeholder="Kiosk Name" maxlength="20"/>
                        <input type="submit" value="Check" name="subm"/></form>


                    <% }
                        if (request.getParameter("subm") != null) {

                    %>
                    <sql:setDataSource 
                        var="dbcon" driver="com.mysql.jdbc.Driver"  
                        url="jdbc:mysql://localhost/mobile"  
                        user="root" password=""
                        />
                    <sql:query dataSource="${dbcon}" var="wht">
                        select agentName from kiosk where name='<%=request.getParameter("key")%>';
                    </sql:query>
                    <c:forEach items="${wht.rows}" var="whh">
                        <c:set var="agent" value="${whh.agentName}"/>
                    </c:forEach>

                    <sql:query dataSource="${dbcon}" var="chk">
                        select commission from transaction where agent_Name="${agent}" and kiosk_fonNum like '%075_%';;
                    </sql:query>
                    <c:set var="sum" value="${0}"/>
                    <c:forEach items="${chk.rows}" var="val">
                        <c:set var="sum"  value="${sum+val.commission}"/>
                    </c:forEach>   
                    <c:out value="${sum}"/>
                    <%
                        } %>
                </div>

                <div>
                    <%

                        if (request.getParameter("allTotal") != null) {


                    %>
                    <sql:setDataSource 
                        var="dbcon" driver="com.mysql.jdbc.Driver"  
                        url="jdbc:mysql://localhost/mobile"  
                        user="root" password=""
                        />
                    <sql:query dataSource="${dbcon}" var="chk">
                        select commission from transaction;
                    </sql:query>
                    <c:set var="sum" value="${0}"/>
                    <c:forEach items="${chk.rows}" var="val">
                        <c:set var="sum"  value="${sum+val.commission}"/>
                    </c:forEach>   
                    <c:out value="${sum}"/>
                    <%                              }%>
                    <p>You are logged in as <%=session.getAttribute("username").toString()%>   </p>
                    <button onclick="location.href = 'LogOut.jsp'" title="Log Out">Log Out</button>
                </div>

        </fieldset></center></body>
</html>
