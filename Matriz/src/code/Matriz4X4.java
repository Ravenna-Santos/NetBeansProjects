
package code;

import java.util.Scanner;


public class Matriz4X4 {
    public static void main(String[] args) {
        double num;
       
        StringBuilder builder = new StringBuilder();
        double[][] matriz = new double [4][4];
        Scanner input = new Scanner(System.in);
        for(int cont = 0; cont < matriz.length; cont ++){
           for(int cont2 = 0; cont2 < matriz[cont].length; cont2 ++){
               System.out.print("Digite um número para a matriz: ");
               num = input.nextDouble();
               matriz[cont][cont2] = num;
               builder.append(matriz[cont][cont2]).append(" ");
               if(cont2 == 3 ){
                   builder.append( System.lineSeparator());
                    }   
                }
           }
        System.out.println("A matriz é: \n" + builder.toString());
        System.out.println("Qual número deseja procurar?\n As linhas e colunas começam em 1 \n(digite a linha, enter, depois a coluna e enter): ");
        int l = input.nextInt();
        int c = input.nextInt();
        System.out.println("O numero que vc procura é: " + matriz[l-1][c-1]);
        }         
    }

