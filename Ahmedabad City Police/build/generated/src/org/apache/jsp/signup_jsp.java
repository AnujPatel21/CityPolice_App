package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Login</title>\n");
      out.write("<meta name=\"keywords\" content=\"\" />\n");
      out.write("<meta name=\"description\" content=\"\" />\n");
      out.write("<script type=\"text/javascript\" src=\"jquery/cufon-yui.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"jquery/Book_Antiqua_400.font.js\"></script>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        Cufon.replace ('h1')('h2')('h3')('h4')('#logo a')('#buttons a')('#box2_all .box_left');\n");
      out.write("    </script>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("function checkWholeForm(theForm)\n");
      out.write("{\n");
      out.write("var why = \"\";\n");
      out.write("\n");
      out.write("why += checkname(theForm.username, \"user name\");\n");
      out.write("why += checkPassword(theForm.password);\n");
      out.write("if ( theForm.password.value != theForm.password2.value )\n");
      out.write("{\n");
      out.write("why += \"The two passwords do not match. Please enter the same password twice.\\n\";\n");
      out.write("}\n");
      out.write("why += checkname(theForm.firstname, \"first name\");\n");
      out.write("why += checkname(theForm.lastname, \"last name\");\n");
      out.write("why += checkEmail(theForm.email);\n");
      out.write("why += checkPhone(theForm.phno);\n");
      out.write("why += checkDate(theForm.dt);\n");
      out.write("\n");
      out.write("if (why != \"\")\n");
      out.write("{\n");
      out.write("alert(why);\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("return true;\n");
      out.write("}\n");
      out.write("\n");
      out.write("function checkname(fld, name)\n");
      out.write("{\n");
      out.write("var val = fld.value;\n");
      out.write("if ( val.length < 3 || val.length > 10 )\n");
      out.write("{\n");
      out.write("fld.focus();\n");
      out.write("return \"You must enter a \" + name + \" minimum 3 characters long.\\n\";\n");
      out.write("}\n");
      out.write("\n");
      out.write("return \"\";\n");
      out.write("}\n");
      out.write("\n");
      out.write("function checkPassword(fld)\n");
      out.write("{\n");
      out.write("var val = fld.value;\n");
      out.write("if ( val.length < 4 || val.length > 10 )\n");
      out.write("{\n");
      out.write("fld.focus();\n");
      out.write("return \"You must enter a password that is atleast 5 characters long.\\n\";\n");
      out.write("}\n");
      out.write("\n");
      out.write("return \"\";\n");
      out.write("}\n");
      out.write("function checkDate(fld)\n");
      out.write("{\n");
      out.write("   var re =/^\\d{1,2}\\/\\d{1,2}\\/\\d{4}$/;\n");
      out.write("\n");
      out.write("\n");
      out.write("if ( fld.value != '' && !fld.value.match(re)  )\n");
      out.write("{\n");
      out.write("fld.focus();\n");
      out.write("return \"Invalid Date format it should be dd/mm/yyyy.\\n\";\n");
      out.write("}\n");
      out.write("\n");
      out.write("return \"\";\n");
      out.write("}\n");
      out.write("\n");
      out.write("function checkEmail(fld)\n");
      out.write("{\n");
      out.write("var val = fld.value;\n");
      out.write("//relational algebra standard for checking the emails\n");
      out.write("var emailFilter=/^[\\w\\-\\'\\.]+\\@([\\w\\-\\']+\\.)+[a-z]{2,6}$/i;\n");
      out.write("if ( ! (emailFilter.test(val)) )\n");
      out.write("{\n");
      out.write("fld.focus();\n");
      out.write("return \"Please enter a valid email address.\\n\";\n");
      out.write("}\n");
      out.write("return \"\";\n");
      out.write("}\n");
      out.write("\n");
      out.write("function checkPhone(fld)\n");
      out.write("{\n");
      out.write("var val = fld.value;\n");
      out.write("\n");
      out.write("// strip out ALL non-numeric characters\n");
      out.write("var ph = val.replace(/[^\\d]/g, \"\");\n");
      out.write("\n");
      out.write("\n");
      out.write("if ( ph.length != 10 )\n");
      out.write("{\n");
      out.write("fld.focus();\n");
      out.write("return \"The phone number must contain 10 digits.\\n\";\n");
      out.write("}\n");
      out.write("\n");
      out.write("return \"\";\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("<link href=\"styles.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div id=\"main\">\n");
      out.write("    <!-- header begins -->\n");
      out.write("    <div id=\"header\">\n");
      out.write("        <div id=\"logo\">\n");
      out.write("            <centre><a href=\"#\">Ahmedabad City Police</a></centre>\n");
      out.write("\t\t\t<h2><a href=\"#\">Service . Security . Peace</a></h2>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"buttons\">\n");
      out.write("            <a href=\"home.jsp\" class=\"but\"  title=\"\">Home</a><div class=\"but_razd\"></div>\n");
      out.write("            <a href=\"about_us.jsp\" class=\"but\" title=\"\">About Us</a><div class=\"but_razd\"></div>\n");
      out.write("            <a href=\"police.jsp\"  class=\"but\" title=\"\">Area Police Stations</a><div class=\"but_razd\"></div>\n");
      out.write("            <a href=\"services.jsp\"  class=\"but\" title=\"\">Services</a><div class=\"but_razd\"></div>\n");
      out.write("            <a href=\"contact_us.jsp\" class=\"but\" title=\"\">Feedback</a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("   \n");
      out.write("    <br>\n");
      out.write("   \n");
      out.write("    <div style=\"float:right;width: 75%\">\n");
      out.write("    \n");
      out.write("       <div class=\"box1111\">\n");
      out.write("           <br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<fieldset> \n");
      out.write("                   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <br> <legend> <font face=\"calibri\" color=\"blue\" size=\"6\"> <center>FREE SIGNUP </font></legend>  </h1> </center><br>\n");
      out.write("                       <br><form name=\"myform\" method=\"post\" action=\"userdetail\" onsubmit=\"return checkWholeForm(this);\">\n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font face=\"calibri\"> UserName <font color=\"red\"> * </font> : &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <input type =\"text\" name=\"username\" required style=\"border:1px solid #000000;\"/><br><br>\n");
      out.write("           \n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font face=\"calibri\"> Password <font color=\"red\">  * </font> :&nbsp;&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <input type =\"password\" name=\"password\" required style=\"border:1px solid #000000;\"/><br><br>\n");
      out.write("\n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font face=\"calibri\"> Confirm Password <font color=\"red\"> * </font> :  <input type=\"password\" name=\"password2\" required style=\"border:1px solid #000000;\" /><br><br>\n");
      out.write("\n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font face=\"calibri\"> First Name <font color=\"red\"> * </font>: &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <input type =\"text\" name=\"firstname\" required style=\"border:1px solid #000000;\"/><br><br>\n");
      out.write(" \n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font face=\"calibri\"> Last Name <font color=\"red\"> * </font>: &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <input type =\"text\" name=\"lastname\" required style=\"border:1px solid #000000;\"/><br><br>\n");
      out.write("\n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font face=\"calibri\"> Email id <font color=\"red\"> * </font>:  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <input type =\"text\" name = \"email\" required style=\"border:1px solid #000000;\"/><br><br>\n");
      out.write("\n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font face=\"calibri\"> Address <font color=\"red\"> * </font>: &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <textarea name=\"add\" cols=\"0\" rows=\"0\" style=\"border:1px solid #000000;\"></textarea><br><br>\n");
      out.write("\n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font face=\"calibri\"> Zip Code <font color=\"red\"> * </font>:  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <input type =\"text\" name = \"zipcode\" required style=\"border:1px solid #000000;\"/><br><br>\n");
      out.write("\n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font face=\"calibri\"> Phone No <font color=\"red\"> * </font>:   &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <input type =\"text\" name = \"phno\" required style=\"border:1px solid #000000;\"/><br><br>\n");
      out.write("\n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font face=\"calibri\"> Birth Date : &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <input type=\"text\" name=\"dt\" style=\"border:1px solid #000000;\"> (dd/mm/yyyy)\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<br><br>\n");
      out.write("\n");
      out.write("        <br>\n");
      out.write("\n");
      out.write("        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type =\"submit\" value =\"Submit\"/>\n");
      out.write("<input type =\"reset\" value=\"Reset\"/>\n");
      out.write("Please login after submitting.<br><br>\n");
      out.write("<p><b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Note</b>: Please make sure your details are correct before submitting form and that all fields &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;marked with <font color=\"red\">* </font> are completed!</p>\n");
      out.write("</form></div></div>\n");
      out.write("                   <br>\n");
      out.write("                       <br>\n");
      out.write("\n");
      out.write("\n");
      out.write("</fieldset>\n");
      out.write("</form>\n");
      out.write("      \n");
      out.write("<div class=\"clear\" style=\"height: 20px;\"></div>\n");
      out.write("        \n");
      out.write("   \n");
      out.write("   \n");
      out.write("            <p>Copyright 2016. <!-- Do not remove -->Designed by Anuj & Vama<!-- end --><br />\n");
      out.write("            <a href=\"#\">Privacy Policy</a> | <a href=\"#\">Terms of Use</a> </p>\n");
      out.write("       \n");
      out.write("        <div id=\"footer_box2\">\n");
      out.write("            <a href=\"#\"><img src=\"images/f5.png\" class=\"footer_img\" alt=\"\" /></a>\n");
      out.write("            <a href=\"#\"><img src=\"images/f4.png\" class=\"footer_img\" alt=\"\" /></a>\n");
      out.write("            <a href=\"#\"><img src=\"images/f3.png\" class=\"footer_img\" alt=\"\" /></a>\n");
      out.write("            <a href=\"#\"><img src=\"images/f2.png\" class=\"footer_img\" alt=\"\" /></a>\n");
      out.write("            <a href=\"#\"><img src=\"images/f1.png\" class=\"footer_img\" alt=\"\" /></a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
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
