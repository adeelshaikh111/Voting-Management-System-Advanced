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

String Fullname=request.getParameter("Full Name");
String Cnic=request.getParameter("cnic");
String Qualification=request.getParameter("Qualification");
String Statenumber=request.getParameter("State Number");
String organization=request.getParameter("Organization");
String post=request.getParameter("Post");

Voter service=new VoterProxy().getVoter();
service.voter(Fullname, Cnic, Qualification, Statenumber, organization, post);



%>
<p>Data Successfully stored!</p>
</body>
</html>