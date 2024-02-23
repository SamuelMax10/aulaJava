import entities.ComboDevice;
import entities.ConcretePrinter;
import entities.ConcreteScanner;

public class Main {
    public static void main(String[] args) {

        ConcretePrinter p = new ConcretePrinter("1080");
        p.processDoc("Minha carta");
        p.print("Minha carta");

        System.out.println();
        ConcreteScanner s = new ConcreteScanner("2003");
        s.processDoc("Meu e-mail");
        System.out.println("Resultado da Verificação: " + s.scan());

        System.out.println();
        ComboDevice d = new ComboDevice("2081");
        d.processDoc("Minha dissertação");
        d.print("Minha dissertação");
        System.out.println("Resultado da verificação: " + d.scan());
    }
}