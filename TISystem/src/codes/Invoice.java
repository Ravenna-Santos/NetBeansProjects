
package codes;


public class Invoice implements IInvoice {
    private int num;
    private String descricao;
    private int quantidade;
    private double preco;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
            return quantidade;            
    }

    public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;           
    }

    public double getPreco() {
            return preco;            
    }

    public void setPreco(double preco) {
            this.preco = preco;           
    }

    public Invoice() {
    }

    public Invoice(int num, String descricao, int quantidade, double preco) {
        this.num = num;
        this.descricao = descricao;
        if(quantidade <=0){
            this.quantidade = 0;
        }else{
            this.quantidade = quantidade;            
        }
        if(preco <= 0){
            this.preco = 0;
        }else{
           this.preco = preco; 
        } 
    }
    
    @Override
    public double getInvoiceAmount() {
        return (quantidade * preco);
    }
    
}
