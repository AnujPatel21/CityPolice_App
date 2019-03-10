package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import javax.sql.*;
import java.util.*;
import java.sql.*;

public final class mobile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Articles</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"styles/style.css\" />\n");
      out.write("<script type=\"text/javascript\" src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body class=\"page\">\n");
      out.write("<div id=\"wrap\">\n");
      out.write("  <div id=\"header\">\n");
      out.write("    <h1><a href=\"home.jsp\">Ahmedabad City Police</a></h1>\n");
      out.write("    <div id=\"nav\">\n");
      out.write("      <ul class=\"menu\">\n");
      out.write("        <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("        <li><a href=\"service.jsp\">FIR</a></li>\n");
      out.write("        <li><a href=\"portfolio.jsp\">User Details</a></li>\n");
      out.write("        <li><a href=\"articles.jsp\">Lost Items</a></li>\n");
      out.write("        <li><a href=\"founditem.jsp\">Found Items</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("    <!--end nav-->\n");
      out.write("  </div>\n");
      out.write("  <!--end header-->\n");
      out.write("\n");
      out.write("  <div id=\"main\">\n");
      out.write("    <div id=\"content\">\n");
      out.write("        <div style='float:right;width: 60%'>\n");
      out.write("        <h1><center>Lost Reports</center></h1>\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("       \n");
      out.write("       \n");
      out.write("\n");
      out.write("\n");
      out.write("   ");

       int i=1;
       try {
               Class.forName("org.apache.derby.jdbc.ClientDriver");
       
           Connection cn = DriverManager.getConnection("jdbc:derby://localhost:1527/city police","abc","abc");
       
       Statement pst=cn.createStatement();
                String q1="select * from lost where ITEMTYPE = 'Mobile'";
            
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
               out.println("<h3 class='article-meta'> Mobile : "+rs.getInt(3)+"</h3>");
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
       
       
      out.write(" \n");
      out.write("     \n");
      out.write("\n");
      out.write("   \n");
      out.write("    </div>\n");
      out.write("  <div id=\"footer\">\n");
      out.write("      <p>Copyright 2016. <!-- Do not remove -->Designed by Anuj & Vama<!-- end --><br />\n");
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
