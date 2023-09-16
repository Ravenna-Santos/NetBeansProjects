package introducao;

import java.util.Scanner;
import java.text.DecimalFormat; 

public class Exemplo03 {
    public static void main(String[] args) {
        double n1, n2, n3, media;
        String nomeAluno;
        Scanner input = new Scanner(System.in);
        System.out.print("Nome do aluno: ");
        nomeAluno = input.nextLine();
        System.out.print("Digite a nota 1: ");
        n1 = input.nextDouble();
        System.out.print("Digite a notra 2: ");
        n2 = input.nextDouble();
        System.out.print("Digite a nota 3: ");
        n3 = input.nextDouble();
        media = (n1+n2+n3)/3;
        System.out.println("Parabéns "+nomeAluno);
        DecimalFormat formato = new DecimalFormat("#.##");      
        String x = formato.format(media);
        System.out.println("A média entre " + n1 + ", " + n2 + " e " + n3 + " é: " + x);
 
        
    }
}
