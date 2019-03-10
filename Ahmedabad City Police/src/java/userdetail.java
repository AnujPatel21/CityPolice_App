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
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author anuj
 */
@WebServlet(urlPatterns = {"/userdetail"})
public class userdetail extends HttpServlet {

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
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) 
        {
           String uname=(request.getParameter("username"));
            String password=(request.getParameter("password"));
            String fname=(request.getParameter("firstname"));
            String lname=(request.getParameter("lastname"));
            String email=(request.getParameter("email"));
            String add=(request.getParameter("add"));
            String zipcode=(request.getParameter("zipcode"));
            String phnoo=(request.getParameter("phno"));
            String bday=(request.getParameter("dt"));
            
            int phno = Integer.parseInt(phnoo);
            int zip = Integer.parseInt(zipcode);
            
            Class.forName("org.apache.derby.jdbc.ClientDriver");
       
           Connection cn = DriverManager.getConnection("jdbc:derby://localhost:1527/city police","abc","abc");
            Statement pst=cn.createStatement();
            
             String q1="insert into users values(?,?,?,?,?,?,?,?,?)";
          
           PreparedStatement ps=cn.prepareStatement(q1);
           
            ps.setString(1, uname);
            ps.setString(2, password);
            ps.setString(3, fname);
            ps.setString(4, lname);
            ps.setString(5, email);
            ps.setString(6, add);
            ps.setInt(7, zip);
            ps.setInt(8, phno); 
            ps.setString(9, bday);
                    
           // ps.executeUpdate();
           out.println(ps.executeUpdate());
       
           System.out.println("hi");
            ps.close();
            cn.close();
            pst.close();
       
            HttpSession s2=request.getSession(true);
            s2.setAttribute("username", uname);
            
            RequestDispatcher rd=request.getRequestDispatcher("serviceshome.jsp");
                rd.forward(request,response); 
        }
        
        catch(Exception e)
        {
            out.println(e);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(userdetail.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(userdetail.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(userdetail.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(userdetail.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
