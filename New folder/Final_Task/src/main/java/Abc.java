
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.io.*;

@WebServlet("/Abc")
public class Abc extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String a = request.getParameter("name");
		String b = request.getParameter("dob");
		String c = request.getParameter("gender");
		String d = request.getParameter("mobile");
		String e = request.getParameter("email");
		PrintWriter pw = response.getWriter();

		try {
			Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","kuttystark");
            Statement st=con.createStatement();
            st.executeUpdate("insert into task values('"+a+"','"+b+"','"+c+"','"+d+"','"+e+"')");
            pw.println("insert sucessfully");
		} 
		catch (Exception z) 
		{
			pw.println(z);
		}
	}

}
  