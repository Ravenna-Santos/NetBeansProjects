
package codes;
public class Collections<T> {
    private Object[] obj = new Object[3];
    private int totalObj = 0;
    public void adicionar(T c){
        aumentaEspaco();
        obj[this.totalObj] = c;
        this.totalObj ++;
    }
    
    public T procurarposicao(int posicao){
        if(!verificaPosicao(posicao)){
            throw new IllegalArgumentException("Posição inválida, verifique a posição!"); 
        }
        return (T) obj[posicao];
    }
   public Object procurarNome(String nome) {
		Object c=null;
		for(int cont=0; cont<this.totalObj;cont ++) {
			 c = (Conta)this.obj[cont];
			if(((Conta)c).getNome().equals(nome)) {
				return c;
			}
		}
		return null;
   }
    

    public String toString(){
        if(this.totalObj == 0){
            return "[]";
        }
        StringBuffer buffer = new StringBuffer();
        buffer.append("[");
        for(int i = 0; i < this.totalObj-1; i++){
            buffer.append(obj[i]);
            buffer.append(",");
        }
        buffer.append(obj[this.totalObj-1]);
        buffer.append("]");
        return buffer.toString();
    }
    
    public void adicionaPosicao(int posicao, T c){
        if(!verificaPosicao(posicao)){
            throw new IllegalArgumentException("Posição inválida, verifique a posição!"); 
        }
        aumentaEspaco();
        for(int i = this.totalObj-1; i >= posicao; i-=1){
            this.obj[i+1] = this.obj[i];
        }
        this.obj[posicao] = c;
        this.totalObj++;
    }
    public void remove(int posicao){
        if(!verificaPosicao(posicao)){
            throw new IllegalAccessError("Posição a ser removida vazia");
        }
        aumentaEspaco();
        for(int i = posicao; i<this.totalObj; i++){
            this.obj[i] = this.obj[i+1];
        }
        this.obj[this.totalObj-1] = null;
        this.totalObj--;
    }
    public boolean verificaPosicao(int posicao){
        return posicao >= 0 && posicao < this.totalObj;
    }
    private  void aumentaEspaco(){
        if(this.totalObj == this.obj.length){
            Object[] newObj = new Object[this.obj.length * 2];
            System.arraycopy(this.obj, 0, newObj, 0, this.obj.length);
            this.obj = newObj;
        }
    }
}
