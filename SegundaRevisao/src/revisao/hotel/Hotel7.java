
package revisao.hotel;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Hotel7 {
    public static void main(String[] args) {
        String tempoString;
        double tempoFormatado, salario;
        Scanner input = new Scanner(System.in);
        System.out.print("Quantas horas você trabalhou? (horas:minutos): ");
        tempoString = input.nextLine();
        Formatar formatar = new Formatar();
        tempoFormatado = formatar.FormatarHora(tempoString);
        salario = 12.25 * tempoFormatado;
        String salarioFormat = new DecimalFormat("#,##0.00").format(salario);
        System.out.println("Seu salário será de R$: " + salarioFormat);
        if(salario < 50){
             System.out.println("Atenção, dirija-se à direção do Hotel!");
        }
    }
}
