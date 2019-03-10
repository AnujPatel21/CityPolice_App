package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class service_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Services</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"styles/style.css\" />\n");
      out.write("<script type=\"text/javascript\" src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"jquery/cufon-yui.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"jquery/Book_Antiqua_400.font.js\"></script>\n");
      out.write("  \n");
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
      out.write("       <li><a href=\"articles.jsp\">Lost Items</a></li>\n");
      out.write("        <li><a href=\"founditem.jsp\">Found Items</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("    <!--end nav-->\n");
      out.write("  </div>\n");
      out.write("  <!--end header-->\n");
      out.write(" \n");
      out.write("       <div><br>\n");
      out.write("                <h3><strong>POLICE STATIONS</strong></h3><br>\n");
      out.write("         \n");
      out.write("        <TABLE border=\"1\" cellpadding=\"500\" cellspacing=\"500\" style=\"width:100%;height:350%\">\n");
      out.write("   <TR>\n");
      out.write("    \n");
      out.write("   </TR>\n");
      out.write("   <TR>\n");
      out.write("       <TH><h3><a href=\"fir1.jsp\">Vatva GIDC</a></h3></TH>\n");
      out.write("      <TH> <h3><a href=\"fir2.jsp\">Nikol</a></h3> </TH>\n");
      out.write("      <TH><h3> <a href=\"fir3.jsp\">Paldi</a></h3></TH>\n");
      out.write("      <TH><h3> <a href=\"fir4.jsp\">River Front West</a></h3> </TH>\n");
      out.write("       <TH><h3> <a href=\"fir5.jsp\">Vejalpur</a></h3>  </TH>\n");
      out.write("    </TR>\n");
      out.write("     <TR>\n");
      out.write("      <TH><h3> <a href=\"fir6.jsp\">Vastrapur</a></h3> </TH>\n");
      out.write("      <TH><h3> <a href=\"fir7.jsp\">Shahpur</a></h3>   </TH>\n");
      out.write("      <TH><h3> <a href=\"fir8.jsp\">Shakerkotda</a></h3></TH>\n");
      out.write("      <TH><h3> <a href=\"fir9.jsp\">Sadarnagar</a></h3> </TH>\n");
      out.write("       <TH><h3> <a href=\"fir10.jsp\">Ranip</a></h3> </TH>\n");
      out.write("    </TR>\n");
      out.write("     <TR>\n");
      out.write("      <TH><h3> <a href=\"fir11.jsp\">Rakhiyal</a></h3> </TH>\n");
      out.write("      <TH><h3> <a href=\"fir12.jsp\">Navrangpura</a></h3>   </TH>\n");
      out.write("      <TH><h3> <a href=\"fir13.jsp\">Naranpura</a></h3></TH>\n");
      out.write("      <TH><h3> <a href=\"fir14.jsp\">Maninagar</a></h3> </TH>\n");
      out.write("       <TH><h3> <a href=\"fir15.jsp\">Khokhara</a></h3>  </TH>\n");
      out.write("    </TR>\n");
      out.write("     <TR>\n");
      out.write("      <TH> <h3> <a href=\"fir16.jsp\">Karanj</a></h3> </TH>\n");
      out.write("      <TH><h3> <a href=\"fir17.jsp\">Kagdapith</a></h3> </TH>\n");
      out.write("      <TH><h3> <a href=\"fir18.jsp\">Haveli</a></h3></TH>\n");
      out.write("      <TH><h3> <a href=\"fir19.jsp\">Gomtipur</a></h3></TH>\n");
      out.write("       <TH><h3> <a href=\"fir20.jsp\">Ellisbridge</a></h3></TH>\n");
      out.write("    </TR>\n");
      out.write("    <TR>\n");
      out.write("      <TH><h3> <a href=\"fir21.jsp\">Danilimda</a></h3> </TH>\n");
      out.write("      <TH> <h3> <a href=\"fir22.jsp\">Bapunagar</a></h3> </TH>\n");
      out.write("      <TH><h3> <a href=\"fir23.jsp\">Aanand Nagar</a></h3></TH>\n");
      out.write("      <TH><h3> <a href=\"fir24.jsp\">Sarkhej</a></h3></TH>\n");
      out.write("       <TH><h3> <a href=\"fir25.jsp\">Krsnanagar</a></h3></TH>\n");
      out.write("    </TR>\n");
      out.write("    <TR>\n");
      out.write("      <TH><h3> <a href=\"fir26.jsp\">River Front East</a></h3> </TH>\n");
      out.write("      <TH><h3> <a href=\"fir27.jsp\">Vadaj</a></h3></TH>\n");
      out.write("      <TH><h3> <a href=\"fir28.jsp\">Vatva</a></h3> </TH>\n");
      out.write("      <TH><h3> <a href=\"fir29.jsp\">Sola</a></h3> </TH>\n");
      out.write("       <TH><h3> <a href=\"fir30.jsp\">Sahibaugh</a></h3> </TH>\n");
      out.write("    </TR>\n");
      out.write("    <TR>\n");
      out.write("      <TH><h3> <a href=\"fir31.jsp\">Satellite</a></h3></TH>\n");
      out.write("      <TH><h3> <a href=\"fir32.jsp\">Sabarmati</a></h3></TH>\n");
      out.write("      <TH><h3> <a href=\"fir33.jsp\">Ramol</a></h3></TH>\n");
      out.write("      <TH><h3> <a href=\"fir34.jsp\">Odhav</a></h3></TH>\n");
      out.write("       <TH><h3> <a href=\"fir35.jsp\">Naroda</a></h3></TH>\n");
      out.write("    </TR>\n");
      out.write("    <TR>\n");
      out.write("      <TH><h3> <a href=\"fir36.jsp\">Meghaninagar</a></h3> </TH>\n");
      out.write("      <TH><h3> <a href=\"fir37.jsp\">Madhvpura</a></h3></TH>\n");
      out.write("      <TH><h3> <a href=\"fir38.jsp\">Khadia</a></h3> </TH>\n");
      out.write("      <TH><h3> <a href=\"fir39.jsp\">Kalupur</a></h3></TH>\n");
      out.write("       <TH><h3> <a href=\"fir40.jsp\">Ishanpur</a></h3></TH>\n");
      out.write("    </TR>\n");
      out.write("    <TR>\n");
      out.write("      <TH><h3> <a href=\"fir41.jsp\">Gujarat University</a></h3> </TH>\n");
      out.write("      <TH><h3> <a href=\"fir42.jsp\">Ghatlodia</a></h3> </TH>\n");
      out.write("      <TH><h3> <a href=\"fir43.jsp\">Dariyapur</a></h3> </TH>\n");
      out.write("      <TH><h3> <a href=\"fir44.jsp\">Chandkheda</a></h3> </TH>\n");
      out.write("       <TH><h3> <a href=\"fir45.jsp\">Amraiwadi</a></h3> </TH>\n");
      out.write("    </TR>\n");
      out.write("    \n");
      out.write(" </table>\n");
      out.write("</div>\n");
      out.write(" \n");
      out.write("  </div>\n");
      out.write("  <!--end main-->\n");
      out.write(" \n");
      out.write("  <!--end footer-->\n");
      out.write("</div>\n");
      out.write("<!--end wrap-->\n");
      out.write("<div class=\"cache-images\"> <img src=\"images/black-button-bg.png\" width=\"0\" height=\"0\" alt=\"\" /> </div>\n");
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
