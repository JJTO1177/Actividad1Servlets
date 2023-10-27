package ejemplos.servlet.curso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/myServlet2")
public class MyServlet2 extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String N= request.getParameter("nombre");
		// send HTML page to client
		try {
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head><title>Servlets</title></head>");
			out.println("<body>");
			out.println("<h1>Bienvenido!!  "+N+"</h1>");
			out.println("</body>");
			out.println("</html>");
		} finally {
			out.close();
		}
	}

}