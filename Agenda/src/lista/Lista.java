package lista;

import basicas.Contatos;

public class Lista {
	
	private Celula primeiro;
	private Celula ultimo;
	
	private int totalDeElementos;
        
	private boolean verificarPosicao(int posicao) {
        return posicao >= 0 && posicao < this.totalDeElementos;
    }
        
        private boolean listaVazia() {
        return this.totalDeElementos <= 0;
    }
	public void cadastrarNoComeco(Contatos contato) {
		
		Celula elemento = new Celula(this.primeiro,contato);
		this.primeiro = elemento;
		
		if(this.totalDeElementos == 0) {
			this.ultimo = elemento;
		}
		
		this.totalDeElementos ++;
		
	}
	
        public void cadastrarNoFim(Contatos contato) {
		if(this.totalDeElementos == 0) {
				cadastrarNoComeco(contato);
			}else {
				Celula nova = new Celula(contato);
				this.ultimo.setProxima(nova);
				this.ultimo = nova;
				this.totalDeElementos++;
			}
        }
	public void listar() {
            if(listaVazia()){
                System.out.println("Lista vazia");
            }else{
                Celula a = this.primeiro;
		
		for(int cont = 0; cont<this.totalDeElementos; cont++) {
			
			System.out.println(a.getContato());
			
			a = a.getProxima();
			
			
		}
            }
                	
	}
        public void adicionarPosicao(int posicao, Contatos contato) {
		  
			if(posicao == 0){ 
		        
				cadastrarNoComeco(contato);
		    
			} else if(posicao == this.totalDeElementos){ 
		       
				cadastrarNoFim(contato);
		
			} else {
		        
				if(!verificarPosicao(posicao)) {
					 throw new IllegalArgumentException("Posição Inválida");
				}
				
				Celula anterior = this.primeiro;
				
				for(int cont = 0; cont < posicao -1; cont++) {
						anterior = anterior.getProxima();
				}
				
		        Celula nova = new Celula(anterior.getProxima(), contato);
		        anterior.setProxima(nova);
		        this.totalDeElementos++;
		}
			
	}
        
        public void removerPosicao(int posicao) {
		
		if(!verificarPosicao(posicao)) {
			 throw new IllegalArgumentException("Posição Inválida");
		}
		
		if(posicao==this.totalDeElementos) {
                    
                    removerNoFim();
                
		}else if(posicao==0) {
                    
                    removerNoComeco();
                    
		}else {
			Celula anterior = this.primeiro;
			
			for(int cont=0;cont<posicao-1;cont++) {
				  anterior = anterior.getProxima();
			  }
			
			anterior.setProxima(anterior.getProxima().getProxima());
	
			 this.totalDeElementos--;
		}
        }
        public void removerNoFim(){
            if (listaVazia()) {
		        throw new IllegalArgumentException("Lista vazia");
		    }
			  
			  Celula penultima = this.primeiro;
			  
			  for(int cont=0;cont<this.totalDeElementos-1;cont++) {
				  penultima = penultima.getProxima();
			  }
			  
			  penultima.setProxima(null);
			  this.ultimo = penultima;
			  
			  this.totalDeElementos--;
        }
        
        public void removerNoComeco(){
            if (listaVazia()) {
                    throw new IllegalArgumentException("Lista vazia");
                }
	    
                this.primeiro = this.primeiro.getProxima();
                this.totalDeElementos--;
                if (this.totalDeElementos == 0) {
               this.primeiro = null;
            }
        }
        
        public void pesquisarNome(String nome){
            
            if(listaVazia()){
                System.out.println("Lista vazia");
            }else{
                Celula a = this.primeiro;
		
		for(int cont = 0; cont<this.totalDeElementos; cont++) {
			
                    if((a.getContato().getNome()).equals(nome)){
                        System.out.println(a.getContato());
                    }
			a = a.getProxima();	
		}
            }
            
        }
        public void pesquisarTelefone(String telefone){
            if(listaVazia()){
                System.out.println("Lista vazia");
            }else{
                Celula a = this.primeiro;
		
		for(int cont = 0; cont<this.totalDeElementos; cont++) {
			
                    if((a.getContato().getTelefone()).equals(telefone)){
                        System.out.println(a.getContato());
                    }
			a = a.getProxima();	
		}
            }
        }
        /*public int total(){
            return this.totalDeElementos;
        }
*/
}