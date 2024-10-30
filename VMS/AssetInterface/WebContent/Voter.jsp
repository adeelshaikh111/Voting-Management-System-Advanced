<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Voting Management System</title>
<style >

*{
padding:0;
margin:0;
font-family:sans-serif;
}
body{
background: url('https://img.freepik.com/free-photo/creative-background-with-rough-painted-texture_23-2149640567.jpg');
background-size:cover;
color:#fff;
margin-right:0;
margin-left:310px;
margin-top:30px;
}
.Voter-registration-forms{
position:absolute;
top:50%
left:50%
transform: translate(-50%,50%);
width: 350px;
}

.Voter-registration-form h1{
font-size:30px;
text-align:center;
text-transform:uppercase;
margin:15px 0px;
}

.Voter-registration-form p{
font-size:20px;
margin:10px 0;

}

 .Voter-registration-form input{
font-size:15px;
padding:15px 5px;
width:100%
border-radius:3px;

}

.Voter-registration-form button{
font-size:18px;
font-weight:bold;
margin:20px 0;
padding:10px 15px;
width:50%;
border-radius:2px;
background-color:#fff;


}

.Voter-registration-form button:hover{
color:red;
cursor:pointer;
}


</style>
</head>
<body>
<div class="Voter-registration-form">
<h1>User Registration Form</h1>
<form action="addvoter.jsp" method="post">
<p>Full Name:</p>
<input type="text" name="Full Name" placeholder="Full Name">
<p> Cnic:</p>
<input type="text" name="cnic" placeholder="Cnic"> 
<p>Qualification:</p>
<input type="text" name="Qualification" placeholder="Qualification">
<p>State Number:</p>
<input type="text" name="State Number" placeholder="State Number:">
<p>Organization:</p>
<input type="text" name="Organization" placeholder="Organization:">
<p>Post:</p>
<input type="text" name="Post" placeholder="Post:">
<button>Submit</button>
</form>
</div>

</body>
</html>