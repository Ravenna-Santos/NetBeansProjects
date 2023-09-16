
package Main;

import Basica.Processo;
import Processo.Pilha;


public class Principal {
    public static void main(String[] args) {
        Processo p = new Processo (1, "Alguma coisa");
        Processo p2 = new Processo (2, "Alguma outra coisa");
        Pilha pi = new Pilha ();
        pi.inserir(p);
        pi.inserir(p2);
        pi.mostrar();
        //System.out.println(pi.verifica()); 
        //pi.remover();
        //pi.mostrar();
        pi.reverter();
        pi.mostrar();
        
    }
}
