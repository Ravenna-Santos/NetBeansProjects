package revisao;

import java.util.Scanner;

public class Operaçoes {
    public static void main(String[] args) {
        float n1, n2;
        System.out.println("Digite um número: ");
        Scanner input = new Scanner(System.in);
        n1 = input.nextFloat();
        System.out.println("Digite outro número: ");
        n2 = input.nextFloat();
        System.out.println(n1 + " - " + n2 + " = " + (n1-n2));
        System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
        System.out.println(n1 + " X " + n2 + " = " + (n1*n2));
        System.out.println(n1 + " / " + n2 + " = " + (n1/n2));
        
    }        
}
