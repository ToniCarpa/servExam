package servlet;

import service.Service;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="home", urlPatterns ={"/home.do","/home"})

public class HomeServlet extends HttpServlet {
    private Service service;

    public HomeServlet(Service service) {
        this.service = service;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String mail = req.getParameter("mail");
        String pass = req.getParameter("pass");
        String adres = req.getParameter("adres");
        String adres2 = req.getParameter("adres2");
        String city = req.getParameter("city");
        String pro = req.getParameter("prov");
        String zip = req.getParameter("zip");
        String stud = req.getParameter("stu");
        String date = req.getParameter("date");

        service.ins(mail,pass,adres,adres2,city,pro,zip,stud,date);
        req.setAttribute("listUsuari", this.service.getAllUsers());
        getServletContext().getRequestDispatcher("/home.jsp").forward(req, resp);

    }
}
