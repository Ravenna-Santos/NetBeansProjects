
package numeros;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double[] num = new double[10];
        double soma = 0;
        for (int i=0; i<10; i++) {
            System.out.print("Digite o número: ");
            num[i] = input.nextDouble();
            soma = CalcularValor.calcular(num);
    }
        System.out.println("A soma dos números adicionados ao vetor é: " + soma);
    }
}
