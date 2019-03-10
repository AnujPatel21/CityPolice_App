<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>Ahmedabad City Police</title>
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
    <div class="content_top" ></div>
    <div id="content">
    <div id="products">
        <% 
                         HttpSession s2=request.getSession();
                         Object n1=s2.getAttribute("username");
                         String s=(String)n1;
                        
            out.println("<h1><a href='profile.jsp'>"+s+"</a></h1>");      
            
                         %>
            
      
       	<div id="left">
                    
                            <h3>Our Services </h3> 
                            <br>
                <div class="block">
                <div class="left"><br>
                    <img src="images/fir.jpg" alt="" />
                    </div>
                    <div class="right">
                    <h3>First Information Report</h3>
                        <strong> First Information Report (FIR)</strong> is a written document prepared by police organizations in Bangladesh, India, and Pakistan when they receive information about the commission of a cognizable offence. It is generally a complaint lodged with the police by the victim of a cognizable offense or by someone on his or her behalf, but anyone can make such a report either orally or in writing to the police.
                        For a non cognizable offense a Community Service Register is created & registered.<br><br>
                                <strong>To lodge an FIR <h2><br><a href="fir.jsp">Click here</a> </h2>
                                </strong>
                                            
                    </div>
                <div class="clear"></div>
                </div>
                <div class="clear" style="height: 40px;"></div>
                <div class="line"></div>
                <div class="clear" style="height: 40px;"></div>
                <div class="block">
                <div class="left">
                    <img src="images/lost.jpg" alt="" />
                    </div>
                    <div class="right">
                    <h3>Report Something Missing</h3>
                    <br>
                        You can report if have lost something. Police department will try its best to help you find your belongings</br><br>
                    <strong>To lodge a Lost Report <h2><br><a href="lostreport.jsp">Click here</a> </h2></strong>
                    </br>
                    Being a law abiding citizen of India, police department request you to return any item which is found and which is not there belonging<br>
                        <br>
                        <strong>To submit any found item <h2><br><a href="found.jsp">Click here</a> </h2></strong>
                        <br>
                        <strong>To View List Of found Items<h2><br><a href="founditems.jsp">Click Here</a></h2></strong>
                        
                        <br>
                            <br>
                    </div>
                <%-- <form action="logout" method="get">
                        <input type="submit">Logout</input>
</form>--%>
                    
                <div class="clear"></div>
                        <div class="line"></div>
                </div>
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
            <a href=""><img src="images/f3.png" class="footer_img" alt="" /></a>
            <a href="#"><img src="images/f2.png" class="footer_img" alt="" /></a>
            <a href="#"><img src="images/f1.png" class="footer_img" alt="" /></a>
        </div>
    </div>
</body>
</html>

