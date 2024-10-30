<%@ page import="main.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Voting Management system</title>
<style>
body{
background: url('https://img.freepik.com/free-photo/creative-background-with-rough-painted-texture_23-2149640567.jpg');
background-size:cover;
color:#fff;
}

</style>
</head>
<body>
<%

String Partyname=request.getParameter("Party Name");
Parties p=new PartiesProxy().getParties();
String result=p.getPartyinfo(Partyname);







%>
<p><%=result %></p>
</body>
</html>