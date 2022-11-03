package me.abdc;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("init");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet");

        resp.getWriter().write("<html>");
        resp.getWriter().write("<head>");
        resp.getWriter().write("<title>Home</title>");
        resp.getWriter().write("</head>");
        resp.getWriter().write("<body>");
        resp.getWriter().write("<h1>Hello Servlet!!</h1>");
        resp.getWriter().write("<h1>Hello " + getName(req) + "</h1>");
        resp.getWriter().write("</body>");
        resp.getWriter().write("</html>");
    }

    private static Object getName(HttpServletRequest req) {
        return req.getServletContext().getAttribute("name");
    }

    @Override
    public void destroy() {
        System.out.println("destroy");
    }
}
