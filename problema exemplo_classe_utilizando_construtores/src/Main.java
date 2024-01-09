import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o dado do produto:");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Preço: ");
        double preco = sc.nextDouble();
        Product product = new Product(nome, preco);

        product.setNome("Computador");
        System.out.println("Nome atualizado: " + product.getNome());
        product.setPreco(1200.00);
        System.out.println("Preço atualizado: " + product.getPreco());
        System.out.println();
        System.out.println("Dado do produto: " + product);

        System.out.println();
        System.out.print("Insira a quantidade de produto a serem adicionados em estoque: ");
        int quantidade = sc.nextInt();
        product.addproduto(quantidade);

        System.out.println();
        System.out.println("Atualizar produto: " + product);

        System.out.println();
        System.out.print("Insira a quantidade de produtos a serem retirados do estoque: ");
        quantidade = sc.nextInt();
        product.removerProduto(quantidade);

        System.out.println();
        System.out.println("Atualizar produto: " + product);
    }

}