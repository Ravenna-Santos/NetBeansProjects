
package Main;

import Basica.Processo;
import Estrutura.Fila;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        Fila f = new Fila();
        int x;
        int cont = 0;
        do{
            System.out.println("----------------------------------");
            System.out.println("              Menu");
            System.out.println("----------------------------------");
            System.out.println("1. Inserir");
            System.out.println("2. Mostrar");
            System.out.println("3. remover");
            System.out.println("4. reverter");
            System.out.println("0. SAIR");
            System.out.print("Digite uma opção: ");
            x = in.nextInt();
            switch (x){
                    case 1:
                    cont ++;
                    System.out.print("Digite o que deseja imprimir: ");
                    Processo p = new Processo(cont, in.next());
                    f.inserir(p);
                    f.mostrar();
                    break;
                case 2:
                    f.mostrar();
                    break;
                case 3:
                    f.remover();
                    break;
                case 4:
                    f.reverter();
                case 0:
                    break;
            }
        } while(x !=0);
    }
}
