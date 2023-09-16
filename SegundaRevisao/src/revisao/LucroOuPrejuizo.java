
package revisao;

import java.util.Scanner;

public class LucroOuPrejuizo {
    public static void main(String[] args) {
        double custo, venda;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o preço de custo do produto R$: ");
        custo = input.nextDouble();
        System.out.print("Digite o preço de venda do produto R$: ");
        venda = input.nextDouble();
        if(venda >= (custo*1.5)){
            System.out.println("Houve lucro!");
        }else{
            System.out.println("Houve prejuízo!");
        }
            
     }
        
}
