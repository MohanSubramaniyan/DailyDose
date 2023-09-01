import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.io.*;

@WebServlet("/Login")
public class Login extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String a = request.getParameter("mobile");
        String b = request.getParameter("dob");
        PrintWriter pw = response.getWriter();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abc", "root", "kuttystark");

            PreparedStatement ps = con.prepareStatement("SELECT * FROM task WHERE mobile = ? AND dob = ?");
            ps.setString(1, a);
            ps.setString(2, b);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                // Get data from the ResultSet
                String name = rs.getString(1);
                String dobResult = rs.getString(2);
                String gender = rs.getString(3);
                String mobileResult = rs.getString(4);
                String email = rs.getString(5);

                // Set the data as request attributes
                request.setAttribute("name", name);
                request.setAttribute("dob", dobResult);
                request.setAttribute("gender", gender);
                request.setAttribute("mobile", mobileResult);
                request.setAttribute("email", email);

                // Forward the request to the JSP
                request.getRequestDispatcher("/result.jsp").forward(request, response);
            } else {
                // Handle case where no data was found
                pw.println("No data found for the given mobile and date of birth.");
            }
        } catch (Exception e) {
            pw.println(e);
        }
    }
}
