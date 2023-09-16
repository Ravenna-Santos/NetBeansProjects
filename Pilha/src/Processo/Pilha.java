
package Processo;


import Basica.Processo;
import java.util.LinkedList;
import java.util.Stack;

public class Pilha {
    LinkedList <Processo> fila = new LinkedList <Processo>();
    
    Stack <Processo> pilha = new Stack <Processo>();

	public void inserir(Processo a) {
		
		pilha.push(a);
		
	}
	
	public Processo remover() {
		return pilha.pop();
	}
	
	public boolean verifica() {
		return pilha.isEmpty();
	}
        
        public void reverter(){
            while(!verifica()){
                fila.add(pilha.pop());
            }
            while(!fila.isEmpty()){
                pilha.push(fila.removeFirst());
            }
        }
	
	public void mostrar () {
		System.out.println(pilha.toString());
	}        
}
