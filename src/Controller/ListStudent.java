package Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Student_Manage;
import Model.Student;


public class ListStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ListStudent() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Student> ls = new ArrayList<Student>();
		Student_Manage sm = new Student_Manage();
		ls = sm.getAllAtudent();
		System.out.println(ls.get(1).name);
		request.setAttribute("list", ls);
		RequestDispatcher rd = request.getRequestDispatcher("/Student/_index.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)	throws ServletException, IOException {
		doGet(request, response);
	}

}
