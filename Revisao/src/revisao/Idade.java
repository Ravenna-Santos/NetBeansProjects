package revisao;

import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        int ano;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o ano do seu nascimento: ");
        ano = input.nextInt();
        calcularIdade(ano);
    }
    public static void calcularIdade(int ano){
        System.out.println("Sua idade é " + (2020-ano) + " anos!");
    }
}
