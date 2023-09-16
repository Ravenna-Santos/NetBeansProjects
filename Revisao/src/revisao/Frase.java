package revisao;

import java.util.Scanner;

public class Frase {
    public static void main(String[] args) {
        String frase;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        frase = input.nextLine();
        for(int cont =1; cont <= 1000; cont++){
            System.out.println(frase);
        }
        
    }
}
