package entities;

public class ComboDevice extends Device implements Scanner, Printer {
    public ComboDevice(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Processamento combinado: " + doc);
    }

    @Override
    public void print(String doc) {
        System.out.println("Impressão combinada: " + doc);
    }

    @Override
    public String scan() {
        return "Resultado da verificação combinada";
    }
}
