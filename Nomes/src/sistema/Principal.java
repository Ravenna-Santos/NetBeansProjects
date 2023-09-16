
package sistema;

import java.util.Arrays;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int opção = 0;
        do{
            Scanner input = new Scanner(System.in);
            System.out.println("__________________________________________");
            System.out.print("Qual opção você deseja? (digite o número)");
            System.out.println("\n__________________________________________");
            System.out.println("1. Cadastrar funcionário.");
            System.out.println("2. Listar funcionários.");
            System.out.println("3. Cadastrar empresa.");
            System.out.println("4. Listar empresas.");
            System.out.println("0. Sair.");
            RegraNegocioFuncionario f1 = new RegraNegocioFuncionario();            
            opção = input.nextInt();
            switch(opção){
                
                case 0:
                    break;
                case 1:
                    f1.cadastrarFuncionario();
                    break;
                case 2:
                    System.out.println(Arrays.toString(f1.listarFuncionario()));
                    break;
                case 3: 
                   RegraNegocioEmpresa.cadastrarEmpresa();
                    break;
                case 4:
                    System.out.println(Arrays.toString(RegraNegocioEmpresa.listarEmpresa()));
                    break;
                default:
                    System.out.println("Número inválido, tente novamente!");
            }
            
        }while(opção != 0);
    }
}
