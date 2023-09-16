package revisao;

import java.util.Scanner;

public class DezMill {
    public static void main(String[] args) {
        String frase;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        frase = input.nextLine();
        repetirFrase(frase);
    }
    public static void repetirFrase(String frase){
        for(int cont = 1; cont <= 10000; cont++){
            System.out.println(frase);
        }
    }
}
