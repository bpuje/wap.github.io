<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Date"%>
<%@ page import="java.text.SimpleDateFormat" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Directive - page, include, taglib</title>

    <span style="color: red; font-size: 12px;"></span>>

</head>
<body>
<%
    System.out.println("Evaluating date now");
    Date dNow = new Date();
    SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd'at'hh:mm:ss a zzz");
    System.out.println("Current Date: " + ft.format(dNow));
%>
<ct:currentDateTime color="red" size="12px" />

Hello! The time is now
<%=dNow%>


</body>
</html>