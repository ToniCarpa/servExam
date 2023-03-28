package utils;

import java.time.format.DateTimeFormatter;

public class Constants {
    // CONEXION
    public static final String DB_USER_CONNECTION = "root";
    public static final String DB_PASS_CONNECTION = "root";
    public static final String DB_DRIVER_CONNECTION = "com.mysql.cj.jdbc.Driver";
    public static final String DB_URL_CONNECTION = "jdbc:mysql://localhost:3306/DbName?useUnicode=true&serverTimezone=UTC&useSSL=false";

    // USUARIO
    public static final String SQL_INSERT_USER =
            "INSERT INTO usuario (name, password, email, linkdin, gitlab) VALUES (?,?,?,?,?)";
    public static final String SQL_SELECT_ALLUSERS =
            "SELECT * FROM usuario;";


}