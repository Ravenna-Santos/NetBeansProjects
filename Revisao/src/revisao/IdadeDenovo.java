package revisao;

import java.util.Scanner;

public class IdadeDenovo {
    public static void main(String[] args) {
        int ano, idade;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o ano do seu nascimento: ");
        ano = input.nextInt();
        idade = calcularIdade(ano);
        System.out.println("Sua idade é " + idade + " anos!");
    }
    public static int calcularIdade(int ano){
       return(2020-ano);
    }
}
