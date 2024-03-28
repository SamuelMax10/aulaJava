import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Coloque o nome completo do arquivo: ");
        String path = sc.nextLine();

        System.out.println("Entre com o salario: ");
        Double salary = sc.nextDouble();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Employee> list = new ArrayList<>();
            String line = br.readLine();
            while (line != null) {
                String[] campos = line.split(",");
                list.add(new Employee(campos[0],campos[1], Double.parseDouble(campos[2])));
                line = br.readLine();
            }

            System.out.println("Email de pessoas cujo salário seja superior a 2000.00: ");

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> emails = list.stream()
                    .filter(e -> e.getSalary() > salary)
                    .map(e -> e.getEmail())
                    .sorted(comp)
                    .collect(Collectors.toList());
            emails.forEach(System.out::println);


        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }


        sc.close();


    }


}