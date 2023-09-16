
package Estrutura;


import Basica.Processo;
import java.util.LinkedList;
import java.util.Stack;

public class Fila {
    LinkedList <Processo> fila = new LinkedList<Processo>();
    
    Stack <Processo> pilha = new Stack <Processo>();

	public void inserir(Processo a) {
		
		fila.addLast(a);
		
	}
	
	public Processo remover() {
		return fila.removeFirst();
	}
	
	public boolean verifica() {
		return fila.isEmpty();
	}
        
        public void reverter(){
            while(!verifica()){
                pilha.push(fila.removeFirst());
            }
            while(!pilha.isEmpty()){
                fila.add(pilha.pop());
            }
        }
	
	public void mostrar () {
		System.out.println(fila.toString());
	}        
}
