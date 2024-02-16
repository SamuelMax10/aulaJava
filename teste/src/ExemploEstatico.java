public class ExemploEstatico {
    // Membro estático - variável de classe
    private static int contadorInstancias = 0;

    // Membro estático - método de classe
    public static void incrementarContador() {
        contadorInstancias++;
    }

    // Membro não estático - variável de instância
    private int numero;

    // Construtor
    public ExemploEstatico(int numero) {
        this.numero = numero;
        // Chamando o método estático para incrementar o contador sempre que uma instância é criada
        incrementarContador();
    }

    // Método não estático - retorna o número da instância
    public int getNumero() {
        return numero;
    }

    // Método estático - retorna o contador de instâncias
    public static int getContadorInstancias() {
        return contadorInstancias;
    }
}
