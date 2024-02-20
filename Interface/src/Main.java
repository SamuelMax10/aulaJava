import model.entities.AluguelCarro;
import model.entities.Veiculo;
import model.service.BrasilTaxServico;
import model.service.ServicoAluguel;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel");
        System.out.print("Modelo do carro: ");
        String carModelo = sc.nextLine();
        System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime inicio = LocalDateTime.parse(sc.nextLine(), dtf);
        System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), dtf);

        AluguelCarro alugel = new AluguelCarro(inicio, finish, new Veiculo(carModelo));

        System.out.print("Entre com o preço por hora: ");
        double precoHora = sc.nextDouble();
        System.out.print("Entre com o preço por dia: ");
        double precoDia = sc.nextDouble();

        ServicoAluguel sa = new ServicoAluguel(precoHora, precoDia, new BrasilTaxServico());

        sa.processoFatura(alugel);

        System.out.println("FATURA: ");
        System.out.println("Pagamento basico: " + String.format("%.2f",alugel.getFatura().getPagamentoBasico()));
        System.out.println("Imposto: " + String.format("%.2f",alugel.getFatura().getTax()));
        System.out.println("Pagamento total: " + String.format("%.2f",alugel.getFatura().gettotalPagamento()));

        sc.close();
    }
}