import entities.Ordem;
import enums.OrdemStatus;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Ordem ordem = new Ordem(1080, new Date(), OrdemStatus.AGUARDANDO_PAGAMENTO);

        System.out.println(ordem);

        OrdemStatus os1 = OrdemStatus.ENTREGUE;

        OrdemStatus os2 = OrdemStatus.valueOf("ENTREGUE");

        System.out.println(os1);
        System.out.println(os2);
    }
}