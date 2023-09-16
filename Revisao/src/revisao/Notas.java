package revisao;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        float soma = 0, media;
        Scanner input = new Scanner(System.in);
        for(int cont = 1; cont <= 3; cont++){
            System.out.println("Digite a nota: ");
            soma = soma + input.nextInt();
        }
        media = soma/ 3;
        if(media >= 6){
            System.out.println("Sua média é: " + media + " e você está aprovado!");
        }else{
            System.out.println("Sua média é: " + media + " e você está reprovado! ;-; ");
        }
    }
}
