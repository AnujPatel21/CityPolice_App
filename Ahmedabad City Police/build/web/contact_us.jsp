<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>Feedback</title>
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
            <a href="home.jsp">Ahmedabad City Police</a>
			<h2><a href="home.jsp">Service . Security . Peace</a></h2>
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
    <div class="content_top" ></div>
    <div id="content">
    	<div id="contact">
       		<div id="left">
                      <br><h3><b>Feedback</b></h3><br>
                <div>
                
                	<div class="clear" style="height: 5px"></div>
                </div>
                <div id="box_form">
                    <form name="feedback" method="post" action="feedback" action="MAILTO: cloud7hackers@gmail.com">
                        <fieldset>                    
                            <div class="form_line"><b>Your Name : </b></div>    <div class="form_line"><input type="text" class="input" name="Name"/></div>
                           <div class="form_line"><b>Your Email :</b> </div> <div class="form_line"><input class="input" name="Email"/></div>
                           <div class="form_line"><b>Phone No : </b></div> <div class="form_line"><input class="input" name="phno"/></div>
                            
                          <div class="form_line"><b>Address :</b> </div> <div class="form_line">
                                <textarea name="add" cols="0" rows="0"></textarea>
                               <div class="form_line"><b>Your View : </b></div> <div class="form_line">
                                    <textarea name="view" cols="0" rows="0"></textarea>
                                    </div>
                            </div><br>
                            <div class="form_line" style="padding-top: 5px;">
                                <input type="submit" class="but_submit" value="Submit" />
                                <input type="button" class="but_submit but_cleare" value="Clear" />
                            </div>
                        </fieldset>
                    </form>
                </div>
                         <br> <br>
                              <br>
                          <div class="clear" style="height: 10px"></div>
                          
                         
                          
                          <h3><b>Your Feedback</b></h3>
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
            out.println("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color='blue'>"+rs.getString(1)+"</font><br>"+
"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font size='3' color='black'><textarea style='color: black; background-color: #E6E6E6'>"+ rs.getString(5)+"</textarea><br><br>");
            out.println("<br>");
           }
           
    out.println("</body> </html>");

    
            pst.close();
            con.close();
           
                     }
            catch(SQLException ex)
            {
                out.println(ex.getMessage());
            }
          
%>
            </div>
       		<div id="right">
            	
                <div class="clear" style="height: 15px"></div>
               
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
