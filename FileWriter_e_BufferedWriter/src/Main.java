import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String[] linhas = new String[]{"Bom dia", "Boa tarde", "Boa noite"};

        String pacote = "C:\\Users\\samue\\AppData\\Local\\Temp\\teste1.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(pacote, true))){
            for (String linha : linhas) {
                bw.write(linha);
                bw.newLine();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}