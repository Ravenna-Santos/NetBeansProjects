
import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        String nome;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        nome = input.nextLine();
        int idade;
        System.out.print("Digite a sua idade: ");
        idade = input.nextInt();
        int dias = idade * 365;
        System.out.println(nome + ", você já viveu " + dias + " dias!");       
}
}
