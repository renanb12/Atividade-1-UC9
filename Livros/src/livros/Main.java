package livros;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Livros livro = new Livros("Harry Poter", "J. K. Rowling", 1998);

        int op = 0;
        boolean menu = true;

        while (menu) {
            System.out.println("1 - Exibir informações do livro\n2 - Alterar ano\n3 - Sair");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Título: " + livro.getTitulo());
                    System.out.println("Autor: " + livro.getAutor());
                    System.out.println("Ano de publicação: " + livro.getAno());
                    break;
                case 2:
                    System.out.println("Digite o novo ano:");
                    int novoAno = sc.nextInt();
                    livro.setAno(novoAno);
                    System.out.println("Ano de publicação alterado para " + novoAno);
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
