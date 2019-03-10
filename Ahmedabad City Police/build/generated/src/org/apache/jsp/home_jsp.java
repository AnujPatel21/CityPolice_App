package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        Cufon.replace ('h1')('h2')('h3')('h4')('#logo a')('#buttons a');\n");
      out.write("    </script>\n");
      out.write("<link href=\"styles.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"nivo-slider.css\" type=\"text/css\" media=\"screen\" />\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div id=\"main\">\n");
      out.write("  \n");
      out.write("    <div id=\"header\">\n");
      out.write("          \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div id=\"logo\">\n");
      out.write("            <a href=\"#\">Ahmedabad City Police</a>\n");
      out.write("\t\t\t<h2><a href=\"#\">Service . Security . Peace</a></h2>\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("         \n");
      out.write("        \n");
      out.write("        <div id=\"buttons\">\n");
      out.write("            <a href=\"home.jsp\" class=\"but\"  title=\"\">Home</a><div class=\"but_razd\"></div>\n");
      out.write("            <a href=\"about_us.jsp\" class=\"but\" title=\"\">About Us</a><div class=\"but_razd\"></div>\n");
      out.write("            <a href=\"police.jsp\"  class=\"but\" title=\"\">Area Police Stations</a><div class=\"but_razd\"></div>\n");
      out.write("            <a href=\"services.jsp\"  class=\"but\" title=\"\">Services</a><div class=\"but_razd\"></div>\n");
      out.write("           <a href=\"contact_us.jsp\" class=\"but\" title=\"\">Feedback</a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- header ends -->\n");
      out.write("    <!-- top -->\n");
      out.write("    <div class=\"top\">\n");
      out.write("        <div class=\"top_top\"></div>\n");
      out.write("        <div class=\"top1\">\n");
      out.write("\t\t\n");
      out.write("\t\t   <div id=\"slider-wrapper\">        \n");
      out.write("            <div id=\"slider\" class=\"nivoSlider\">\n");
      out.write("                <img src=\"images/top1.jpg\" alt=\"\" />\n");
      out.write("                <img src=\"images/top2.jpg\" alt=\"\"/>\n");
      out.write("                <img src=\"images/top3.jpg\" alt=\"\" />\n");
      out.write("            </div>        \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"jquery/jquery-1.4.3.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"jquery/jquery.nivo.slider.pack.js\"></script>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("    $(window).load(function() {\n");
      out.write("        $('#slider').nivoSlider();\n");
      out.write("    });\n");
      out.write("    </script>\n");
      out.write("\t\t\n");
      out.write("\t\t</div>\n");
      out.write("       \n");
      out.write("    </div>\n");
      out.write("    <div class=\"clear\" style=\"height: 9px\"></div>\n");
      out.write("    <!-- content -->\n");
      out.write("    <div class=\"content_top\" ></div>\n");
      out.write("    <div id=\"content\" >\n");
      out.write("    \t<div class=\"box1_all\">\n");
      out.write("            <div class=\"box1\">\n");
      out.write("                <div class=\" box1_left\"><img src=\"images/family.gif\" style=\"padding-top: 15px;\" alt=\"\" /></div>\n");
      out.write("                <div class=\" box1_right\" style=\" width: 205px\"><br>\n");
      out.write("                    <h1>Reunited families honour cops</h1><br>\n");
      out.write("                    <div class=\"read_more_box1\"><a href=\"homebox1.jsp\">Read More...</a></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\" box1_div\"></div>\n");
      out.write("            \n");
      out.write("            <div class=\"box1\">\n");
      out.write("                <div class=\" box1_left\"><img src=\"images/house.png\" style=\"padding-top: 15px;\" alt=\"\" /></div>\n");
      out.write("                <div class=\" box1_right\" style=\" width: 205px\"><br>\n");
      out.write("                    <h1>Evicted Dad gets his house back</h1><br>\n");
      out.write("                    <div class=\"read_more_box1\"><a href=\"homebox2.jsp\">Read More...</a></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\" box1_div\"></div><div class=\"box1\">\n");
      out.write("                <div class=\" box1_left\"><img src=\"images/trophy.png\" style=\"padding-top: 15px;\" alt=\"\" /></div>\n");
      out.write("                <div class=\" box1_right\" style=\" width: 205px\"><br>\n");
      out.write("                       <h1>Awards and Achievements</h1><br>\n");
      out.write("                    <div class=\"read_more_box1\"><a href=\"homebox3.jsp\">Read More...</a></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clear\"></div>\n");
      out.write("        </div>\n");
      out.write("        <div>\n");
      out.write("        \t<div class=\"index_left\">\n");
      out.write("            \t<div class=\"index_left_bg\">\n");
      out.write("            \t\t<div class=\"index_left_left\">\n");
      out.write("                            <b><h3>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Welcome to Ahmedabad Police</h3></b>\n");
      out.write("                    \t<div class=\"block\">\n");
      out.write("                        \t\n");
      out.write("                            <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Ahmedabad city police is constantly active for your safety and law and order in city, this is the &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;core objective of Ahmedabad City Police. We accept your co-operation to reduce the crime rate in &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;the city so people can live happily. This website is a humble try to get together people and city &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;police.</p>\n");
      out.write("                            <br><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Responsibility of protection and safety of the citizens of Ahmedabad having population about &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;more than 60 lac is on the shoulders of Ahmedabad City Police Force. The Commissioner of Police &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;has been discharging his duties as the Head of Ahmedabad City Police Force.</p></br>\n");
      out.write("                                <br><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Apart from regular 38 police stations Ahmedabad city has a full fledge Mahila Police Station &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;established to deal with women related offences and issues only. In functions under Crime Branch &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;and is headed by the office of the rank of Police Inspector.</br></p>\n");
      out.write("                                </p>\n");
      out.write("                            <div class=\"read_more\"><a href=\"about_us.jsp\">read more...</a></div>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("            \t\t<div class=\"index_left_right\">\n");
      out.write("                    \t<h3>Quick Links</h3>\n");
      out.write("                        <ul class=\"list_index\">\n");
      out.write("                            <br>\n");
      out.write("                            <li><a href=\"policeheart.jsp\">POLICE HEART</a></li>\n");
      out.write("                            <li><a href=\"passport.jsp\">FOREIGNER AND PASSPORT</a></li>\n");
      out.write("                            <li><a href=\"clearance.jsp\">POLICE CLEARANCE CERTIFICATE</a></li>\n");
      out.write("                            <li><a href=\"map.jsp\">AHMEDABAD CITY MAP</a></li>\n");
      out.write("                            <li><a href=\"traffic.jsp\">TRAFFIC</a></li>\n");
      out.write("                          \n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"clear\"></div>\n");
      out.write("            \t</div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"index_right\">\n");
      out.write("                <h3 style=\"text-align: center;\">Important News</h3><br>\n");
      out.write("                <p><strong>Jan.27, 2016</strong><br />\n");
      out.write("\t\t\t\t<strong>Battalions Created</strong><br />\n");
      out.write("\t\t\t\tCabinet approves creation of 17 reserve battalions by J&K and Naxalism- affacted states,say government source: PTI.  \n");
      out.write("                </p>\n");
      out.write("                \n");
      out.write("                <div class=\"clear\" style=\"height:20px;\"></div>\n");
      out.write("                <div class=\"line\" style=\"height:20px;\"></div>\n");
      out.write("                <p><strong>Jan.20, 2016</strong><br />\n");
      out.write("\t\t\t\t<strong>Pakistan Refuses Voice sample</strong><br />\n");
      out.write("\t\t\t\tPakistan court refuses voice samples of suspects in 26/11 case.\n");
      out.write("                </p>\n");
      out.write("               \n");
      out.write("            </div>\n");
      out.write("            <div class=\"clear\"></div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"content_bot\" ></div>\n");
      out.write("\t<div id=\"footer\">\n");
      out.write("        <div id=\"footer_box1\">\n");
      out.write("            <p>Copyright 2016. <!-- Do not remove -->Designed by Anuj & Vama<!-- end --><br />\n");
      out.write("            <a href=\"#\">Privacy Policy</a> | <a href=\"#\">Terms of Use</a> <a href=\"signin.jsp\" class=\"but\"  title=\"\">Sign In</a><div class=\"but_razd\"></div></p>\n");
      out.write("            \n");
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
