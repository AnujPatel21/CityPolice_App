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
        <li><a href="articles.jsp">Lost And Found</a></li>
      </ul>
    </div>
    <!--end nav-->
  </div>
    
  <!--end header-->
  
 
  <h2>Total Fir</h2>
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
                String q1="select * from fir where policestation='Ranip'";
            
               ResultSet rs=pst.executeQuery(q1);
          
           while(rs.next())
           {
               out.println("<hr>");
               out.println("<b>"+i++);
               out.print("</b>");
               out.println("<br>");
               out.print("<font size='7'><u>Formal Details</u></font>");
               out.println("<br>");
               out.println("<font size='5'>Date : "+rs.getString(2)+" &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;      Year : "+rs.getInt(3)+"</font>");
               out.println("<br>");
               out.println("<br>");
               out.print("<font size='7'><u>Legal Act</u></font>");
               out.println("<br>");
               out.println("<font size='5'>Act i : "+rs.getString(4));
               out.println("<br>");
               out.println("<font size='5'>Act ii : "+rs.getString(5));
               out.println("<br>");
               out.println("<font size='5'>Act iii : "+rs.getString(6));
               out.println("<br>");
               out.println("<br>");
               out.print("<font size='7'><u>Occurrance Of Offense</u></font>");
               out.println("<br>");
               out.println("<font size='5'>Day : "+rs.getString(7)+" &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;      Date from : "+rs.getString(8)+" &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Date to : "+rs.getString(9)+" &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Time from : "+rs.getString(10)+" &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Time to : "+rs.getString(11)+"</font>");
               out.println("<br>");
               out.println("<br>");
               out.print("<font size='7'><u>Place of Occurrance</u></font>");
               out.println("<br>");
               out.println("<font size='5'>Direction from Police Station : "+rs.getString(12)+" &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;      Distance from police station : "+rs.getString(13)+" &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Place of occurrance : "+rs.getString(14));
               out.println("<br>");
               out.println("<br>");
               out.print("<font size='7'><u>Complainant/Informant</u></font>");
               out.println("<br>");
               out.println("<font size='5'>Name : "+rs.getString(15)+" &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;      Father's name : "+rs.getString(16)+" &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Date of birth : "+rs.getString(17)+" &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Nationality : "+rs.getString(18)+" &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Passport No : "+rs.getString(19)+" &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Address : "+rs.getString(20)+" <br> mobile No : "+rs.getInt(21)+ "</font>");
               out.println("<br>");
               out.println("<hr>");
               
           }
            pst.close();
            cn.close();
                      
        }
       
       catch(Exception e)
        {
            
            out.println(e);
             
        }
       
       %>


  <br><br>



  
  
  
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