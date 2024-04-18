package application;

import db.DB;

import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Connection con = null;
        PreparedStatement ps = null;

        System.out.print("Valor do aumento: ");
        double aumento = sc.nextDouble();

        System.out.print("Informe o ID que ira receber esse aumento: ");
        int departamento = sc.nextInt();

        try {
            con = DB.getConexao();
            ps = con.prepareStatement(
                    "update seller "
                            + "set BaseSalary = BaseSalary + ? "
                            + "where "
                            + "(Id = ?) ");
            ps.setDouble(1, aumento);
            ps.setInt(2, departamento);

            int linhasAfetada = ps.executeUpdate();

            System.out.println("Pronto! linhas afetadas: " + linhasAfetada);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DB.fechaStatement(ps);
            DB.fechaConexao();
        }
    }
}
