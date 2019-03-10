package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import javax.sql.*;
import java.util.*;
import java.sql.*;
import java.util.*;
import javax.sql.*;
import java.util.*;
import java.sql.*;

public final class portfolio_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<title>Portfolio</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"styles/style.css\" />\n");
      out.write("<script type=\"text/javascript\" src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js\"></script>\n");
      out.write("<!--[if IE 6]>\n");
      out.write("<style>body { behavior: url(\"styles/ie6-hover-fix.htc\"); }</style>\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"styles/ie6.css\" />\n");
      out.write("<![endif]-->\n");
      out.write("<!--[if IE 7]><link type=\"text/css\" rel=\"stylesheet\" href=\"styles/ie7.css\" /><![endif]-->\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("table, th, td {\n");
      out.write("    border: 1px solid #000000;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body class=\"page\">\n");
      out.write("<div id=\"wrap\">\n");
      out.write("  <div id=\"header\">\n");
      out.write("    <h1><a href=\"#\">Ahmedabad City Police</a></h1>\n");
      out.write("    <div id=\"nav\">\n");
      out.write("      <ul class=\"menu\">\n");
      out.write("        <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("        <li><a href=\"service.jsp\">FIR</a></li>\n");
      out.write("        <li><a href=\"portfolio.jsp\">User Details</a></li>\n");
      out.write("      <li><a href=\"articleshome.jsp\">Lost Items</a></li>\n");
      out.write("        <li><a href=\"founditem.jsp\">Found Items</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("    <!--end nav-->\n");
      out.write("  </div>\n");
      out.write("    \n");
      out.write("  <!--end header-->\n");
      out.write("  \n");
      out.write(" \n");
      out.write("  <h2>Registered Users</h2>\n");
      out.write("  <br>\n");
      out.write("<TABLE border=\"1\" cellpadding=\"5\" cellspacing=\"5\" width=\"100%\">\n");
      out.write("   \n");
      out.write("       \n");
      out.write("  \n");
      out.write("   <TR>\n");
      out.write("      <TH style=\"text-align:center\">User Name</TH>\n");
      out.write("      <TH style=\"text-align:center\">First Name</TH>\n");
      out.write("      <TH style=\"text-align:center\">Last Name</TH>\n");
      out.write("      <TH style=\"text-align:center\">E Mail</TH>\n");
      out.write("      <TH style=\"text-align:center\">Address</TH>\n");
      out.write("      <TH style=\"text-align:center\">Zip Code</TH>\n");
      out.write("      <TH style=\"text-align:center\">Phone Number</TH>\n");
      out.write("      <TH style=\"text-align:center\">Birthday</TH>\n");
      out.write("      \n");
      out.write("   </TR>\n");
      out.write("   \n");
      out.write("\n");
      out.write("\n");
      out.write("   ");

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
       
       
      out.write("\n");
      out.write("\n");
      out.write("</TABLE>\n");
      out.write("  <br><br> <br><br> <br><br><br><br><br><br><br>\n");
      out.write("  <center> <h2> FEEDBACK </h2></center>\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");



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
          

      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  <div id=\"footer\">\n");
      out.write("     <p>Copyright 2016. <!-- Do not remove -->Designed by Anuj & Vama<!-- end --><br />\n");
      out.write("            <a href=\"#\">Privacy Policy</a> | <a href=\"#\">Terms of Use</a> </p>\n");
      out.write("  </div>\n");
      out.write("  <!--end footer-->\n");
      out.write("</div>\n");
      out.write("<!--end wrap-->\n");
      out.write("<div class=\"cache-images\"> <img src=\"images/red-button-bg.png\" width=\"0\" height=\"0\" alt=\"\" /> </div>\n");
      out.write("<!--end cache-images-->\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
