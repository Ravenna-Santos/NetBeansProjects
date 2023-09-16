
package revisao;

import java.util.Scanner;

public class ImparParPrimo {
    public static void main(String[] args) {
        double num;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        num = input.nextDouble();
        System.out.println("O número digitado é: " + ImparPar(num));
        System.out.println("Trata-se de um número primo? " + Primo(num));
        
    }
    public static String ImparPar(double num){
        String x;
        if(num % 2 != 0){
            x = "impar";
        }else{
            x = "par";
        }
        return x;
}
    public static boolean Primo(double num){
        boolean primo = true;
        for(double cont = num-1; cont > 1; cont --){
            if(num % cont == 0){
                primo = false;
            }
        }
        return primo;
    }
    
}