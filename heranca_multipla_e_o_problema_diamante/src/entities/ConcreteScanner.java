package entities;

public class ConcreteScanner extends Device implements Scanner {

    public ConcreteScanner(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Processamento do Scanner: "+ doc);
    }

    @Override
    public String scan() {
        return "Conteúdo digitalizado";
    }
}
