package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<title>Admin Login</title>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("body {\n");
      out.write("    background-color: #ffffff;\n");
      out.write("color: #5a5656;\n");
      out.write("font-family: 'Open Sans', Arial, Helvetica, sans-serif;\n");
      out.write("font-size: 26px;\n");
      out.write("line-height: 1.5em;\n");
      out.write("}\n");
      out.write("a { text-decoration: none; }\n");
      out.write("h1 { font-size: 1em; }\n");
      out.write("h1, p {\n");
      out.write("margin-bottom: 10px;\n");
      out.write("}\n");
      out.write("strong {\n");
      out.write("font-weight: bold;\n");
      out.write("}\n");
      out.write(".uppercase { text-transform: uppercase; }\n");
      out.write("\n");
      out.write("/* ---------- LOGIN ---------- */\n");
      out.write("#login {\n");
      out.write("margin: 50px auto;\n");
      out.write("width: 350px;\n");
      out.write("}\n");
      out.write("form fieldset input[type=\"text\"], input[type=\"password\"] {\n");
      out.write("background-color: #e5e5e5;\n");
      out.write("border: none;\n");
      out.write("border-radius: 3px;\n");
      out.write("-moz-border-radius: 3px;\n");
      out.write("-webkit-border-radius: 3px;\n");
      out.write("color: #5a5656;\n");
      out.write("font-family: 'Open Sans', Arial, Helvetica, sans-serif;\n");
      out.write("font-size: 14px;\n");
      out.write("height: 50px;\n");
      out.write("outline: none;\n");
      out.write("padding: 0px 10px;\n");
      out.write("width: 280px;\n");
      out.write("-webkit-appearance:none;\n");
      out.write("}\n");
      out.write("form fieldset input[type=\"submit\"] {\n");
      out.write("background-color: #008dde;\n");
      out.write("border: none;\n");
      out.write("border-radius: 3px;\n");
      out.write("-moz-border-radius: 3px;\n");
      out.write("-webkit-border-radius: 3px;\n");
      out.write("color: #f4f4f4;\n");
      out.write("cursor: pointer;\n");
      out.write("font-family: 'Open Sans', Arial, Helvetica, sans-serif;\n");
      out.write("height: 50px;\n");
      out.write("text-transform: uppercase;\n");
      out.write("width: 300px;\n");
      out.write("-webkit-appearance:none;\n");
      out.write("}\n");
      out.write("form fieldset a {\n");
      out.write("color: #5a5656;\n");
      out.write("font-size: 10px;\n");
      out.write("}\n");
      out.write("form fieldset a:hover { text-decoration: underline; }\n");
      out.write(".btn-round {\n");
      out.write("background-color: #5a5656;\n");
      out.write("border-radius: 50%;\n");
      out.write("-moz-border-radius: 50%;\n");
      out.write("-webkit-border-radius: 50%;\n");
      out.write("color: #f4f4f4;\n");
      out.write("display: block;\n");
      out.write("font-size: 12px;\n");
      out.write("height: 50px;\n");
      out.write("line-height: 50px;\n");
      out.write("margin: 30px 125px;\n");
      out.write("text-align: center;\n");
      out.write("text-transform: uppercase;\n");
      out.write("width: 50px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <br>\n");
      out.write("    <h2><center>Ahmedabad City Police</center></h2>\n");
      out.write("    \n");
      out.write("    \n");
      out.write(" <form name=\"sign in\" action=\"admin\">\n");
      out.write("                     ");
 
                         HttpSession s2=request.getSession();
                         Object n1=s2.getAttribute("message");
                         String s=(String)n1;
                         
      out.write("  \n");
      out.write("                                               \n");
      out.write("\n");
      out.write("<div id=\"login\">\n");
      out.write("<h1><strong>Welcome.</strong></h1>\n");
      out.write("\n");
      out.write("<fieldset>\n");
      out.write("<p><input type=\"text\" name=\"username\" required value=\"Username\" onBlur=\"if(this.value=='')this.value='Username'\" onFocus=\"if(this.value=='Username')this.value='' \"></p>\n");
      out.write("<p><input type=\"password\" name=\"password\" required value=\"Password\" onBlur=\"if(this.value=='')this.value='Password'\" onFocus=\"if(this.value=='Password')this.value='' \"></p>\n");
      out.write("\n");
      out.write("\n");
      out.write("<p><input type=\"submit\" value=\"Login\"></p>\n");
      out.write("</fieldset>\n");
      out.write("      ");

            out.println("<center>");       
            out.println(s); 
            out.println("</center>");
                         
      out.write("\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("</div> <!-- end login -->\n");
      out.write("</body>\n");
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
