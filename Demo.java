package travel;

import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.sun.jdi.connect.spi.Connection;

/**
 * Servlet implementation class Demo
 */
@WebServlet("/Demo")
public class Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String user=req.getParameter("username");
		String email1=req.getParameter("emailId");
		String user_id=req.getParameter("userId");
		String mobNo=req.getParameter("mobileNo");
		String Pass1=req.getParameter("password");
		String pass2=req.getParameter("password2");
    	
    	PrintWriter out= res.getWriter();
    	//out.println(email);
    	//System.out.println(user);
    	
    	String url="jdbc:mysql://Localhost:3306/travels";
    	
    	try {
    		Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection(url, "root", "Mahadev@13");
			
			String query= "insert into register_tbl(Id, name, email, mob, pass) values(?,?,?,?,?)";
			
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setString(1, user_id);
			ps.setString(2, user);
			ps.setString(3, email1);
			ps.setString(4, mobNo);
			ps.setString(5, Pass1);
			
			ps.executeUpdate();
			
			res.sendRedirect("BookT.jsp");
			
			//out.println("Data Entered Successfully");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			out.println(e);
		}


	}

}

