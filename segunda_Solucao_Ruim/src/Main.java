import model.entities.Reservas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Numero do quarto: ");
        int numero = sc.nextInt();
        System.out.print("Data de check-in (dd/MM/yyyy): ");
        Date checkIn = sdf.parse(sc.next());
        System.out.print("Data de check-out (dd/MM/yyyy): ");
        Date checkOut = sdf.parse(sc.next());

        if (!checkOut.after(checkIn)) {
            System.out.println("Erro na reserva: a data de check-out deve ser após a data de check-in");
        } else {
            Reservas reservas = new Reservas(numero, checkIn, checkOut);
            System.out.println(reservas);

            System.out.println();
            System.out.println("Entre com os dados atualizados da reserva: ");
            System.out.print("Data de check-in (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Data de check-out (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());

            String erro = reservas.updateDates(checkIn, checkOut);
            if (erro != null)
                System.out.println("Erro na reserva: " + erro);
            else {
                System.out.println("Reserva: " + reservas);
            }


        }
        sc.close();
    }

}
