
package slide5e6;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Notas {
    public static void main(String[] args) {
        float soma=0, nota, media;
        Scanner input = new Scanner(System.in);
        for(int cont=0; cont < 3; cont++){
            System.out.print("Digite a nota: ");
            soma = soma + input.nextFloat();
        }
        media = soma/3;
        String mediaformat = new DecimalFormat("#,##0.00").format(media);
        if (media >= 7){
            System.out.println("O aluno está aprovado!E a média foi: " + mediaformat);
        }else if(media >= 5){
                System.out.println("O aluno está de recuperação.E a média foi: " + mediaformat);
            }else{
            System.out.println("O aluno está reprovado!E a média foi: " + mediaformat);
            
        }
        
    }
}
