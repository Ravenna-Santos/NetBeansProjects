
package revisao;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num;
        int cont = 0;
        System.out.println("--------------");
        System.out.println("TABUADA");
        System.out.println("--------------");
        System.out.print("Digite um número para exibir sua tabuada: ");
        num = input.nextDouble();
        while(cont <= 10){
            System.out.println(num + " X " + cont + " = " + (num*cont));
            cont++;
        }
        
        
    }
}
