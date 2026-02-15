package in.krishna.bank;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
 
    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();


        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Krishna Bank - Welcome</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Welcome to Vijay Bank</h1>");
        out.println("<p>Simple sample application running on Tomcat (Java 1.8).</p>");
        out.println("<ul>");
        out.println("<li>Customer Name: Krishna</li>");
        out.println("<li>Account Number: 1234567890</li>");
        out.println("<li>Current Balance: ₹ 50,000.00</li>");
        out.println("</ul>");
        out.println("<p><a href=\"index.jsp\">Back to Home</a></p>");
        out.println("</body>");
        out.println("</html>");
    }
}

