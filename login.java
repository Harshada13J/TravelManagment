package travel;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/html");
    	String uname=req.getParameter("name1");
    	String password1=req.getParameter("ps");
    	
	    PrintWriter out=res.getWriter();
	    
	    String url="jdbc:mysql://127.0.0.1:3306/travels";
    	
	    try {
	    	Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection(url, "root", "Mahadev@13");
			Statement stmt = con.createStatement();
			String Query= "select* from register_tbl where name='"+uname+"' and pass='"+password1+"'";
			ResultSet re= stmt.executeQuery(Query);
			
			if(re.next()) {
				//out.println("Login Successful");
				res.sendRedirect("BookT.jsp");
			}else {
				out.println("login Fails");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			out.println(e);
		}
		

	}


	}


