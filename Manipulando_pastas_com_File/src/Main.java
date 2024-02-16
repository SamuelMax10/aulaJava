import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o caminho da pasta: ");
        String strCaminho = sc.nextLine();

        File caminho = new File(strCaminho);

        File[] pastas = caminho.listFiles(File::isDirectory);
        System.out.println("Pastas: ");
        for (File pasta : pastas) {
            System.out.println(pasta);

        }

        System.out.println();

        File[] arquivos = caminho.listFiles(File::isFile);
        System.out.println("Arquivos: ");
        for (File arquivo : arquivos) {
            System.out.println(arquivo);
        }

        System.out.println();

        boolean sucesso = new File(strCaminho + "\\subdir").mkdir();
        System.out.println("Diretorio criado com sucesso: " + sucesso);

    }
}