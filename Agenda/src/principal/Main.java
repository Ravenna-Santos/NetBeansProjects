package principal;

import basicas.Contatos;
import java.util.Scanner;
import lista.Lista;

public class Main {

    public static void main(String[] args) {
        Lista lista = new Lista();
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
            System.out.println("6. Pesquisar por nome");
            System.out.println("7. Pesquisar por telefone");
            System.out.println("8. Listar");
            System.out.println("0. SAIR");

            System.out.print("Digite a opção desejada: ");
            opicao = in.nextInt();

            switch (opicao) {
                case 1:
                    System.out.println("Digite o nome, o endereço e telefone nessa ordem e seguidos de um ENTER");
                    Contatos c1 = new Contatos(in.next(), in.next(), in.next());
                    lista.cadastrarNoComeco(c1);
                    break;

                case 2:
                    System.out.println("Digite o nome, o endereço e telefone nessa ordem e seguidos de um ENTER");
                    Contatos c2 = new Contatos(in.next(), in.next(), in.next());
                    lista.cadastrarNoFim(c2);
                    break;

                case 3:
                    lista.removerNoComeco();
                    System.out.println("Contato removido com sucesso");
                    break;

                case 4:
                    lista.removerNoFim();
                    System.out.println("Contato removido com sucesso");
                    break;

                case 5:
                    System.out.print("Digite a posição a ser removida: ");
                    lista.removerPosicao(in.nextInt());
                    System.out.println("Contato removido com sucesso");
                    break;

                case 6:
                    System.out.print("Digite o nome a ser pesquisado: ");
                    lista.pesquisarNome(in.next());
                    break;

                case 7:
                    System.out.print("Digite o telefone a ser pesquisado: ");
                    lista.pesquisarTelefone(in.next());
                    break;

                case 8:
                    lista.listar();
                    break;

                case 0:
                    break;

                default:
                    System.out.println("NÚMERO INVÁLIDO!");
                    break;

            }
        } while (opicao != 0);

        /*Contatos c1 = new Contatos("Ravenna","SB","98800000");
        Contatos c2 = new Contatos("Humanoide","Terra", "20");
        Contatos c3 = new Contatos("Reptiliano", "Subsolo", "30405");
        
        lista.cadastrarNoComeco(c1);
        lista.cadastrarNoFim(c3);
        lista.adicionarPosicao(1, c2);
        lista.listar();
        
        System.out.println("");
        
        lista.pesquisarNome("Ravenna");
        lista.pesquisarTelefone("20");
        
        lista.removerPosicao(1);
        lista.removerNoComeco();
        lista.removerNoFim();
        
        lista.listar();
         */
    }
}
