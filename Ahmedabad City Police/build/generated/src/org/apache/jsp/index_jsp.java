package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Home Page</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"styles/style.css\" />\n");
      out.write("<script type=\"text/javascript\" src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js\">\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"hello.css\" />\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body class=\"page\">\n");
      out.write("<div id=\"wrap\">\n");
      out.write("  <div id=\"header\">\n");
      out.write("    <h1><a href=\"#\">Ahmedabad City Police</a></h1>\n");
      out.write("    \n");
      out.write("    <!--end nav-->\n");
      out.write("  </div>\n");
      out.write("  <!--end header-->\n");
      out.write("  <div id=\"featured-section\">\n");
      out.write("      <br>\n");
      out.write("      <br>\n");
      out.write("      <br>\n");
      out.write("      <br>\n");
      out.write("    <div id=\"circles\">\n");
      out.write("        <div class=\"red-circle circle first\"><br><br>\n");
      out.write("          <h2><em><a href=\"service.jsp\">FIR</a></em></h2>\n");
      out.write("      \n");
      out.write("      </div>\n");
      out.write("      <!--end red-circle-->\n");
      out.write("      <div class=\"pink-circle circle\">\n");
      out.write("          <h2><em><br><a href=\"portfolio.jsp\">USER DETAILS <br> & <br> FEEDBACK</a></em></h2>\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("      <!--end red-circle-->\n");
      out.write("      <div class=\"orange-circle circle\">\n");
      out.write("        <h2><em><br><br><a href=\"articleshome.jsp\">LOST REPORT</a></em></h2>\n");
      out.write("       \n");
      out.write("      </div>\n");
      out.write("      <!--end red-circle-->\n");
      out.write("      <div class=\"yellow-circle circle\">\n");
      out.write("        <h2><em><br><br><a href=\"founditem.jsp\">FOUND ITEMS</a></em></h2>\n");
      out.write("       \n");
      out.write("      </div>\n");
      out.write("      <!--end red-circle-->\n");
      out.write("     \n");
      out.write("    </div>\n");
      out.write("    <!--end circles-->\n");
      out.write("    \n");
      out.write("    \n");
      out.write("  \n");
      out.write("  </div>\n");
      out.write(" \n");
      out.write("  <!--end featured-section-->\n");
      out.write("\n");
      out.write("  <div id=\"footer\">\n");
      out.write("      <br><br><br><br><br><br><br><p>Copyright 2016. <!-- Do not remove -->Designed by Anuj & Vama<!-- end --><br />\n");
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
