
package codes;

public class Lista {
    int totalElementos = 0;
    Celula cabeca;
    Celula calda;
    
    public void addComeco(Object objeto){
        if(totalElementos == 0){
            Celula nova = new Celula(objeto);
            this.cabeca = nova;
            this.calda = nova;
            
        }else{
            Celula nova = new Celula(this.cabeca, objeto);
            this.cabeca.setAnterior(nova);
            this.cabeca = nova;
        }
        
        this.totalElementos ++;
    }
    public void delComeco(){
        if(listaVazia()){
            System.out.println("Lista vazia");
        }else{
            this.cabeca = this.cabeca.getProxima(); 
            this.totalElementos--;
            
            if (this.totalElementos == 0) {
                this.calda = null;
            }
        }
    }
    
    
    public void addFim(Object objeto){
        if(this.totalElementos == 0){
            addComeco(objeto);
            
        }else{
            Celula nova = new Celula(objeto);
            nova.setAnterior(this.calda);
            this.calda.setProxima(nova);
            this.calda = nova;
           
            this.totalElementos ++;
        }
    }
    
    public void delFim(){
            if(listaVazia()){
                System.out.println("Lista vazia");
            }else if(this.totalElementos==1) {
		delComeco();
            }else{
                this.calda.getAnterior().setProxima(null);
                this.calda = this.calda.getAnterior();
                this.totalElementos--;
            }
        }
    
    public void addPosicao(int posicao, Object objeto){
        if(posicao == 0){
            addComeco(objeto);
        }else if(posicao == this.totalElementos){
            addFim(objeto);
        }else if(!verificarPosicao(posicao)) {
                throw new IllegalArgumentException("Posição Inválida");
            }
                
            Celula anterior = this.cabeca;
            for(int cont = 0; cont < posicao -1; cont++) {
                anterior = anterior.getProxima();
            }
            Celula nova = new Celula(anterior.getProxima(), objeto);
            nova.setAnterior(anterior);
            anterior.getProxima().setAnterior(nova);
            anterior.setProxima(nova);
            this.totalElementos ++;
            
        }
        
    public void delPosicao(int posicao){
        if(!verificarPosicao(posicao)) {
                throw new IllegalArgumentException("Posição Inválida");
        }else if(posicao==this.totalElementos) {
            delFim();
	}else if(posicao==0) {
            delComeco();
	}else {
            Celula anterior = this.cabeca;
            for(int cont = 0; cont < posicao -1; cont++) {
                anterior = anterior.getProxima();
            }
                Celula removida = anterior.getProxima();
                Celula aux = removida.getProxima();
                anterior.setProxima(aux);
                aux.setAnterior(anterior);
                this.totalElementos--;
        }
    }
        
        
    public void imprimir() {
        if(listaVazia()){
            System.out.println("Lista vazia");
            }else{
                Celula impress = this.cabeca;
		
            for(int cont = 0; cont<this.totalElementos-1; cont++) {		
		System.out.print(impress.getObjeto()+"-");
			
		impress = impress.getProxima();
            }
            System.out.print(impress.getObjeto()+"\n");
            }     	
    } 
    private boolean verificarPosicao(int posicao) {
        return posicao >= 0 && posicao < this.totalElementos;
    }
        
    private boolean listaVazia() {
        return this.totalElementos <= 0;
    }
    
}
