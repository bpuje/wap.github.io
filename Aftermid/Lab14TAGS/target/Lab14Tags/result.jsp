<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2019-09-18
  Time: 21:31
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ page import="java.util.*" %>

<%@ taglib prefix="mytag" uri="/WEB-INF/tld/PjSelect" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<ct:currentDateTime color="red" size="12px" />
<html>
<body>
    <h1 align="center">Beer Recommendations JSP</h1>
    <c:if test="" var="aassdd" scope="session">
        ${aassdd}
    </c:if>
    <c:forEach var="style" items="${styles}" varStatus="counter">
        <p> - ${style}</p>
    </c:forEach>

    <mytag:Head thecolor="${color}" words="Puje 986799"></mytag:Head>




    <span style="color: red; font-size: 12px;">Mon 2016.04.04 at 04:14:09 PM PDT</span>
</body>
</html>



<%--In the Beer Advice Web Application (Chapter 3, Version 3), the result.jsp page (p. 87) uses the following
scripting technique to load the list of suggested beers: --%>

<%--Remove all scripting by using the <c:forEach> tag. Then implement and test the whole Beer Advice Web
Application.--%>