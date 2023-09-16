
package codes;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Collections v = new Collections();
        int opcao = 1;
        do{
            System.out.println("=============================================");
            System.out.println("               BANCO IMAGINÁRIO              ");
            System.out.println("=============================================");
            System.out.println("Lista de operações disponiveis:");
            System.out.println("1.Adicionar contas");
            System.out.println("2.Adicionar conta por posição no vetor");
            System.out.println("3.Procurar conta por nome");
            System.out.println("4.Procurar conta por posição");
            System.out.println("5.Remover conta por posição");
            System.out.println("6.Listar contas");
            System.out.println("0.SAIR");
            System.out.print("Digite o número da operação que deseja realizar: ");
            opcao = in.nextInt();
        switch(opcao){
            case 1:
                System.out.print("Quantas contas deseja adicionar? ");
                int qtd = in.nextInt();
                for(int cont = 0; cont <qtd; cont++){
                    Conta conta = new Conta();
                    System.out.print("Digite o nome da conta: ");
                    conta.setNome(in.next());
                    System.out.print("Digite o valor: ");
                    conta.setValor(in.nextDouble());
                    v.adicionar(conta);
                }
                break;
            case 2:
                System.out.print("Digite a posição para adicionar a conta: ");
                int pos = in.nextInt();
                System.out.print("Digite o nome da conta: ");
                String nome = in.next();
                System.out.print("Digite o valor da conta: ");
                double valor = in.nextDouble();
                Conta c = new Conta(nome, valor);
                v.adicionaPosicao(pos, c);
                break;
            case 3:
                System.out.print("Qual o nome da conta que você deseja procurar? ");
                System.out.println(v.procurarNome(in.next()));
                break;
            case 4:
                System.out.print("Qual a posição da conta que você deseja procurar? ");
                System.out.println(v.procurarposicao(in.nextInt()));
                break;
            case 5:
                System.out.print("Qual a posição da conta que você deseja excluir? ");
                v.remove(in.nextInt());
                break;
            case 6:
                System.out.println(v.toString());
                break;
            case 0:
                break;
            default:
                System.out.println("Número inválido!");
                break;
        }    
        }while(opcao!=0);
       in.close();
}
}
