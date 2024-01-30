import model.entities.Reservas;
import model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Numero do quarto: ");
            int numero = sc.nextInt();
            System.out.print("Data de check-in (dd/MM/yyyy): ");
            Date checkIn = sdf.parse(sc.next());
            System.out.print("Data de check-out (dd/MM/yyyy): ");
            Date checkOut = sdf.parse(sc.next());

            Reservas reservas = new Reservas(numero, checkIn, checkOut);
            System.out.println(reservas);

            System.out.println();
            System.out.println("Entre com os dados atualizados da reserva: ");
            System.out.print("Data de check-in (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Data de check-out (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());

            reservas.updateDates(checkIn, checkOut);
            System.out.println("Reserva: " + reservas);
        } catch (ParseException e) {
            System.out.println("Formato de data incorreto.");
        } catch (DomainException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Erro inesperado.");
        }

        sc.close();
    }

}
