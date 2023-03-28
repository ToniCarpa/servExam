package model;

import java.util.Date;

public class Usuari {
    private String id;
    private String email;
    private String password;
    private String adress;
    private String adress2;
    private String city;
    private String province;
    private String zip;
    private String student;
    private String date;

    public Usuari(String id, String email, String password, String adress, String adress2, String city, String province, String zip, String student, String date) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.adress = adress;
        this.adress2 = adress2;
        this.city = city;
        this.province = province;
        this.zip = zip;
        this.student = student;
        this.date = date;
    }

    public Usuari(String email, String password, String adress, String adress2, String city, String province, String zip, String student, String date) {
        this.email = email;
        this.password = password;
        this.adress = adress;
        this.adress2 = adress2;
        this.city = city;
        this.province = province;
        this.zip = zip;
        this.student = student;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getAdress2() {
        return adress2;
    }

    public void setAdress2(String adress2) {
        this.adress2 = adress2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
