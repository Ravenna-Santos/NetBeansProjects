package revisao;

import java.util.Scanner;

public class Voto {
    public static void main(String[] args) {
        int idade;
        System.out.println("Digite a idade: ");
        Scanner input = new Scanner(System.in);
        idade = input.nextInt();
        if (idade >= 16){
            System.out.println("Com " + idade + " anos você pode votar!");
        }else{
            System.out.println("Com " + idade + " anos você ainda não pode votar!");
        }
    }
}
