<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Voting Management System</title>

<style >

body{
background:#00b140;
background-image:url('https://elections.cedarcounty.iowa.gov/global/images/how_do_i_vote.png');
background-repeat:no-repeat;
background-position:center bottom,30%;
background-size:200px,cover;

}

h1{
text-align: center;
padding:50px;
}

button{
margin-right:0px;
margin-left:250px;
margin-top:85px;
padding-left: 10px 0;
width:100px;
border-radius:25px;

}

button:hover{
cursor:pointer;
}

</style>
</head>

<body>
<h1 style="color:White;" >Voting Management System</h1>

<form action="parties.jsp" method="post">

<button type="submit" style="bg-color:grey; border-color:black;">PARTY</button>
</form>
<form action="Voter.jsp" method="post">
<button type="submit" style="bg-color:grey;  border-color:black">USER</button>
</form>



</body>
</html>
