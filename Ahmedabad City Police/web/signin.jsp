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
    <br><br>
    <div style="float:right;width: 65%">
         <div class="box111">
              <div><br>
                      <h3><centre>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>Sign In</b></centre></h3>
        
<br></div>  
             <br>  <form name="sign in" action="signupp.jsp">
                     <% 
                         HttpSession s1=request.getSession();
                         Object n1=s1.getAttribute("message");
                         String s=(String)n1;
                         %>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;User Name: &nbsp;&nbsp;<input type="text" name="username" required style="border:1px solid #000000;"> <br><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Password :    &nbsp;&nbsp;&nbsp;&nbsp;<input type="password" name="password" required style="border:1px solid #000000;"> <br> <br><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="SignIn">
&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="Cancel">
    <br>
        <br>
    <%
            out.println("<center>");      
            out.println(s); 
            out.println("</center>");
                         %>
</form>
            </div></div>
<div class="clear" style="height: 20px;"></div>
       
<br><br><br><br><br><br><br><br><br><br><br>
     
            <p>Copyright 2016. <!-- Do not remove -->Designed by Anuj & Vama<!-- end --><br>
            <a href="#">Privacy Policy</a> | <a href="#">Terms of Use</a> </p>
       
        <div id="footer_box2">
            <a href="#"><img src="images/f5.png" class="footer_img" alt="" /></a>
            <a href="#"><img src="images/f4.png" class="footer_img" alt="" /></a>
            <a href="#"><img src="images/f3.png" class="footer_img" alt="" /></a>
            <a href="#"><img src="images/f2.png" class="footer_img" alt="" /></a>
            <a href="#"><img src="images/f1.png" class="footer_img" alt="" /></a>
        </div>
    </div>
    </div>
</body>
</html>
