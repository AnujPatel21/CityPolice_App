<!DOCTYPE html>
<html lang="en">
<head>
<title>Articles</title>
<meta charset="utf-8">
<link type="text/css" rel="stylesheet" href="styles/style.css" />
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
</head>
<body class="page">
<div id="wrap">
  <div id="header">
    <h1><a href="home.jsp">Ahmedabad City Police</a></h1>
    <div id="nav">
      <ul class="menu">
        <li><a href="index.jsp">Home</a></li>
        <li><a href="service.jsp">FIR</a></li>
        <li><a href="portfolio.jsp">User Details</a></li>
        <li><a href="articleshome.jsp">Lost Items</a></li>
        <li><a href="founditem.jsp">Found Items</a></li>
      </ul>
    </div>
    <!--end nav-->
  </div>
  <!--end header-->

  <div id="main">
    <div id="content">
        <div style='float:right;width: 60%'>
        <h1><center>Lost Reports</center></h1>
        </div>
        <br>
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
                String q1="select * from lost where ITEMTYPE = 'Jewellery'";
            
               ResultSet rs=pst.executeQuery(q1);
          
           while(rs.next())
           {
               out.println("<div class='article' >");
               out.println(" <div class='article'>");
               out.println("<b>");
               out.println("<h3 class='article-title'>"+i++ +") Product Details</h3>");
               out.println("<br>");
               out.print("<h3 class='article-meta'> Item name : "+rs.getString(5)+"</h3>");
               out.print("<h3 class='article-meta'> Lost date : "+rs.getString(7)+"</h3>");
               out.print("<h3 class='article-meta'> Price : "+rs.getString(8)+"</h3>");
               out.print("<h3 class='article-meta'> Description : "+rs.getString(6)+"</h3>");
               out.print("<h3 class='article-meta'> Image : </h3>");
               out.println("<img src=images/"+rs.getString(10)+">");
               out.print("<h3 class='article-meta'> Proof : </h3>");
               out.println("<img src=images/"+rs.getString(9)+">");
               out.println("<br>");
               out.println("<br>");
               out.println("<h3 class='article-title'>User Details</h3>");
               out.println("<br>");
               out.println("<h3 class='article-meta'> First name : "+rs.getString(1)+"</h3>");
               out.println("<h3 class='article-meta'> Last name : "+rs.getString(2)+"</h3>");
               out.println("<h3 class='article-meta'> Mobile : "+rs.getString(3)+"</h3>");
               out.println("<h3 class='article-meta'> Address : "+rs.getString(4)+"</h3>");
               
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
     

   
    </div>
  <div id="footer">
      <p>Copyright 2016. <!-- Do not remove -->Designed by Anuj & Vama<!-- end --><br />
            <a href="#">Privacy Policy</a> | <a href="#">Terms of Use</a> </p>
  </div>
  <!--end footer-->
</div>
<!--end wrap-->
<div class="cache-images"> <img src="images/red-button-bg.png" width="0" height="0" alt="" /> </div>
<!--end cache-images-->
</html>