import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class RegistrationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb", "root", "password");
            PreparedStatement pst = con.prepareStatement(
                "INSERT INTO registrations (name, email) VALUES (?, ?)");
            pst.setString(1, name);
            pst.setString(2, email);
            pst.executeUpdate();
            
            out.println("Registration Successful!");
            con.close();
        } catch (Exception e) {
            out.println("Error: " + e.getMessage());
        }
    }
}
