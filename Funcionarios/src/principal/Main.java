package principal;

import basicas.Funcionario;
import java.util.Scanner;
import lista.ListaSimples;

public class Main {

    public static void main(String[] args) {
        ListaSimples lista = new ListaSimples();
        Scanner in = new Scanner(System.in);
        int opicao = 0;
        do {
            System.out.println("==========================================");
            System.out.println("                    MENU");
            System.out.println("==========================================");
            System.out.println("1. Cadastrar no inicio");
            System.out.println("2. Cadastrar no fim");
            System.out.println("3. Remover no inicio");
            System.out.println("4. Remover no fim");
            System.out.println("5. Remover por posição");
            System.out.println("6. Listar");
            System.out.println("0. SAIR");

            System.out.print("Digite a opção desejada: ");
            opicao = in.nextInt();

            switch (opicao) {
                case 1:
                    System.out.println("Digite o nome, o rg, cpf e idade nessa ordem e seguidos de um ENTER");
                    Funcionario c1 = new Funcionario(in.next(), in.next(), in.next(), in.next());
                    lista.cadastrarNoComeco(c1);
                    break;

                case 2:
                    System.out.println("Digite o nome, o rg, cpf e idade nessa ordem e seguidos de um ENTER");
                    Funcionario c2 = new Funcionario(in.next(), in.next(), in.next(), in.next());
                    lista.cadastrarNoFim(c2);
                    break;

                case 3:
                    lista.removerNoComeco();
                    System.out.println("Funcionário removido com sucesso");
                    break;

                case 4:
                    lista.removerNoFim();
                    System.out.println("Funcionário removido com sucesso");
                    break;

                case 5:
                    System.out.print("Digite a posição a ser removida: ");
                    lista.removerPosicao(in.nextInt());
                    System.out.println("Funcionário removido com sucesso");
                    break;
                            
                case 6:
                    lista.listar();
                    break;

                case 0:
                    break;

                default:
                    System.out.println("NÚMERO INVÁLIDO!");
                    break;

            }
        } while (opicao != 0);

    }
}
