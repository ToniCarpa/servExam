package service;

import dao.Dao;
import model.Usuari;
import utils.Constants;

import javax.servlet.http.HttpServletRequest;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class Service {

    private Dao dao;

    public Service() {
        dao = new Dao();
    }



    /*
    public void insertUser(HttpServletRequest req) {
        try {
            HttpServletRequest reque = (HttpServletRequest) req.getSession().getAttributeNames();
            dao.insertUser((Usuari) reque);
        } catch (SQLException e) {
            req.setAttribute("error", e.getMessage());
            throw new RuntimeException(e);
        }
    }
    */

    // INSERT
    public void ins(String em, String pa, String ad, String ad2, String ci, String pro, String z, String st, String da) {
        try {
            Usuari u = new Usuari(em, pa, ad, ad2, ci, pro, z, st, da);
            dao.insertUser(u);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //ALLUSERS
    public ArrayList<Usuari> getAllUsers() {
        try {
            ArrayList<Usuari> listUsers = dao.getAllUsers();
            return listUsers;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void pro(HttpServletRequest req){
        try{
            ArrayList<Usuari> userList = dao.getAllUsers();
            String option = req.getParameter("op");
            for(Usuari u : userList){
                if(u.getProvince().equals(option)){
                    option="selected";
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void che(HttpServletRequest req){
        try{
            String c = req.getParameter("check");
            if(c != null) req.setAttribute("ckecked", c);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
