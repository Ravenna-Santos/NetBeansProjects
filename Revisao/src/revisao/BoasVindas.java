package revisao;

import java.util.Scanner;

public class BoasVindas {
    public static void main(String[] args) {
        String nome = "";
        System.out.println("Digite seu nome: ");
        Scanner input = new Scanner(System.in);
        nome = input.nextLine();
        System.out.println("Seja bem vindo, " + nome + "!");
    }
}
