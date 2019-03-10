package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminlogin2_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
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
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <title>Admin Login</title>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta name=\"description\" content=\"Charisma, a fully featured, responsive, HTML5, Bootstrap admin template.\">\n");
      out.write("    <meta name=\"author\" content=\"Muhammad Usman\">\n");
      out.write("\n");
      out.write("    <!-- The styles -->\n");
      out.write("    <link id=\"bs-css\" href=\"css/bootstrap-cerulean.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <link href=\"css/charisma-app.css\" rel=\"stylesheet\">\n");
      out.write("    <link href='bower_components/fullcalendar/dist/fullcalendar.css' rel='stylesheet'>\n");
      out.write("    <link href='bower_components/fullcalendar/dist/fullcalendar.print.css' rel='stylesheet' media='print'>\n");
      out.write("    <link href='bower_components/chosen/chosen.min.css' rel='stylesheet'>\n");
      out.write("    <link href='bower_components/colorbox/example3/colorbox.css' rel='stylesheet'>\n");
      out.write("    <link href='bower_components/responsive-tables/responsive-tables.css' rel='stylesheet'>\n");
      out.write("    <link href='bower_components/bootstrap-tour/build/css/bootstrap-tour.min.css' rel='stylesheet'>\n");
      out.write("    <link href='css/jquery.noty.css' rel='stylesheet'>\n");
      out.write("    <link href='css/noty_theme_default.css' rel='stylesheet'>\n");
      out.write("    <link href='css/elfinder.min.css' rel='stylesheet'>\n");
      out.write("    <link href='css/elfinder.theme.css' rel='stylesheet'>\n");
      out.write("    <link href='css/jquery.iphone.toggle.css' rel='stylesheet'>\n");
      out.write("    <link href='css/uploadify.css' rel='stylesheet'>\n");
      out.write("    <link href='css/animate.min.css' rel='stylesheet'>\n");
      out.write("\n");
      out.write("    <!-- jQuery -->\n");
      out.write("    <script src=\"bower_components/jquery/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- The HTML5 shim, for IE6-8 support of HTML5 elements -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("    <script src=\"http://html5shim.googlecode.com/svn/trunk/html5.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("\n");
      out.write("    <!-- The fav icon -->\n");
      out.write("    <link rel=\"shortcut icon\" href=\"img/favicon.ico\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<div class=\"ch-container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        \n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-md-12 center login-header\">\n");
      out.write("            <h2>Ahmedabad City Police</h2>\n");
      out.write("        </div>\n");
      out.write("        <!--/span-->\n");
      out.write("    </div><!--/row-->\n");
      out.write("\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"well col-md-5 center login-box\">\n");
      out.write("            <div class=\"alert alert-info\">\n");
      out.write("                Please login with your Username and Password.\n");
      out.write("            </div>\n");
      out.write("            <form class=\"form-horizontal\" action=\"index.html\" method=\"post\">\n");
      out.write("                <fieldset>\n");
      out.write("                    <div class=\"input-group input-group-lg\">\n");
      out.write("                        <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-user red\"></i></span>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Username\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"clearfix\"></div><br>\n");
      out.write("\n");
      out.write("                    <div class=\"input-group input-group-lg\">\n");
      out.write("                        <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-lock red\"></i></span>\n");
      out.write("                        <input type=\"password\" class=\"form-control\" placeholder=\"Password\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"clearfix\"></div>\n");
      out.write("\n");
      out.write("                    <div class=\"input-prepend\">\n");
      out.write("                        <label class=\"remember\" for=\"remember\"><input type=\"checkbox\" id=\"remember\"> Remember me</label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"clearfix\"></div>\n");
      out.write("\n");
      out.write("                    <p class=\"center col-md-5\">\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary\">Login</button>\n");
      out.write("                    </p>\n");
      out.write("                </fieldset>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <!--/span-->\n");
      out.write("    </div><!--/row-->\n");
      out.write("</div><!--/fluid-row-->\n");
      out.write("\n");
      out.write("</div><!--/.fluid-container-->\n");
      out.write("\n");
      out.write("<!-- external javascript -->\n");
      out.write("\n");
      out.write("<script src=\"bower_components/bootstrap/dist/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- library for cookie management -->\n");
      out.write("<script src=\"js/jquery.cookie.js\"></script>\n");
      out.write("<!-- calender plugin -->\n");
      out.write("<script src='bower_components/moment/min/moment.min.js'></script>\n");
      out.write("<script src='bower_components/fullcalendar/dist/fullcalendar.min.js'></script>\n");
      out.write("<!-- data table plugin -->\n");
      out.write("<script src='js/jquery.dataTables.min.js'></script>\n");
      out.write("\n");
      out.write("<!-- select or dropdown enhancer -->\n");
      out.write("<script src=\"bower_components/chosen/chosen.jquery.min.js\"></script>\n");
      out.write("<!-- plugin for gallery image view -->\n");
      out.write("<script src=\"bower_components/colorbox/jquery.colorbox-min.js\"></script>\n");
      out.write("<!-- notification plugin -->\n");
      out.write("<script src=\"js/jquery.noty.js\"></script>\n");
      out.write("<!-- library for making tables responsive -->\n");
      out.write("<script src=\"bower_components/responsive-tables/responsive-tables.js\"></script>\n");
      out.write("<!-- tour plugin -->\n");
      out.write("<script src=\"bower_components/bootstrap-tour/build/js/bootstrap-tour.min.js\"></script>\n");
      out.write("<!-- star rating plugin -->\n");
      out.write("<script src=\"js/jquery.raty.min.js\"></script>\n");
      out.write("<!-- for iOS style toggle switch -->\n");
      out.write("<script src=\"js/jquery.iphone.toggle.js\"></script>\n");
      out.write("<!-- autogrowing textarea plugin -->\n");
      out.write("<script src=\"js/jquery.autogrow-textarea.js\"></script>\n");
      out.write("<!-- multiple file upload plugin -->\n");
      out.write("<script src=\"js/jquery.uploadify-3.1.min.js\"></script>\n");
      out.write("<!-- history.js for cross-browser state change on ajax -->\n");
      out.write("<script src=\"js/jquery.history.js\"></script>\n");
      out.write("<!-- application script for Charisma demo -->\n");
      out.write("<script src=\"js/charisma.js\"></script>\n");
      out.write("\n");
      out.write("\n");
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
