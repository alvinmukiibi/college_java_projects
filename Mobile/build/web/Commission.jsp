
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Commission</title>
        <link rel="stylesheet" href="css/cssdp.css">
    </head>
    <body>
        <jsp:include page="Header.jsp"/>
        <div align="center">
            <ul class="nav">
                <li><a href="/MobileMoney/Menu.jsp">MENU PAGE</a></li>
                <li><a href="/MobileMoney/Cash_float.jsp">CASH & FLOAT</a></li>
                <li><a href="/MobileMoney/Transaction.jsp">TRANSACTION</a></li>
            </ul>
        </div>
        <div id="ale">
            <p><a href="?eachTotal">Check Total Kiosk Commission</a><div>
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

                <sql:query dataSource="${dbcon}" var="mtn">
                    select mtn_total from total_com where agentName="${agent}";
                </sql:query>
                <c:forEach items="${mtn.rows}" var="mt">
                    <c:set var="mtn_t" value="${mt.mtn_total}"/>
                </c:forEach>
                <sql:query dataSource="${dbcon}" var="war">
                    select airtel_total from total_com where agentName="${agent}";
                </sql:query>
                <c:forEach items="${war.rows}" var="wa">
                    <c:set var="warid_t" value="${wa.airtel_total}"/>
                </c:forEach>

                <c:out value="${warid_t+mtn_t}"/>
                <form action="/MobileMoney/Commission.jsp" method="POST">
                    <input type ="text" name="key" placeholder="Kiosk Name" maxlength="20"/>
                    <input type="submit" value="Check" name="submit"/></form>
                    <%
                        } %>
            </div></p>
        <p><a href="?eachMtn">Check Kiosk Mtn Commission</a><div>
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
                select mtn_total from total_com where agentName="${agent}" ;
            </sql:query>
            <c:set var="sum" value="${0}"/>
            <c:forEach items="${chk.rows}" var="val">
                <c:set var="sum"  value="${sum+val.mtn_total}"/>
                <c:set var="mto" value ="${val.mtn_total}"/>
            </c:forEach>  

            <p><c:out value="${sum}"/>



                <sql:setDataSource 
                    var="dbcon" driver="com.mysql.jdbc.Driver"  
                    url="jdbc:mysql://localhost/mobile"  
                    user="root" password=""
                    />
                <sql:query dataSource="${dbcon}" var="m">
                    select mtn_Float from kiosk where agentName='${agent}';
                </sql:query>
                <c:forEach items="${m.rows}" var="t">
                    <c:set var="ft" value="${t.mtn_Float}"/>
                </c:forEach>
                <c:set var="ft"  value="${ft+mto}"/>

                <sql:update dataSource="${dbcon}" var="pp">
                    update kiosk set mtn_Float='${ft}' where agentName='${agent}';
                </sql:update>     
                <sql:query dataSource="${dbcon}" var="n">
                    select mtn_total from total_com where agentName='${agent}';
                </sql:query>
                <c:forEach items="${n.rows}" var="t">
                    <c:set var="ft" value="${t.mtn_total-t.mtn_total}"/>
                </c:forEach>


                <sql:update dataSource="${dbcon}" var="pp">
                    update total_com set mtn_total='${ft}' where agentName='${agent}';
                </sql:update>     




            <form action="/MobileMoney/Commission.jsp"  method='post'><input type='submit' value='Claim to float' name='recMTN' /></form>
                <% } %>
        </div></p>
    <p><a href="?eachWarid">Check Kiosk Airtel Commission</a><div>
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
            select airtel_total from total_com where agentName="${agent}";
        </sql:query>
        <c:set var="sum" value="${0}"/>
        <c:forEach items="${chk.rows}" var="val">
            <c:set var="sum"  value="${sum+val.airtel_total}"/>
            <c:set var="ato"  value="${val.airtel_total}"/>
        </c:forEach>   
        <c:out value="${sum}"/>
        <form action="/MobileMoney/Commission.jsp"  method='post'><input type='submit' value='Claim to float' name='recAIRTEL' /></form>

        <sql:setDataSource 
            var="dbcon" driver="com.mysql.jdbc.Driver"  
            url="jdbc:mysql://localhost/mobile"  
            user="root" password=""
            />
        <sql:query dataSource="${dbcon}" var="m">
            select warid_Float from kiosk where agentName='${agent}';
        </sql:query>
        <c:forEach items="${m.rows}" var="t">
            <c:set var="ft" value="${t.warid_Float}"/>

        </c:forEach>
        <c:set var="ft"  value="${ft+ato}"/>

        <sql:update dataSource="${dbcon}" var="pp">
            update kiosk set warid_Float='${ft}' where agentName='${agent}';
        </sql:update>     
        <sql:query dataSource="${dbcon}" var="p">
            select airtel_total from total_com where agentName='${agent}';
        </sql:query>
        <c:forEach items="${p.rows}" var="t">
            <c:set var="ft" value="${t.airtel_total-t.airtel_total}"/>
        </c:forEach>


        <sql:update dataSource="${dbcon}" var="pp">
            update total_com set airtel_total='${ft}' where agentName='${agent}';
        </sql:update>  
        <%
            } %>
    </div></p>
<p><a href="?allTotal">Check Total Commission (all kiosks)</a><div>
    <%

        if (request.getParameter("allTotal") != null) {


    %>
    <sql:setDataSource 
        var="dbcon" driver="com.mysql.jdbc.Driver"  
        url="jdbc:mysql://localhost/mobile"  
        user="root" password=""
        />
    <sql:query dataSource="${dbcon}" var="chk">
        select mtn_total from total_com;
    </sql:query>
    <c:set var="sum" value="${0}"/>
    <c:forEach items="${chk.rows}" var="val">
        <c:set var="sum"  value="${sum+val.mtn_total}"/>
    </c:forEach>  
    <sql:query dataSource="${dbcon}" var="chp">
        select airtel_total from total_com;
    </sql:query>
    <c:set var="sum2" value="${0}"/>
    <c:forEach items="${chp.rows}" var="val2">
        <c:set var="sum2"  value="${sum2+val2.airtel_total}"/>
    </c:forEach>  
    <c:out value="${sum+sum2}"/>

    <%        }


    %>



    <p>You are logged in as <%=session.getAttribute("username").toString()%>   </p>
    <button onclick="location.href = 'LogOut.jsp'" title="Log Out">Log Out</button>
</div></p>
<p>                     

    </body>
    </html>
