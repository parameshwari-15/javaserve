

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Form
 */
@WebServlet("/Form")
public class Form extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Form() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		out.println("<p>Name: " + username + "</p>");
		String gender = request.getParameter("gender");
		if (gender.equals("m")) {
            out.println("<p>Gender: male</p>");
         } else {
            out.println("<p>Gender: female</p>");
         }
		String[] languages = request.getParameterValues("language");
		out.println("<p>Languages: ");
        for (String language : languages) {
           if (language.equals("c")) {
              out.println("C/C++ ");
           } else if (language.equals("cs")) {
              out.println("C# ");
           } else if (language.equals("java")) {
              out.println("Java ");
           }
        }
        String category=request.getParameter("category");
        out.println("<P>category: "+ category);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
