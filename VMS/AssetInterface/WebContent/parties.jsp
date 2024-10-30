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
background: url('https://img.freepik.com/free-photo/creative-background-with-rough-painted-texture_23-2149640567.jpg') no-repeat;
background-size:cover;
color:#fff;
margin-right:0;
margin-left:310px;
margin-top:30px;
}
.Party-registration-form{
position:absolute;
top:50%
left:50%
transform: translate(-50%,50%);
width: 350px;
}

.Party-registration-form h1{
font-size:30px;
text-align:center;
text-transform:uppercase;
margin:15px 0px;
}

.Party-registration-form p{
font-size:20px;
margin:10px 0;

}

 .Party-registration-form input{
font-size:15px;
padding:5px 3px;
width:50%
border-radius:3px;

}

.Party-registration-form button{
font-size:18px;
font-weight:bold;
margin:20px 0;
padding:10px 15px;
width:50%;
border-radius:2px;
background-color:#fff;


}

.Party-registration-form button:hover{
color:red;
cursor:pointer;
}


</style>
</head>
<body>
<div class="Party-registration-form">
<h1>Party Registration Form</h1>
<form action="addparty.jsp" method="post">
<p>Party Name:</p>
<input type="text" name="Party Name" placeholder="Party Name">
<button type="submit">Submit</button>
</form>
</div>

</body>
</html>