package carros;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Carros carro = new Carros("Land Rover", "Range Rover Velar HSE", 2024);

        boolean menu = true;

        while (menu) {
            System.out.println("1 - Exibir informações do carro\n2 - Alterar ano\n3 - Sair");
            int op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Marca: " + carro.getMarca());
                    System.out.println("Modelo: " + carro.getModelo());
                    System.out.println("Ano de fabricação: " + carro.getAno());
                    break;
                case 2:
                    System.out.println("Digite o novo ano:");
                    int novoAno = sc.nextInt();
                    carro.setAno(novoAno);
                    System.out.println("Ano de fabricação alterado para " + novoAno);
                    break;
                case 3:
                    System.out.println("Saindo...");
                    menu = false;
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}
