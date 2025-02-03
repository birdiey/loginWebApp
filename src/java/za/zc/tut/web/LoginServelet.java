
package za.zc.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.soap.Detail;
import za.ac.tut.business.Details;


@WebServlet(name = "LoginServelet", urlPatterns = {"/LoginServelet.do"})
public class LoginServelet extends HttpServlet {

  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String user = request.getParameter("username");
        String pass = request.getParameter("password");
        
        Details det = new Details();
        String details =det.verification(user, pass);
        
        
        request.setAttribute("user", user);
        request.setAttribute("pass", pass);
        request.setAttribute("details", details);
        
        
        RequestDispatcher rD = request.getRequestDispatcher("outcome.jsp");
        rD.forward(request, response);
    }

    
}
