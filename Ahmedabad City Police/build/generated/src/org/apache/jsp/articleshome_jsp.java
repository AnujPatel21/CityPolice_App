package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class articleshome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <center><h3> Select the item type \n");
      out.write("                <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <center>\n");
      out.write("            <a href=\"mobile.jsp\"> <img src=\"images/mobile.jpg\"></a>\n");
      out.write("            <br>\n");
      out.write("            <hr>\n");
      out.write("            <br>\n");
      out.write("            <a href=\"car.jsp\"> <img src=\"images/car.jpg\"></a>\n");
      out.write("            <br>\n");
      out.write("            <hr>\n");
      out.write("            <br>\n");
      out.write("            <a href=\"purse.jsp\"> <img src=\"images/purse.jpg\"></a>\n");
      out.write("            <br>\n");
      out.write("            <hr>\n");
      out.write("            <br>\n");
      out.write("            <a href=\"jewellery.jsp\"> <img src=\"images/jewellery.jpg\"></a>\n");
      out.write("            <br>\n");
      out.write("            <hr>\n");
      out.write("            <br>\n");
      out.write("            <a href=\"mobile.jsp\"> <img src=\"images/mobile.jpg\"></a>\n");
      out.write("            <br>\n");
      out.write("            <hr>\n");
      out.write("            <br>\n");
      out.write("            <a href=\"other.jsp\"> <img src=\"images/other.jpg\"></a>\n");
      out.write("            \n");
      out.write("          </h3>\n");
      out.write("            \n");
      out.write("        </center>\n");
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
      out.write("</html>\n");
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
