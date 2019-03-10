/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author anuj
 */
@WebServlet(urlPatterns = {"/feedback"})
public class feedback extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) 
        {
             Class.forName("org.apache.derby.jdbc.ClientDriver");
       
           Connection cn = DriverManager.getConnection("jdbc:derby://localhost:1527/city police","abc","abc");
            
            String name=(request.getParameter("Name"));
            String email=(request.getParameter("Email"));
            String phno=(request.getParameter("phno"));
            String add=(request.getParameter("add"));
            String view=(request.getParameter("view"));
            
        /*    out.println(name);
            out.println(email);
            out.println(phno);
            out.println(add);
            out.println(view);
            
   */
            
           
           
          String q1="insert into feedback values(?,?,?,?,?)";
          
          PreparedStatement ps=cn.prepareStatement(q1);
           
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, phno);
            ps.setString(4, add);
            ps.setString(5, view);
                    
                    
            out.println(ps.executeUpdate());
           System.out.println("hi");
          ps.close();
            cn.close();
            
            
      RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
      rd.forward(request,response);   
        }catch(Exception e)
        {
             out.println("connection not created");
        }
        
        
           
        }

    

  @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
