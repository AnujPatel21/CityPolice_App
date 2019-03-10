<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>Login</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<script type="text/javascript" src="jquery/cufon-yui.js"></script>
    <script type="text/javascript" src="jquery/Book_Antiqua_400.font.js"></script>
    <script type="text/javascript">
        Cufon.replace ('h1')('h2')('h3')('h4')('#logo a')('#buttons a')('#box2_all .box_left');
    </script>
    <script type="text/javascript">

function checkWholeForm(theForm)
{
var why = "";

why += checkname(theForm.username, "user name");
why += checkPassword(theForm.password);
if ( theForm.password.value != theForm.password2.value )
{
why += "The two passwords do not match. Please enter the same password twice.\n";
}
why += checkname(theForm.firstname, "first name");
why += checkname(theForm.lastname, "last name");
why += checkEmail(theForm.email);
why += checkPhone(theForm.phno);
why += checkDate(theForm.dt);

if (why != "")
{
alert(why);
return false;
}
return true;
}

function checkname(fld, name)
{
var val = fld.value;
if ( val.length < 3 || val.length > 10 )
{
fld.focus();
return "You must enter a " + name + " minimum 3 characters long.\n";
}

return "";
}

function checkPassword(fld)
{
var val = fld.value;
if ( val.length < 4 || val.length > 10 )
{
fld.focus();
return "You must enter a password that is atleast 5 characters long.\n";
}

return "";
}
function checkDate(fld)
{
   var re =/^\d{1,2}\/\d{1,2}\/\d{4}$/;


if ( fld.value != '' && !fld.value.match(re)  )
{
fld.focus();
return "Invalid Date format it should be dd/mm/yyyy.\n";
}

return "";
}

function checkEmail(fld)
{
var val = fld.value;
//relational algebra standard for checking the emails
var emailFilter=/^[\w\-\'\.]+\@([\w\-\']+\.)+[a-z]{2,6}$/i;
if ( ! (emailFilter.test(val)) )
{
fld.focus();
return "Please enter a valid email address.\n";
}
return "";
}

function checkPhone(fld)
{
var val = fld.value;

// strip out ALL non-numeric characters
var ph = val.replace(/[^\d]/g, "");


if ( ph.length != 10 )
{
fld.focus();
return "The phone number must contain 10 digits.\n";
}

return "";
}
</script>
<link href="styles.css" rel="stylesheet" type="text/css" />
</head>
<body>
    <div id="main">
    <!-- header begins -->
    <div id="header">
        <div id="logo">
            <centre><a href="#">Ahmedabad City Police</a></centre>
			<h2><a href="#">Service . Security . Peace</a></h2>
        </div>
        <div id="buttons">
            <a href="home.jsp" class="but"  title="">Home</a><div class="but_razd"></div>
            <a href="about_us.jsp" class="but" title="">About Us</a><div class="but_razd"></div>
            <a href="police.jsp"  class="but" title="">Area Police Stations</a><div class="but_razd"></div>
            <a href="services.jsp"  class="but" title="">Services</a><div class="but_razd"></div>
            <a href="contact_us.jsp" class="but" title="">Feedback</a>
        </div>
    </div>
   
    <br>
   
    <div style="float:right;width: 75%">
    
       <div class="box1111">
           <br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<fieldset> 
                   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <br> <legend> <font face="calibri" color="blue" size="6"> <center>FREE SIGNUP </font></legend>  </h1> </center><br>
                       <br><form name="myform" method="post" action="userdetail" onsubmit="return checkWholeForm(this);">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font face="calibri"> UserName <font color="red"> * </font> : &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <input type ="text" name="username" required style="border:1px solid #000000;"/><br><br>
           
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font face="calibri"> Password <font color="red">  * </font> :&nbsp;&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <input type ="password" name="password" required style="border:1px solid #000000;"/><br><br>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font face="calibri"> Confirm Password <font color="red"> * </font> :  <input type="password" name="password2" required style="border:1px solid #000000;" /><br><br>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font face="calibri"> First Name <font color="red"> * </font>: &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <input type ="text" name="firstname" required style="border:1px solid #000000;"/><br><br>
 
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font face="calibri"> Last Name <font color="red"> * </font>: &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <input type ="text" name="lastname" required style="border:1px solid #000000;"/><br><br>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font face="calibri"> Email id <font color="red"> * </font>:  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <input type ="text" name = "email" required style="border:1px solid #000000;"/><br><br>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font face="calibri"> Address <font color="red"> * </font>: &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <textarea name="add" cols="0" rows="0" style="border:1px solid #000000;"></textarea><br><br>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font face="calibri"> Zip Code <font color="red"> * </font>:  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <input type ="text" name = "zipcode" required style="border:1px solid #000000;"/><br><br>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font face="calibri"> Phone No <font color="red"> * </font>:   &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <input type ="text" name = "phno" required style="border:1px solid #000000;"/><br><br>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font face="calibri"> Birth Date : &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <input type="text" name="dt" style="border:1px solid #000000;"> (dd/mm/yyyy)




<br><br>

        <br>

        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type ="submit" value ="Submit"/>
<input type ="reset" value="Reset"/>
Please login after submitting.<br><br>
<p><b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Note</b>: Please make sure your details are correct before submitting form and that all fields &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;marked with <font color="red">* </font> are completed!</p>
</form></div></div>
                   <br>
                       <br>


</fieldset>
</form>
      
<div class="clear" style="height: 20px;"></div>
        
   
   
            <p>Copyright 2016. <!-- Do not remove -->Designed by Anuj & Vama<!-- end --><br />
            <a href="#">Privacy Policy</a> | <a href="#">Terms of Use</a> </p>
       
        <div id="footer_box2">
            <a href="#"><img src="images/f5.png" class="footer_img" alt="" /></a>
            <a href="#"><img src="images/f4.png" class="footer_img" alt="" /></a>
            <a href="#"><img src="images/f3.png" class="footer_img" alt="" /></a>
            <a href="#"><img src="images/f2.png" class="footer_img" alt="" /></a>
            <a href="#"><img src="images/f1.png" class="footer_img" alt="" /></a>
        </div>
    </div>
    
</body>
</html>
