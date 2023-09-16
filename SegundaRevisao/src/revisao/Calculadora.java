
package revisao;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        String operacao;
        double num1, num2;
        Scanner input = new Scanner(System.in);
        System.out.println("--------------");
        System.out.println("CALCULADORA");
        System.out.println("--------------");
        System.out.print("Digite qual operação deseja realizar:(+,-,/,*) ");
        operacao = input.nextLine();
        System.out.print("Digite o primeiro número: ");
        num1 = input.nextDouble();
        System.out.print("Digite o segundo número: ");
        num2 = input.nextDouble();
            switch (operacao) {
            case "+":
                System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
                break;
            case "-":
                System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
                break;
            case "/":
                System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
                break;
            case "*":
                 System.out.println(num1 + " X " + num2 + " = " + (num1*num2));
            default:
                System.out.println("A operação digitada é inválida");
                break;
        }
    }
}
