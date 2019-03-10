package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signinnnnnn_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Area Police Station</title>\n");
      out.write("<meta name=\"keywords\" content=\"\" />\n");
      out.write("<meta name=\"description\" content=\"\" />\n");
      out.write("<script type=\"text/javascript\" src=\"jquery/cufon-yui.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"jquery/Book_Antiqua_400.font.js\"></script>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        Cufon.replace ('h1')('h2')('h3')('h4')('#logo a')('#buttons a')('#box2_all .box_left');\n");
      out.write("    </script>\n");
      out.write("<link href=\"styles.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<style>\n");
      out.write("input[type=text]:focus \n");
      out.write("\n");
      out.write("{\n");
      out.write("    border: 3px solid #555;\n");
      out.write("}\n");
      out.write("    \n");
      out.write("input[type=text], select {\n");
      out.write("    width: 50%;\n");
      out.write("    padding: 12px 20px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    display: inline-block;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    border-radius: 8px;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=submit] {\n");
      out.write("    width: 80%;\n");
      out.write("    background-color: #4CAF50;\n");
      out.write("    color: white;\n");
      out.write("    padding: 14px 20px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    border: none;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=submit]:hover {\n");
      out.write("    background-color: #45a049;\n");
      out.write("}\n");
      out.write("\n");
      out.write("div {\n");
      out.write("    border-radius: 5px;\n");
      out.write("    background-color: #f2f2f2;\n");
      out.write("    padding: 5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".tooltip \n");
      out.write("\n");
      out.write("{\n");
      out.write("    position: relative;\n");
      out.write("    display: inline-block;\n");
      out.write(" \n");
      out.write("}\n");
      out.write("\n");
      out.write(".tooltip .tooltiptext \n");
      out.write("\n");
      out.write("{\n");
      out.write("    visibility: hidden;\n");
      out.write("    width: 300px;\n");
      out.write("    background-color: lightgreen;\n");
      out.write("    color: #fff;\n");
      out.write("    text-align: center;\n");
      out.write("    border-radius: 1px;\n");
      out.write("    padding: 10px 5px;\n");
      out.write("\n");
      out.write("    /* Position the tooltip */\n");
      out.write("    //position: absolute;\n");
      out.write("   // z-index: 1;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".tooltip:hover .tooltiptext\n");
      out.write("\n");
      out.write("{\n");
      out.write("    visibility: visible;\n");
      out.write("}\n");
      out.write("\n");
      out.write("select \n");
      out.write("\n");
      out.write("{\n");
      out.write("    width: 30%;\n");
      out.write("    padding: 1 6px 20px;\n");
      out.write("    border: none;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    background-color: #f1f1f1;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div id=\"main\">\n");
      out.write("    <!-- header begins -->\n");
      out.write("    <div id=\"header\">\n");
      out.write("        <div id=\"logo\">\n");
      out.write("            <a href=\"home.jsp\">Ahmedabad City Police</a>\n");
      out.write("\t\t\t<h2><a href=\"home.jsp\">Service . Security . Peace</a></h2>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"buttons\">\n");
      out.write("            <a href=\"home.jsp\" class=\"but\"  title=\"\">Home</a><div class=\"but_razd\"></div>\n");
      out.write("            <a href=\"about_us.jsp\" class=\"but\" title=\"\">About Us</a><div class=\"but_razd\"></div>\n");
      out.write("            <a href=\"police.jsp\"  class=\"but\" title=\"\">Area Police Stations</a><div class=\"but_razd\"></div>\n");
      out.write("            <a href=\"services.jsp\"  class=\"but\" title=\"\">Services</a><div class=\"but_razd\"></div>\n");
      out.write("            <a href=\"contact_us.jsp\" class=\"but\" title=\"\">Feedback</a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("   <div class=\"content_top\" ></div>\n");
      out.write("    <div id=\"content\">\n");
      out.write("    <div id=\"about\">\n");
      out.write("       \t<div id=\"left\">\n");
      out.write("            <form action=\"lostreport\" method=\"post\" style=\"margin-left: 30px;\">\n");
      out.write("      \n");
      out.write("      <h2>Owner Details</h2>\n");
      out.write("    \n");
      out.write("    <label for=\"fname\">First Name&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  </label>\n");
      out.write("   <div class=\"tooltip\"> <input type=\"text\" name=\"fname\"> <span class=\"tooltiptext\">This Field Required</span></div>\n");
      out.write("    <br>\n");
      out.write("    \n");
      out.write("    <label for=\"fname\">Last Name&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>\n");
      out.write("    <div class=\"tooltip\"><input type=\"text\" name=\"lname\"><span class=\"tooltiptext\">This Field Required</span></div>\n");
      out.write("    <br>\n");
      out.write("         <input type=\"submit\" value=\"Submit\">\n");
      out.write("  </form>\n");
      out.write("            <h3>About Us</h3>\n");
      out.write("                <div class=\"block\">\n");
      out.write("                     <div class=\"line\"></div>\n");
      out.write("                     <br><h3>List of Commissioner of Police in Ahmedabad City</h3><br>\n");
      out.write("                        <img src=\"images/1.jpg\"/><br>\n");
      out.write("                      <img src=\"images/2.jpg\"/>\n");
      out.write("                <div class=\"clear\" style=\"height: 40px;\"></div>\n");
      out.write("                <div class=\"line\"></div>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                </div>    \n");
      out.write("       \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("     <div class=\"content_bot\" ></div>\n");
      out.write("\t<div id=\"footer\">\n");
      out.write("        <div id=\"footer_box1\">\n");
      out.write("            <p>Copyright 2016. <!-- Do not remove -->Designed by Anuj & Vama<!-- end --><br />\n");
      out.write("            <a href=\"#\">Privacy Policy</a> | <a href=\"#\">Terms of Use</a> </p>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"footer_box2\">\n");
      out.write("            <a href=\"#\"><img src=\"images/f5.png\" class=\"footer_img\" alt=\"\" /></a>\n");
      out.write("            <a href=\"#\"><img src=\"images/f4.png\" class=\"footer_img\" alt=\"\" /></a>\n");
      out.write("            <a href=\"#\"><img src=\"images/f3.png\" class=\"footer_img\" alt=\"\" /></a>\n");
      out.write("            <a href=\"#\"><img src=\"images/f2.png\" class=\"footer_img\" alt=\"\" /></a>\n");
      out.write("            <a href=\"#\"><img src=\"images/f1.png\" class=\"footer_img\" alt=\"\" /></a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
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
