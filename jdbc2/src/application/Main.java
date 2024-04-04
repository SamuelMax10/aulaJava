package application;

import db.DB;
import db.DbExeption;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            con = DB.getConexao();

            st = con.createStatement();

            rs = st.executeQuery("select * from department");

            while (rs.next()) {
                System.out.println(rs.getInt("Id") + "," + rs.getString("Name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DB.fechaResultset(rs);
            DB.fechaStatement(st);
            DB.fechaConexao();
        }
    }
}