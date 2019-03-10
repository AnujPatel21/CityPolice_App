<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>Area Police Station</title>
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
            <a href="#">Ahmedabad City Police</a>
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
    <!-- header ends -->
    <!-- content -->
    <div>
    <div class="content_top" ></div>
    <div id="content">
        <div>
            <br>
            <center><font size="6">FOUND ITEMS</font></center>
            <br>
<%@page import="java.util.*" %>
<%@page import="javax.sql.*,java.util.*" %>
<%@page import="java.sql.*" %>
   <%
       int i=1;
       try {
               Class.forName("org.apache.derby.jdbc.ClientDriver");
       
           Connection cn = DriverManager.getConnection("jdbc:derby://localhost:1527/city police","abc","abc");
       
       Statement pst=cn.createStatement();
                String q1="select * from founditems";
            
               ResultSet rs=pst.executeQuery(q1);
          
           while(rs.next())
           {
               out.println("<div class='article' >");
               out.println(" <div class='article'>");
               out.println("<b>");
               out.println("<h3>"+i++ +") Product Details</h3>");
               out.println("<br>");
               out.println("<img src=images/"+rs.getString(1)+">");
               out.print("<h2>Item Description : "+rs.getString(2)+"</h2>");
               out.println("<br>");
               out.print("<h2>Location : "+rs.getString(3)+"</h2>");
               out.println("<br>");
               out.print("<h2>Date : "+rs.getString(4)+"</h2>");
               out.println("<br>");
              
               out.println("<h3>Other Details</h3>");
               out.println("<br>");
               out.println("<h2> First name : "+rs.getString(5)+"</h2>");
               out.println("<br>");
               out.println("<h2> Last name : "+rs.getString(6)+"</h2>");
               out.println("<br>");
               out.println("<h2> Mobile : "+rs.getString(7)+"</h2>");
               
               out.println("<hr>");
               out.println("<br>");
               
               
           }
            pst.close();
            cn.close();
                      
        }
       
       catch(Exception e)
        {
            
            out.println(e);
             
        }
       
       %> 
       <br>
        
                                        </div>        
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



