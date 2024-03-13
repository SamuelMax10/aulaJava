import entities.EntradaLog;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o caminho completo do arquivo: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            Set<EntradaLog> set = new HashSet<>();

            String line = br.readLine();
            while (line != null) {

                String[] fields = line.split(" ");
                String name = fields[0];
                Date moment = Date.from(Instant.parse(fields[1]));

                set.add(new EntradaLog(name, moment));

                line = br.readLine();
            }
            System.out.println("Total de usuários: " + set.size());
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        sc.close();
    }
}