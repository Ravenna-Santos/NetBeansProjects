package arvore;

public class Estrutura {
	
	public No raiz;
		
	public void inserir(int valor) {
		
		inserir(this.raiz,valor);
		
	}

	
	
	private void inserir(No no, int valor) {
		 

		   if (no != null) {
			  
		  
		    if (valor < no.valor) {
		       
		        if (no.esquerda != null) {
		        		//System.out.println(no.valor+"<<<<");
		            inserir(no.esquerda, valor);
		        } else {
		           
		          //  System.out.println("  Inserindo " + valor + " a esquerda de " + no.valor);
		            no.esquerda = new No(valor);
		            
		          //  System.out.println("próximo nó do atual >>> "+ no.esquerda.valor + " esquerda da raiz "+this.raiz.valor+" é "+this.raiz.esquerda.valor);
		        }
		   
		    } else if (valor > no.valor) {
		       
		        if (no.direita != null) {
		      //  	System.out.println(no.valor+"<<<<");
		            inserir(no.direita, valor);
		        } else {
		            
		        //    System.out.println("  Inserindo " + valor + " a direita de " + no.valor);
		            no.direita = new No(valor);
		        }
		    }
		  }else {
			  
			  this.raiz = new No(valor);

		  }
		}
	
	public No removeValorMinimoDaArvore() {
		 return removeValorMinimoDaArvore(this.raiz);
	}
	
	public No removeValorMinimoDaArvore(No no) {
	    if (this.raiz == null) {
	        System.out.println("  ERRO ");
	    } else if (no.esquerda != null) {
		       //System.out.println("Nó  -->> " + no.getValor()); 

	       //System.out.println("Nó Menor -->> " + no.esquerda.getValor()); 
	    	   no.esquerda = removeValorMinimoDaArvore(no.esquerda);
	    	   //System.out.println("Desmontando pilha-->> "+ no.getValor());
	    	  // System.out.println("Desmontando pilha-->> "+ no.esquerda);

	        return no;
	    } else {
	        
	        //System.out.println("Retorna valor = "+no.direita);

	        return no.direita;
	        
	    }
	    return null;
	}
        
        
        public No removeValorMaximoDaArvore() {
		 return removeValorMaximoDaArvore(this.raiz);
	}
	
	public No removeValorMaximoDaArvore(No no) {
	    if (this.raiz == null) {
	        System.out.println("  ERRO ");
	    } else if (no.direita != null) {
		       //System.out.println("Nó  -->> " + no.getValor()); 

	       //System.out.println("Nó Menor -->> " + no.esquerda.getValor()); 
	    	   no.direita = removeValorMaximoDaArvore(no.direita);
	    	   //System.out.println("Desmontando pilha-->> "+ no.getValor());
	    	  // System.out.println("Desmontando pilha-->> "+ no.esquerda);

	        return no;
	    } else {
	        
	        //System.out.println("Retorna valor = "+no.direita);

	        return no.esquerda;
	        
	    }
	    return null;
	}
	
	public void prefixado() {
		prefixado(this.raiz);
	}
	
	public void prefixado(No no) {
		
	    if(no != null){

	    		System.out.println(no.valor);
	        prefixado(no.esquerda);
	        prefixado(no.direita);
	       
	        
	    }
	    
	    return;
	}
	
	public void posfixado() {
		posfixado(this.raiz);
	}

	public void posfixado(No no) {
		
	    if(no != null){
	    	
	    	   posfixado(no.esquerda);
		   posfixado(no.direita);
	       System.out.println(no.valor);
	            
	    }
	    
	    return;
	}
	
	public void inordem() {
		inordem(this.raiz);
	}
	
	public void inordem(No no) {
		
	    if(no != null){
	    	
	    	   inordem(no.esquerda);
		   System.out.println(no.valor);
		   inordem(no.direita);

	            
	    }
	    
	    return;
	}
	
	public No encontraMinimo() {
		return encontraMinimo(this.raiz);
	}
	
    private No encontraMinimo(No node) {  
        if (node != null) {  
            while (node.getEsquerda() != null) {  
                node = node.getEsquerda();  
            }  
        }  
        return node;  
    }
    
    
    public No minimo() {
    		return minimo(this.raiz);
    }
    
    private No minimo(No node) {
    		No menor=node;
    		//System.out.println("Nó"+node.getValor());
    		if(node.esquerda != null) {
    			menor = minimo(node.esquerda);
    		}
    		//System.out.println("Nó"+node.getValor());

    		return menor;
    }
    
    public No maximo() {
    		return maximo(this.raiz);
    }
    
    private No maximo(No node) {
    		No maior=node;
    		//System.out.println("Nó"+node.getValor());
    		if(node.direita != null) {
    			maior = maximo(node.direita);
    		}
    		//System.out.println("Nó"+node.getValor());

    		return maior;
    }
    
    
    public void imprimirArvore(){
        if(this.raiz == null)
            System.out.println("Árvore vazia");
        else
            imprimirArvore(this.raiz);
    }
    
    
    private void imprimirArvore(No node){
        if(node.getEsquerda() != null){
            imprimirArvore(node.getEsquerda());
        }
        if (node.getDireita() != null){
            imprimirArvore(node.getDireita());
        }
        System.out.println("Nó: " + node.getValor());
    }
   
    public int calcularAltura() {
    		return calcularAltura(this.raiz);
    }
    
    private int calcularAltura(No r) {
    	   if (r == null) 
    	      return -1; // altura da árvore vazia
    	   else {
    	      int he = calcularAltura(r.getEsquerda());
    	      int hd = calcularAltura (r.getDireita());
    	      if (he < hd) return hd + 1;
    	      else return he + 1;
    	   }
    	}
    
    
    
   public No excluir(No r, int v){
	if (r == null)
		return null;
	else if (r.valor > v)
		r.esquerda = excluir(r.esquerda, v);
	else if (r.valor < v)
		r.direita = excluir(r.direita, v);
	else { 	/* achou o nó a remover */
		/* nó sem filhos */
		if (r.esquerda == null && r.direita == null) {
			//free (r);
			r = null;
		}
		/* nó só tem filho à direita */
		else if (r.esquerda == null) {
			No t = r;
			r = r.direita;
			//free (t);
		}
			/* só tem filho à esquerda */
			else if (r.direita == null) {
			No t = r;
			r = r.esquerda;
			//free (t);
		}
		/* nó tem os dois filhos */
		else {
			No f = r.esquerda;
			while (f.direita != null) {
				f = f.direita;
			}
			r.valor = f.valor; /* troca as informações */
			f.valor = v;
			r.esquerda = excluir(r.esquerda,v);
		}
	}
	return r;
}



    
}