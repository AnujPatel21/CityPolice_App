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
import java.util.logging.Level;
import java.util.logging.Logger;
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
@WebServlet(urlPatterns = {"/lostreport"})
public class lostreport extends HttpServlet {

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
            Class.forName("org.apache.derby.jdbc.ClientDriver");
       
           Connection cn = DriverManager.getConnection("jdbc:derby://localhost:1527/city police","abc","abc");
            
           //System.out.println("hi");
            String fname=(request.getParameter("fname"));
            String lname=(request.getParameter("lname"));
            String mobile=(request.getParameter("phno"));
            String address=(request.getParameter("address"));
            String iname=(request.getParameter("iname"));
            String id=(request.getParameter("id"));
            String dt=(request.getParameter("dt"));
            String ip=(request.getParameter("ip"));
            String ib=(request.getParameter("ib"));
            String ipic=(request.getParameter("ipic"));
            String itype=(request.getParameter("itype"));
       
             String q1="insert into lost values(?,?,?,?,?,?,?,?,?,?,?)";
          
           PreparedStatement pst=cn.prepareStatement(q1);
           
            pst.setString(1, fname);
            pst.setString(2, lname);
            pst.setString(3, mobile);
            pst.setString(4,address);
            pst.setString(5, iname);
            pst.setString(6, id);
            pst.setString(7, dt);
            pst.setString(8, ip); 
            pst.setString(9, ib);
            pst.setString(10, ipic);
            pst.setString(11, itype);
            
            
                    
           // ps.executeUpdate();
           out.println(pst.executeUpdate());
       
           System.out.println("hi");
            pst.close();
            cn.close();
          
       RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
                rd.forward(request,response); 
            
        }
        catch(Exception e)
        {
            out.println("connection not created");
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
            Logger.getLogger(lostreport.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(lostreport.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(lostreport.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(lostreport.class.getName()).log(Level.SEVERE, null, ex);
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
