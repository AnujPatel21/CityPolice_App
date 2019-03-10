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
   
    <div>
    <div class="content_top" ></div>
    <div id="content">
        <div><br>
<%@page import="java.util.*" %>
<%@page import="javax.sql.*,java.util.*" %>
<%@page import="java.sql.*" %>
<%

 String username=null;
           String Password=null;
           String uname=null;
           String password=null;
           HttpSession s1= request.getSession();
           s1.setAttribute("message", "Please Login");
        
        try {
               Class.forName("org.apache.derby.jdbc.ClientDriver");
       
           Connection cn = DriverManager.getConnection("jdbc:derby://localhost:1527/city police","abc","abc");
            s1.setAttribute("message", "Please Login");
          
            uname=(request.getParameter("username"));
            password=(request.getParameter("password"));
           
         Statement pst=cn.createStatement();
                String q1="select Uname,Password from users where Uname='"+uname+"'and Password='"+password+"'";
              //  String q1="select Uname,Password from users";
               ResultSet rs=pst.executeQuery(q1);
          
           while(rs.next())
           {
               username=rs.getString(1);
               Password=rs.getString(2);
           }
               
s1.setAttribute("message", "Please Login");
           if(username.equals(uname) && Password.equals(password))
           {
               System.out.println("hi");
               RequestDispatcher rd=request.getRequestDispatcher("serviceshome.jsp");
                rd.forward(request,response);
                s1.setAttribute("message", "Please Login");
                HttpSession s2=request.getSession(true);
                s2.setAttribute("username", uname);
                
           } 
           else
           {
               s1.setAttribute("message", "Sorry wrong username or password");
                RequestDispatcher rd=request.getRequestDispatcher("signin.jsp");
                rd.forward(request,response);
               
           }
           pst.close();
            cn.close();
                      
        }
        
        catch(Exception e)
        {
            
            
            
            s1.setAttribute("message", "Sorry wrong username or password");
            
            RequestDispatcher rd=request.getRequestDispatcher("signin.jsp");
                rd.forward(request,response);
             
        }
        
        
        
    

            %>
<br></div>        
<div class="clear" style="height: 20px;"></div>
        </div>
    </div>
     <div class="content_bot" ></div>
	<div id="footer">
        <div id="footer_box1">
            <p>Copyright 2016. <!-- Do not remove -->Designed by Anuj & Vama<!-- end --><br />
            <a href="#">Privacy Policy</a> | <a href="#">Terms of Use</a> </p>
        </div>
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
