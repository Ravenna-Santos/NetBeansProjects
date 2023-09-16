
package jogos;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class AdivinheNum {
    public static void main(String[] args) {
        int numdig = 0;
        Random n = new Random();
        int num = n.nextInt(99);
        int aux = 0;
        int[] tentativas = new int[100];
        //System.out.println(num);
        Scanner input = new Scanner(System.in);
        System.out.print("Pensei em um número inteiro aleatório entre 0 a 99 advinhe se poder! ");
        while(numdig != num){ 
            numdig = input.nextInt();
            tentativas[aux] = numdig;
            if(numdig == num){
                System.out.println("Parabéns você acertou!");
            }else{
                System.out.println("Haha, acho que não!");
                if(numdig < num){
                    System.out.println("Oops! Esse número é menor que o que eu pensei!");
                }else{
                    System.out.println("Oops! Esse número é maior que o que eu pensei!");
                }
                System.out.print("Tente novamente:");
            }
           aux ++;
        }
        System.out.println("Suas tentativas foram: " + Arrays.toString(tentativas));
    }
}
