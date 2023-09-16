
package code;
import java.util.Scanner;

public class Matriz3X3 {
    public static void main(String[] args) {
        double num;
        double soma = 0;
        double max = 0;
        StringBuilder builder = new StringBuilder();
        double[][] matriz = new double [3][3];
        Scanner input = new Scanner(System.in);
        for(int cont = 0; cont < matriz.length; cont ++){
           for(int cont2 = 0; cont2 < matriz[cont].length; cont2 ++){
               System.out.print("Digite um número para a matriz: ");
               num = input.nextDouble();
               
               matriz[cont][cont2] = num;
               builder.append(matriz[cont][cont2]).append(" ");
               if(cont2 ==2 ){
                   builder.append( System.lineSeparator());
               }
              
               soma += num;
               if(cont == 0 && cont2 == 0){
                   max = num;
               }else if(max<num){
                   max = num;
                   
               }
           }
        }
        
        System.out.println("A soma dos números da matriz é: " + soma);
        System.out.println("O maior número da matriz é: " + max);
        System.out.println("A matriz é: \n" + builder.toString());
             
    }

}
