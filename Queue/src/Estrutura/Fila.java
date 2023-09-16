
package Estrutura;


import Basica.Processo;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Fila {
    Queue <Processo> fila = new LinkedList<Processo>();
    
    Stack <Processo> pilha = new Stack <Processo>();

	public void inserir(Processo a) {
		
		fila.add(a);
		
	}
	
	public Processo remover() {
		return fila.remove();
	}
	
	public boolean verifica() {
		return fila.isEmpty();
	}
        
        public void reverter(){
            while(!verifica()){
                pilha.push(fila.remove());
            }
            while(!pilha.isEmpty()){
                fila.add(pilha.pop());
            }
        }
	
	public void mostrar () {
		System.out.println(fila.toString());
	}        
}
