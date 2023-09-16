package exercicio1;

public class Invoice {

    private int numeroItem;
    private String descricaoItem;
    private int quantidadeItem;
    private double precoItem;

    public Invoice() {
    }

    public Invoice(int numeroItem, String descricaoItem, int quantidadeItem, double precoItem) {
        this.numeroItem = numeroItem;
        this.descricaoItem = descricaoItem;
        this.quantidadeItem = quantidadeItem;
        this.precoItem = precoItem;
    }

    public int getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(int numeroItem) {
        this.numeroItem = numeroItem;
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public int getQuantidadeItem() {
        return quantidadeItem;
    }

    public void setQuantidadeItem(int quantidadeItem) {
        if (quantidadeItem < 0) {
            this.quantidadeItem = 0;
        } else {
            this.quantidadeItem = quantidadeItem;
        }
    }

    public double getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(double precoItem) {
        if (precoItem < 0) {
            this.precoItem = 0;
        } else {
            this.precoItem = precoItem;
        }
    }

    public double getInvoiceAmount() {
        Double valor = ((double) this.precoItem * this.quantidadeItem);
        return valor;
    }
}
