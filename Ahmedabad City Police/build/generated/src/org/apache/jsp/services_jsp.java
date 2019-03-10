package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class services_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title>Ahmedabad City Police</title>\n");
      out.write("<meta name=\"keywords\" content=\"\" />\n");
      out.write("<meta name=\"description\" content=\"\" />\n");
      out.write("<script type=\"text/javascript\" src=\"jquery/cufon-yui.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"jquery/Book_Antiqua_400.font.js\"></script>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        Cufon.replace ('h1')('h2')('h3')('h4')('#logo a')('#buttons a')('#box2_all .box_left');\n");
      out.write("    </script>\n");
      out.write("<link href=\"styles.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div id=\"main\">\n");
      out.write("    <!-- header begins -->\n");
      out.write("    <div id=\"header\">\n");
      out.write("        <div id=\"logo\">\n");
      out.write("            <a href=\"#\">Ahmedabad City Police</a>\n");
      out.write("\t\t\t<h2><a href=\"#\">Service . Security . Peace</a></h2>\n");
      out.write("        </div>\n");
      out.write("       <div id=\"buttons\">\n");
      out.write("            <a href=\"home.jsp\" class=\"but\"  title=\"\">Home</a><div class=\"but_razd\"></div>\n");
      out.write("            <a href=\"about_us.jsp\" class=\"but\" title=\"\">About Us</a><div class=\"but_razd\"></div>\n");
      out.write("            <a href=\"police.jsp\"  class=\"but\" title=\"\">Area Police Stations</a><div class=\"but_razd\"></div>\n");
      out.write("            <a href=\"services.jsp\"  class=\"but\" title=\"\">Services</a><div class=\"but_razd\"></div>\n");
      out.write("            <a href=\"contact_us.jsp\" class=\"but\" title=\"\">Feedback</a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- header ends -->\n");
      out.write("    <!-- content -->\n");
      out.write("    <div class=\"content_top\" ></div>\n");
      out.write("    <div id=\"content\">\n");
      out.write("    \t<div id=\"products\">\n");
      out.write("<div class=\"left\">\n");
      out.write("                    <h3>To access our services you must have a valid account</h3><br> \n");
      out.write("                        <h2>==>  Our services include : </h2><br>\n");
      out.write("                         <ul>\n");
      out.write("                            <li>Lodging a FIR</li><br>\n");
      out.write("                            <li>View lost items</li><br>\n");
      out.write("                            <li>Making a lost report</li>\n");
      out.write("                        </ul>\n");
      out.write("                 \n");
      out.write("                        <br><br>\n");
      out.write("                            <h2> ==>    If you are a new user please \n");
      out.write("                                \n");
      out.write("                                <a href=\"signup.jsp\">&nbsp;Sign Up</a></h2>\n");
      out.write("                            <br><br>\n");
      out.write("                                <h2>==>    Existing user Then Please ??\n");
      out.write("                           \n");
      out.write("                             <a href=\"signin.jsp\">&nbsp;Sign In </a>   \n");
      out.write("                             \n");
      out.write("                             <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>\n");
      out.write("                             </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div class=\"clear\" style=\"height: 20px;\"></div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"content_bot\" ></div>\n");
      out.write("\t<div id=\"footer\">\n");
      out.write("        <div id=\"footer_box1\">\n");
      out.write("            <p>Copyright 2016. <!-- Do not remove -->Designed by Anuj & Vama<!-- end --><br />\n");
      out.write("            <a href=\"#\">Privacy Policy</a> | <a href=\"#\">Terms of Use</a> </p>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"footer_box2\">\n");
      out.write("            <a href=\"#\"><img src=\"images/f5.png\" class=\"footer_img\" alt=\"\" /></a>\n");
      out.write("            <a href=\"#\"><img src=\"images/f4.png\" class=\"footer_img\" alt=\"\" /></a>\n");
      out.write("            <a href=\"\"><img src=\"images/f3.png\" class=\"footer_img\" alt=\"\" /></a>\n");
      out.write("            <a href=\"#\"><img src=\"images/f2.png\" class=\"footer_img\" alt=\"\" /></a>\n");
      out.write("            <a href=\"#\"><img src=\"images/f1.png\" class=\"footer_img\" alt=\"\" /></a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
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
