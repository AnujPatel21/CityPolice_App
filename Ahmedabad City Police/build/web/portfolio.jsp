<!DOCTYPE html>
<html lang="en">
<head>
<title>Portfolio</title>
<meta charset="utf-8">
<link type="text/css" rel="stylesheet" href="styles/style.css" />
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
<!--[if IE 6]>
<style>body { behavior: url("styles/ie6-hover-fix.htc"); }</style>
<link type="text/css" rel="stylesheet" href="styles/ie6.css" />
<![endif]-->
<!--[if IE 7]><link type="text/css" rel="stylesheet" href="styles/ie7.css" /><![endif]-->

<style>
table, th, td {
    border: 1px solid #000000;
}
</style>
</head>
<body class="page">
<div id="wrap">
  <div id="header">
    <h1><a href="#">Ahmedabad City Police</a></h1>
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
  
 
  <h2>Registered Users</h2>
  <br>
<TABLE border="1" cellpadding="5" cellspacing="5" width="100%">
   
       
  
   <TR>
      <TH style="text-align:center">User Name</TH>
      <TH style="text-align:center">First Name</TH>
      <TH style="text-align:center">Last Name</TH>
      <TH style="text-align:center">E Mail</TH>
      <TH style="text-align:center">Address</TH>
      <TH style="text-align:center">Zip Code</TH>
      <TH style="text-align:center">Phone Number</TH>
      <TH style="text-align:center">Birthday</TH>
      
   </TR>
   <%@page import="java.util.*" %>
<%@page import="javax.sql.*,java.util.*" %>
<%@page import="java.sql.*" %>
   <%
       try {
               Class.forName("org.apache.derby.jdbc.ClientDriver");
       
           Connection cn = DriverManager.getConnection("jdbc:derby://localhost:1527/city police","abc","abc");
       
       Statement pst=cn.createStatement();
                String q1="select * from users";
            
               ResultSet rs=pst.executeQuery(q1);
          
           while(rs.next())
           {
               out.println("<TR ALIGN='CENTER'>");
               out.println("<TD style='text-align:center'>"+rs.getString(1)+"</TD>");
               out.println("<TD style='text-align:center'>"+rs.getString(3)+"</TD>");
               out.println("<TD style='text-align:center'>"+rs.getString(4)+"</TD>");
               out.println("<TD style='text-align:center'>"+rs.getString(5)+"</TD>");
               out.println("<TD style='text-align:center'>"+rs.getString(6)+"</TD>");
               out.println("<TD style='text-align:center'>"+rs.getInt(7)+"</TD>");
               out.println("<TD style='text-align:center'>"+rs.getInt(8)+"</TD>");
               out.println("<TD style='text-align:center'>"+rs.getString(9)+"</TD>");
               out.println("</TR>");
           }
            pst.close();
            cn.close();
                      
        }
       
       catch(Exception e)
        {
            
            out.println(e);
             
        }
       
       %>

</TABLE>
  <br><br> <br><hr>
  <center> <h2> FEEDBACK </h2></center>
    <%@page import="java.util.*" %>
<%@page import="javax.sql.*,java.util.*" %>
<%@page import="java.sql.*" %>
<%


String derbyURL="jdbc:derby://localhost:1527/city police";
String username="abc";
String password="abc";
Connection con=null;
//PreparedStatement pst=null;
Statement pst;
ResultSet rs=null;
try{
 Class.forName("org.apache.derby.jdbc.ClientDriver");
  con = DriverManager.getConnection(derbyURL,username,password);
 //pst=con.prepareStatement("select * from product");
  pst=con.createStatement();
  
//pst.setString(1,"orchids");
                rs=pst.executeQuery("select * from feedback");
          // rs.next();
           //out.println(rs.getString(1));
           while(rs.next())
           {
               out.println("<center>");
            out.println("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color='blue'>"+rs.getString(1)+"</font><br>"+
"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font size='3' color='black'><textarea style='color: black; background-color: #E6E6E6'>"+ rs.getString(5)+"</textarea><br><br>");
            out.println("<br>");
            out.println("</center>");
           }
           
    

    
            pst.close();
            con.close();
           
                     }
            catch(SQLException ex)
            {
                out.println(ex.getMessage());
            }
          
%>
    



  
  
  
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