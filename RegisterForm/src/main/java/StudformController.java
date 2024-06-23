

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/StudformController")
public class StudformController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//getting the details from the form
		String name=request.getParameter("name").trim();
		String email=request.getParameter("email").trim();
		String dob=request.getParameter("dob");
		String place=request.getParameter("place").trim();
		String gender=request.getParameter("gender");
		String course=request.getParameter("course");
		
		//store form data in DB
		Stud u=new Stud(name, email, dob, place, gender, course);
		StudDao ud=new StudDao();
		ud.saveData(u);
		request.setAttribute("nm", name);
		RequestDispatcher rd1=request.getRequestDispatcher("success.html");
		rd1.forward(request, response);
		doGet(request, response);
	}

}
