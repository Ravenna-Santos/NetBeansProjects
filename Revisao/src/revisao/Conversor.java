package revisao;

import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        float metro;
        System.out.println("Digite a metragem: ");
        Scanner input = new Scanner(System.in);
        metro = input.nextFloat();
        System.out.println(metro + "m são " + (metro * 100) + "cm");
    }
}
