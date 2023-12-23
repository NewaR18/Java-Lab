package com.example.jpt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class studentDatabase {
    static String driver = "com.mysql.cj.jdbc.Driver";
    static String dbURL = "jdbc:mysql://localhost:3306/javalabs";
    static String dbUser = "root";
    static String dbPassword = "admin";
    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(dbURL, dbUser, dbPassword);
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }
    public static int save(student s) {
        int res = 0;
        try {
            Connection con = studentDatabase.getConnection();
            String myQuery = "insert into student(name,address,phone) values(?,?,?)";
            PreparedStatement ps = con.prepareStatement(myQuery);
            ps.setString(1, s.getName());
            ps.setString(2, s.getAddress());
            ps.setString(3, s.getPhone());
            res = ps.executeUpdate();
            System.out.println("Data inserted... " + res + " row(s)affected!");
            con.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return res;
    }
    public static int update(student s) {
        int res = 0;
        try {
            Connection con = studentDatabase.getConnection();
            String myQuery = "update student set name=?,address=?,phone=? where id=?";
            PreparedStatement ps = con.prepareStatement(myQuery);
            ps.setString(1, s.getName());
            ps.setString(2, s.getAddress());
            ps.setString(3, s.getPhone());
            ps.setInt(4, s.getId());
            res = ps.executeUpdate();
            System.out.println("Data Updated... " + res + " row(s)affected!");
            con.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }

        return res;
    }

    public static int delete(int id) {
        int res = 0;
        try {
            Connection con = studentDatabase.getConnection();
            String myQuery = "delete from student where id=?";
            PreparedStatement ps = con.prepareStatement(myQuery);
            ps.setInt(1, id);
            res = ps.executeUpdate();
            System.out.println("Data deleted... " + res + " row(s)affected!");
            con.close();

        } catch (Exception ex) {
            System.out.println(ex);
        }
        return res;
    }

    public static student getStudentById(int id) {
        student s = new student();
        try {
            Connection con = studentDatabase.getConnection();
            String myQuery = "select * from student where id=?";
            PreparedStatement ps = con.prepareStatement(myQuery);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                s.setId(rs.getInt(1));
                s.setName(rs.getString(2));
                s.setAddress(rs.getString(3));
                s.setPhone(rs.getString(4));
            }
            con.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return s;
    }
    public static List<student> getAllStudent() {
        List<student> list = new ArrayList<student>();
        try {
            Connection con = studentDatabase.getConnection();
            String myQuery = "select * from student";
            PreparedStatement ps = con.prepareStatement(myQuery);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                student s = new student();
                s.setId(rs.getInt(1));
                s.setName(rs.getString(2));
                s.setAddress(rs.getString(3));
                s.setPhone(rs.getString(4));
                list.add(s);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return list;
    }

}

