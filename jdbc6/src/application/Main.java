package application;

import db.DB;
import db.DbExeption;
import db.DbIntegrityException;

import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Connection con = null;
        Statement st = null;

        try {
            con = DB.getConexao();
            con.setAutoCommit(false);
            st = con.createStatement();

            int linha1 = st.executeUpdate("update seller set BaseSalary = 2090 where DepartmentId = 1");

//            int x = 1;
//            if (x < 2) {
//                throw new SQLException("Erro falso");
//            }

            int linha2 = st.executeUpdate("update seller set BaseSalary = 3090 where DepartmentId = 2");

            con.commit();

            System.out.println("Linha 1 = " + linha1);
            System.out.println("Linha 2 = " + linha2);

        } catch (SQLException e) {
            try {
                con.rollback();
                throw new DbExeption("Transação não concluida! Causada por: " + e.getMessage());
            } catch (SQLException ex) {
                throw new DbExeption("Erro ao tentar reverter a transação! Causa do erro: " + ex.getMessage());
            }
        } finally {
            DB.fechaStatement(st);
            DB.fechaConexao();
        }
    }
}
