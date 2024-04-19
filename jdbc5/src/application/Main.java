package application;

import db.DB;
import db.DbIntegrityException;

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

        System.out.print("Informe o ID do departamento que será excluido: ");
        int departamento = sc.nextInt();

        try {
            con = DB.getConexao();
            ps = con.prepareStatement(
                    "delete from department "
                            + "where "
                            + "(Id = ?) ");

            ps.setInt(1, departamento);

            int linhasAfetada = ps.executeUpdate();

            System.out.println("Pronto! linhas afetadas: " + linhasAfetada);
        } catch (SQLException e) {
            throw new DbIntegrityException(e.getMessage());
        } finally {
            DB.fechaStatement(ps);
            DB.fechaConexao();
        }
    }
}
