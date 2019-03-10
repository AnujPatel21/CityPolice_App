package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import javax.sql.*;
import java.util.*;
import java.sql.*;

public final class fir45_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <li><a href=\"articles.jsp\">Lost And Found</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("    <!--end nav-->\n");
      out.write("  </div>\n");
      out.write("    \n");
      out.write("  <!--end header-->\n");
      out.write("  \n");
      out.write(" \n");
      out.write("  <h2>Total Fir</h2>\n");
      out.write("  <br>\n");
      out.write("   \n");
      out.write("\n");
      out.write("\n");
      out.write("   ");

       int i=1;
       try {
               Class.forName("org.apache.derby.jdbc.ClientDriver");
       
           Connection cn = DriverManager.getConnection("jdbc:derby://localhost:1527/city police","abc","abc");
       
       Statement pst=cn.createStatement();
                String q1="select * from fir where policestation='Amraiwadi'";
            
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
       
       
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  <br><br>\n");
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
