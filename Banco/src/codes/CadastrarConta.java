
package codes;

import java.util.Arrays;

public class CadastrarConta {
    Conta [] conta = new Conta[4];
    int totalContas = 0;
    public void adicionarConta(Conta c){
        this.conta[this.totalContas] = c;
        this.totalContas ++; 
        //alocacaoDinamica();
    }
    
    public void listarConta(){
        System.out.println(Arrays.toString(conta));
    }
    
    public Conta procurarConta(int posicao){
        return conta[posicao];
    }
    
    public Conta procurarNome(String nome){
        Conta c = null;
        for(int cont = 0; cont < this.conta.length; cont ++){
            if(this.conta[cont].getNome().equals(nome)){
            c = this.conta[cont];                
            }
        }
        return c;
    }

   /* public Conta procurarNome(String nome){
        Conta c = null;
        int cont =0;
        while(this.conta[cont]!= null){
            if(this.conta[cont].getNome().equals(nome)){
            c = this.conta[cont];
            }
            cont ++;
            
        }
                       
            
        
        return c;
    }
*/
    public boolean posicaoValida(int posicao) {
    return posicao >= 0 && posicao <= this.totalContas;
    }
    
    public void adicionaPE(int posicao, Conta c) {
        if (!this.posicaoValida(posicao)) {
               throw new IllegalArgumentException("Posicao inválida");
        }
           for (int i = this.totalContas - 1; i >= posicao; i--) {
                this.conta[i + 1] = this.conta[i];
            }
        this.conta [posicao] = c;
        this.totalContas++;
        //alocacaoDinamica();
    }
    public void del (int posicao) {
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posicao inválida");
        }
        for (int i = posicao; i < this.totalContas - 1; i++) {
            this.conta[i] = this.conta[i + 1];
            }
        this.totalContas--;
    }

    public boolean posicaoOcupada(int posicao) {
    return posicao < this.conta.length && posicao >= 0;
    }
    
    public void alocacaoDinamica() {
        if (this.totalContas == this.conta.length) {
            Conta[] EspacoContas = new Conta[this.conta.length * 2];
            System.arraycopy(this.conta, 0, EspacoContas, 0, this.conta.length);
            this.conta = EspacoContas;
        }
    }

    
}
