package revisao;

import java.util.Scanner;

public class FraseDNovo {
    public static void main(String[] args) {
        String frase;
        int qtd;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        frase = input.nextLine();
        System.out.print("Digite quantas vezes quer repetir a frase: ");
        qtd = input.nextInt();
        if(qtd <= 0){
            System.out.println("Número inválido");
        }else{
            for(int cont = 1; cont <= qtd; cont++){
            System.out.println(frase);
            }
        }
    }
}
