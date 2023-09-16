
package codes;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CadastrarConta cD = new CadastrarConta();
        for(int cont = 0; cont <3; cont++){
            Conta conta = new Conta();
            System.out.print("Digite o nome da conta: ");
            conta.setNome(in.next());
            System.out.print("Digite o valor: ");
            conta.setValor(in.nextDouble());
            cD.adicionarConta(conta);
        }
        
       Conta c = new Conta("nome", 0);
       cD.adicionaPE(2, c);
       
        
       System.out.println(cD.procurarConta(0));
        
       System.out.println(cD.procurarNome("nome"));
       
       cD.del(0);
       
       cD.listarConta();
       
       cD.alocacaoDinamica();
       
       in.close();
    }
}
