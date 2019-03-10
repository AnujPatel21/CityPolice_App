package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import javax.sql.*;
import java.util.*;
import java.sql.*;

public final class articles_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <!--end header-->\n");
      out.write("  <div id=\"main\">\n");
      out.write("    <div id=\"content\">\n");
      out.write("       \n");
      out.write("\n");
      out.write("\n");
      out.write("   ");

       int i=1;
       try {
               Class.forName("org.apache.derby.jdbc.ClientDriver");
       
           Connection cn = DriverManager.getConnection("jdbc:derby://localhost:1527/city police","abc","abc");
       
       Statement pst=cn.createStatement();
                String q1="select * from lost ";
            
               ResultSet rs=pst.executeQuery(q1);
          
           while(rs.next())
           {
               out.println("<div class='article' >");
               out.println(" <div class='article'>");
               out.println("<h3 class='article-title'>"+rs.getString(5)+"</h3>");
               out.print("<h3 class='article-meta'>"+rs.getString(7)+"</h3>");
               out.println("<p>[ADD ARTICLE OVERVIEW]"+rs.getString(6) +"&raquo;</p>");
               out.print("</div>");
               
               
           }
            pst.close();
            cn.close();
                      
        }
       
       catch(Exception e)
        {
            
            out.println(e);
             
        }
       
       
      out.write(" \n");
      out.write("        \n");
      out.write("        \n");
      out.write("      \n");
      out.write("       \n");
      out.write("        \n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("      <!--end article-->\n");
      out.write("      <div class=\"article-line\"></div>\n");
      out.write("     \n");
      out.write("        <h3 class=\"article-title\"><a href=\"#\">[ADD ARTICLE TITLE]</a></h3>\n");
      out.write("        <h3 class=\"article-meta\">[ADD AUTHOR NAME] / [ADD PUBLICATION DATE]</h3>\n");
      out.write("        <p>[ADD ARTICLE OVERVIEW] <a href=\"#\" class=\"more-link\">Read Full Article &raquo;</a></p>\n");
      out.write("      </div>\n");
      out.write("      <!--end article-->\n");
      out.write("      <div class=\"article-line\"></div>\n");
      out.write("      <div class=\"article\">\n");
      out.write("        <h3 class=\"article-title\"><a href=\"#\">[ADD ARTICLE TITLE]</a></h3>\n");
      out.write("        <h3 class=\"article-meta\">[ADD AUTHOR NAME] / [ADD PUBLICATION DATE]</h3>\n");
      out.write("        <p>[ADD ARTICLE OVERVIEW] <a href=\"#\" class=\"more-link\">Read Full Article &raquo;</a></p>\n");
      out.write("      </div>\n");
      out.write("      <!--end article-->\n");
      out.write("      <div class=\"article-line\"></div>\n");
      out.write("      <div class=\"article\">\n");
      out.write("        <h3 class=\"article-title\"><a href=\"#\">[ADD ARTICLE TITLE]</a></h3>\n");
      out.write("        <h3 class=\"article-meta\">[ADD AUTHOR NAME] / [ADD PUBLICATION DATE]</h3>\n");
      out.write("        <p>[ADD ARTICLE OVERVIEW] <a href=\"#\" class=\"more-link\">Read Full Article &raquo;</a></p>\n");
      out.write("      </div>\n");
      out.write("      <!--end article-->\n");
      out.write("      <div class=\"article-line\"></div>\n");
      out.write("      <div class=\"article\">\n");
      out.write("        <h3 class=\"article-title\"><a href=\"#\">[ADD ARTICLE TITLE]</a></h3>\n");
      out.write("        <h3 class=\"article-meta\">[ADD AUTHOR NAME] / [ADD PUBLICATION DATE]</h3>\n");
      out.write("        <p>[ADD ARTICLE OVERVIEW] <a href=\"#\" class=\"more-link\">Read Full Article &raquo;</a></p>\n");
      out.write("      </div>\n");
      out.write("      <!--end article-->\n");
      out.write("    </div>\n");
      out.write("    <!--end content-->\n");
      out.write("    <div id=\"sidebar\">\n");
      out.write("      <div id=\"hire\">\n");
      out.write("        <h3 class=\"sidebar-title\">Want To Hire [ADD COMPANY NAME]?</h3>\n");
      out.write("        <p>[ADD OVERVIEW]</p>\n");
      out.write("        <a class=\"sidebar-button\" href=\"#\">Contact Us &raquo;</a> </div>\n");
      out.write("      <!--end hire-->\n");
      out.write("      <div id=\"featured-project\">\n");
      out.write("        <h3>Featured Project</h3>\n");
      out.write("        <p>[ADD OVERVIEW]</p>\n");
      out.write("        <div class=\"portfolio-item\"> <a href=\"#\"><img src=\"images/280x200.gif\" alt=\"\" /></a> </div>\n");
      out.write("        <!--end portfolio-item-->\n");
      out.write("        <a class=\"sidebar-button\" href=\"#\">All Projects &raquo;</a> </div>\n");
      out.write("      <!--end recent-projects-->\n");
      out.write("    </div>\n");
      out.write("    <!--end sidebar-->\n");
      out.write("  </div>\n");
      out.write("  <!--end main-->\n");
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
