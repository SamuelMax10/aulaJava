import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String pacote = "C:\\Users\\samue\\AppData\\Local\\Temp\\teste.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(pacote))) {

            String linha = br.readLine();

            while (linha != null) {
                System.out.println(linha);
                linha = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}