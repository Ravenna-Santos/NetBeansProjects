
package nomes;

import java.util.Arrays;
import java.util.Scanner;

public class Nomes {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String[] nomes = new String[10];
        for (int i=0; i<10; i++) {
            System.out.print("Digite o nome: ");
            nomes[i] = input.nextLine();
    }
        Arrays.sort(nomes);
        System.out.println(Arrays.toString(nomes));
    }
    
}
