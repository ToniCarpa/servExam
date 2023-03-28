package dao;

import model.Usuari;
import utils.Constants;

import javax.servlet.http.HttpServlet;
import java.sql.*;
import java.util.ArrayList;

public class Dao {

    public Connection conn;

    public void conect() throws SQLException {
        try {
            Class.forName(Constants.DB_DRIVER_CONNECTION);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        //SE CAMBIA LA URL_CONNECTION PARA REMOTO
        conn = DriverManager.getConnection(Constants.DB_URL_CONNECTION, Constants.DB_USER_CONNECTION, Constants.DB_PASS_CONNECTION);
        System.out.println("Todo OK");

        conn.setAutoCommit(false);
    }

    public void close() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (Exception e) {
            System.out.println("Error al Cerrar : " + e);
        }
    }

    //----------------------------------------------------------------------------------------------------------------------
    // INSERT
    public void insertUser(Usuari u) throws SQLException {
        conect();
        try (PreparedStatement ps = conn.prepareStatement(Constants.SQL_INSERT_USER)) {
            ps.setString(1, u.getId());
            ps.setString(2, u.getEmail());
            ps.setString(3, u.getPassword());
            ps.setString(4, u.getAdress());
            ps.setString(5, u.getAdress2());
            ps.setString(6, u.getCity());
            ps.setString(7, u.getProvince());
            ps.setString(8, u.getZip());
            ps.setString(9, u.getStudent());
            ps.setString(10, u.getDate());
            ps.execute();
            conn.commit();
            close();
        }
    }

    public ArrayList<Usuari> getAllUsers() throws SQLException {
        ArrayList<Usuari> listUsuarios = new ArrayList<>();
        Usuari u = null;
        conect();
        try (PreparedStatement pre = conn.prepareStatement(Constants.SQL_SELECT_ALLUSERS)) {
            try (ResultSet rs = pre.executeQuery()) {
                while (rs.next()) {
                    listUsuarios.add(new Usuari(rs.getString("id"), rs.getString("email"), rs.getString("password"), rs.getString("adress"), rs.getString("adress2"), rs.getString("city"), rs.getString("providence"), rs.getString("zip"), rs.getString("student"), rs.getString("date")));
                }
            }
        }
        close();
        return listUsuarios;
    }
}
