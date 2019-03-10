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

/**
 *
 * @author anuj
 */
@WebServlet(urlPatterns = {"/addfir"})
public class addfir extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter())
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
       
           Connection cn = DriverManager.getConnection("jdbc:derby://localhost:1527/city police","abc","abc");
            
            String ps=(request.getParameter("ps"));
            String date=(request.getParameter("date"));
            String yearr=(request.getParameter("year"));
            String act1=(request.getParameter("act1"));
            String act2=(request.getParameter("act2"));
            String act3=(request.getParameter("act3"));
            String day=(request.getParameter("day"));
            String datefrom=(request.getParameter("datefrom"));
            String dateto=(request.getParameter("dateto"));
            String timefrom=(request.getParameter("timefrom"));
            String timeto=(request.getParameter("timeto"));
            String direction=(request.getParameter("direction"));
            String distance=(request.getParameter("distance"));
            String place=(request.getParameter("place"));
            String name=(request.getParameter("name"));
            String father=(request.getParameter("father"));
            String dob=(request.getParameter("dob"));
            String nationality=(request.getParameter("nationality"));
            String passport=(request.getParameter("passport"));
            String occurrence=(request.getParameter("occurrence"));
            String mobilee=(request.getParameter("mobile"));
            
            int year = Integer.parseInt(yearr);
            int mobile = Integer.parseInt(mobilee);
            
            
            
            
             String q1="insert into fir values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
          
           PreparedStatement pst=cn.prepareStatement(q1);
           
            pst.setString(1, ps);
            pst.setString(2, date);
            pst.setInt(3, year);
            pst.setString(4, act1);
            pst.setString(5, act2);
            pst.setString(6, act3);
            pst.setString(7, day);
            pst.setString(8, datefrom); 
            pst.setString(9, dateto);
            pst.setString(10, timefrom);
            pst.setString(11, timeto);
            pst.setString(12, direction);
            pst.setString(13, distance);
            pst.setString(14, place);
            pst.setString(15, name);
            pst.setString(16, father);
            pst.setString(17, dob);
            pst.setString(18, nationality);
            pst.setString(19, passport);
            pst.setString(20, occurrence);
            pst.setInt(21, mobile);
            
                    
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
            Logger.getLogger(addfir.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(addfir.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(addfir.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(addfir.class.getName()).log(Level.SEVERE, null, ex);
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
