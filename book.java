package travel;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class book
 */
@WebServlet("/book")
public class book extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		String ucity=request.getParameter("YourCity");
		String dcity=request.getParameter("destination");
		String TimeS=request.getParameter("time");
		
        PrintWriter out=response.getWriter();
	    
	    String url="jdbc:mysql://127.0.0.1:3306/travels";
	    
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection(url, "root", "Mahadev@13");
            String query= "insert into BookTicket(city, destination, time) values(?,?,?)";
			
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setString(1, ucity);
			ps.setString(2, dcity);
			ps.setString(3, TimeS);
			
			ps.executeUpdate();
			
			
			out.println("Ticket for "+ ucity + " to " + dcity +" is Booked Successfully" );
			out.println("THANK YOU");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			out.println(e);
		}
	}

}
