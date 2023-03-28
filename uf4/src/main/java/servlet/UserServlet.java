package servlet;


import service.Service;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "user", urlPatterns = {"/user.do","/user"})
public class UserServlet extends HttpServlet {

    private Service service;

    public UserServlet() {
        super();
        this.service = new Service();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("user.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("listUsuari", this.service.getAllUsers());
        service.pro(req);
        service.che(req);
        getServletContext().getRequestDispatcher("home.jsp").forward(req, resp);

    }
}
