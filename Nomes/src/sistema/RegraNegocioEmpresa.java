
package sistema;

import java.util.Scanner;

public class RegraNegocioEmpresa {
    String cnpj, nome, telefone;
    public void cadastrarEmpresa(){
        Scanner input = new Scanner(System.in);
            System.out.print("CNPJ da Empresa: ");
            cnpj = input.nextLine();
            System.out.print("Digite o nome da Empresa: ");
            nome = input.nextLine();
            System.out.print("Digite o telefone da Empresa: ");
            telefone = input.nextLine();
            Empresa empresa1 = new Empresa(cnpj, nome, telefone);
            
    }
     Empresa empresa1 = new Empresa(cnpj, nome, telefone);
    public String[] listarEmpresa(){
         String[] empresas = new String[30];
            int i = 0;
            empresas[i] += empresa1.getCnpj() + "," + empresa1.getNome() + "," +empresa1.getTelefone() + ";";
            i++;
            
       return empresas;
    }
}
