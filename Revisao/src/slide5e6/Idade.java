
package slide5e6;

import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        int anoAtual, anoNasc, idade;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o ano de nascimento: ");
        anoNasc = input.nextInt();
        System.out.print("Digite o ano atual: ");
        anoAtual = input.nextInt();
        idade = anoAtual-anoNasc;
        System.out.println("Você têm " + idade + " anos.");
    }
}
