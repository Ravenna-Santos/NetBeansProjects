
package sistema;

import java.util.Arrays;
import java.util.Scanner;

public class RegraNegocioFuncionario {

    public static void cadastrarFuncionario(){
        
        Scanner input = new Scanner(System.in);
            System.out.print("Digite o cpf do funcionário: ");
            String cpf = input.nextLine();
            System.out.print("Digite o nome do funcionário: ");
            String nome = input.nextLine();
            System.out.print("Digite o rg do funcionário: ");
            String rg = input.nextLine();
            System.out.print("Digite o telefone do funcionário: ");
            String telefone = input.nextLine();
 
    }
     Funcionario fun = new Funcionario(cpf, nome, rg, telefone);
     public static String[] listarFuncionario(){
         
         String[] funcionarios = new String[30];
            int i = 0;
            funcionarios[i] += fun.getCpf() + "," + fun.getNome() + "," +fun.getRg() + "," +fun.getTelefone() + ";";
            i++;
            
       return funcionarios;
    }
}
