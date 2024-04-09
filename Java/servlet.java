import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;

public class servlet extends HttpServelt {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        String username = request.getParmter("username");
        String password = request.getParmter("password");

        PrintWriter out = response.getWriter();

        out.println("username:" + username);
        out.println("password:" + password);

        out.close();
    }
}