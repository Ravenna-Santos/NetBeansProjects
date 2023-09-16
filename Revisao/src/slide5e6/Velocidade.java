
package slide5e6;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Velocidade {
    public static void main(String[] args) {
        float velocidade, tempo, deslocamento;
        Scanner input = new Scanner(System.in);
        System.out.print("Qual a distância em kilomentros foi percorrida? ");
        deslocamento = input.nextFloat();
        System.out.print("Qual foi o tempo gasto em horas? ");
        tempo = input.nextFloat();
        velocidade = deslocamento/tempo;
        String veloc = new DecimalFormat("#,##0.00").format(velocidade);
        System.out.println("Sua velocidade média é: " + veloc + "Km/h");
    }
}
