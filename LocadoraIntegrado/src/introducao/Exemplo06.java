/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducao;

import java.util.Scanner;

/**
 *
 * @author 201710070027
 */
public class Exemplo06 {
    public static void main(String[] args) {
        int x;
        Scanner input = new Scanner (System.in);
        System.out.print("Digite um número: ");
        x = input.nextInt();
        System.out.println("O antecessor de " + x + " é " + (x-1) + " e o sucessor é " + (x+1));
    }
}
