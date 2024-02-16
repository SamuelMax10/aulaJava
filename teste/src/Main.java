// Classe principal para testar membros estáticos
public class Main {
    public static void main(String[] args) {
        // Criando instâncias da classe
        ExemploEstatico instancia1 = new ExemploEstatico(10);
        ExemploEstatico instancia2 = new ExemploEstatico(20);

        // Acessando membros estáticos diretamente pela classe
        System.out.println("Contador de instâncias: " + ExemploEstatico.getContadorInstancias());

        // Acessando membros não estáticos através das instâncias
        System.out.println("Número da Instância 1: " + instancia1.getNumero());
        System.out.println("Número da Instância 2: " + instancia2.getNumero());
    }
}