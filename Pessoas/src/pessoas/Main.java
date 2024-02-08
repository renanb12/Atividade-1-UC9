package pessoas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pessoas pessoa = new Pessoas("Renan Bernardo", 17, "Esteio");

        boolean menu = true;

        while (menu) {
            System.out.println("1 - Exibir informações da pessoa\n2 - Alterar idade\n3 - Sair");
            int op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Nome: " + pessoa.getNome());
                    System.out.println("Idade: " + pessoa.getIdade());
                    System.out.println("Cidade: " + pessoa.getCidade());
                    break;
                case 2:
                    System.out.println("Digite a nova idade:");
                    int novaIdade = sc.nextInt();
                    pessoa.setIdade(novaIdade);
                    System.out.println("Idade alterado para " + novaIdade);
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
