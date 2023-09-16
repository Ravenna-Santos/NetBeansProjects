
package slide5e6;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Prestacoes {
    public static void main(String[] args) {
        double compra, prestacao;
        Scanner input = new Scanner(System.in);
        System.out.print("Qual o valor da compra? ");
        compra = input.nextDouble();
        prestacao = compra/5;
        String prest = new DecimalFormat("#,##0.00").format(prestacao);
        System.out.println("Sua compra de R$: " + compra + " foi dividida em  5X de R$: " + prest);
    }
}
