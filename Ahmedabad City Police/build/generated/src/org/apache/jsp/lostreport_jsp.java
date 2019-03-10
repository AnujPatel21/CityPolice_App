package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class lostreport_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<style>\n");
      out.write("    \n");
      out.write(".dropbtn {\n");
      out.write("    background-color: lightsteelblue;\n");
      out.write("    color: lightgoldenrodyellow;\n");
      out.write("    padding: 10px;\n");
      out.write("    font-size: 20px;\n");
      out.write("    border: 10%;\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown {\n");
      out.write("    position: relative;\n");
      out.write("    display: inline-block;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content {\n");
      out.write("    display: none;\n");
      out.write("    left: 0;\n");
      out.write("    position: relative;\n");
      out.write("    background-color: lightblue;\n");
      out.write("    min-width: 160px;\n");
      out.write("    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content a {\n");
      out.write("    color: black;\n");
      out.write("    padding: 12px 16px;\n");
      out.write("    text-decoration: none;\n");
      out.write("    display: inline-block;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content a:hover {background-color: #f1f1f1}\n");
      out.write("\n");
      out.write(".dropdown:hover .dropdown-content {\n");
      out.write("    display: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown:hover .dropbtn {\n");
      out.write("    background-color: #3e8e41;\n");
      out.write("}    \n");
      out.write("\n");
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
      out.write("    padding: 16px 20px;\n");
      out.write("    border: none;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    background-color: #f1f1f1;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body style=\"float: left;margin-left: 30%\">\n");
      out.write("    <br>   \n");
      out.write("<center> <h1> Lost Report</h1></center>\n");
      out.write(" \n");
      out.write("\n");
      out.write("<div>\n");
      out.write("    <form action=\"lostreport\" method=\"post\" style=\"margin-left: 30px;\">\n");
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
      out.write("    \n");
      out.write("    <label for=\"fname\">Mobile Number&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>\n");
      out.write("    <div class=\"tooltip\"><input type=\"text\" name=\"phno\"><span class=\"tooltiptext\">This Field Required</span></div>\n");
      out.write("    <br>\n");
      out.write("    \n");
      out.write("    <label for=\"fname\">Address&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>\n");
      out.write("    <div class=\"tooltip\"><textarea name=\"address\" rows=\"5\" cols=\"40\"> </textarea><span class=\"tooltiptext\">This Field Required</span></div>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <h2>Item Details</h2>\n");
      out.write("    \n");
      out.write("    <label for=\"fname\">Name &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>\n");
      out.write("    <div class=\"tooltip\"><input type=\"text\" name=\"iname\"> <span class=\"tooltiptext\">This Field Required</span></div>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <label for=\"fname\">Description&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </label>\n");
      out.write("    <div class=\"tooltip\"><textarea name=\"id\" rows=\"5\" cols=\"40\"></textarea> <span class=\"tooltiptext\">This Field Optional</span></div>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <label for=\"fname\">Lost Date &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>\n");
      out.write("    <div class=\"tooltip\"><input type=\"text\"  name=\"dt\"> <span class=\"tooltiptext\">This Field Optional</span></div>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("     <label for=\"fname\">Price &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>\n");
      out.write("    <div class=\"tooltip\"><input type=\"text\"  name=\"ip\"> <span class=\"tooltiptext\">This Field Optional</span></div>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("     <label for=\"fname\">Bill/Proof &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>\n");
      out.write("     <div class=\"tooltip\"><input type=\"file\"  name=\"ib\"> <span class=\"tooltiptext\">This Field Optional</span></div>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <label for=\"fname\">Image &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>\n");
      out.write("     <div class=\"tooltip\"><input type=\"file\"  name=\"ipic\"> <span class=\"tooltiptext\">This Field Optional</span></div>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    Item type&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("  <select  name=\"itype\" style=\"overflow:scroll\">\n");
      out.write("    <option value=\"Mobile\">Mobile</option>\n");
      out.write("    <option value=\"Vehicals\">Vehicals</option>\n");
      out.write("    <option value=\"Jewellery\">Jewellery</option>\n");
      out.write("        <option value=\"Purse\">Purse</option>\n");
      out.write("    <option value=\"Other\">Other</option>\n");
      out.write("  </select>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <input type=\"submit\" value=\"Submit\">\n");
      out.write("  </form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("   \n");
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
