package application;

import db.DB;

import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Connection con = null;
        PreparedStatement ps = null;

        System.out.print("Insira o nome do funcionario: ");
        String nome = sc.nextLine();
        System.out.print("Insira o E-mail: ");
        String email = sc.nextLine();
        System.out.print("Insira a data de aniversario: ");
        LocalDate date = LocalDate.parse(sc.next(), dtf);
        System.out.print("Insira o salario base: ");
        double baseSalario = sc.nextDouble();
        System.out.print("Insira o departamento: ");
        int departamento = sc.nextInt();

        try {
            con = DB.getConexao();

            ps = con.prepareStatement("INSERT INTO seller "
                    + "(Name, Email, BirthDate, BaseSalary, DepartmentId)"
                    + "VALUES "
                    + "(?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, nome);
            ps.setString(2, email);
            ps.setDate(3, Date.valueOf(date));
            ps.setDouble(4, baseSalario);
            ps.setInt(5, departamento);

           int linhasAfetadas = ps.executeUpdate();

            if (linhasAfetadas > 0) {
                ResultSet rs = ps.getGeneratedKeys();
                while (rs.next()) {
                    int id = rs.getInt(1);
                    System.out.println("Pronta! ID = " + id);
                }
            } else {
                System.out.println("Não houve linhas afetadas.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DB.fechaStatement(ps);
            DB.fechaConexao();
        }
    }
}
