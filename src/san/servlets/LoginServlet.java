package san.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDateTime;

public class LoginServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
        System.out.println("Login Servlet Called..");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //System.out.println("Form is posted");
        System.out.println("User :: " + req.getParameter("txtUser"));
        //String u=req.getParameter("txtUser");
        //resp.sendRedirect("display.jsp?user=u");
        req.setAttribute("course","JAVA");
        RequestDispatcher rd=req.getRequestDispatcher("display.jsp");
        rd.forward(req,resp);
    }
}
