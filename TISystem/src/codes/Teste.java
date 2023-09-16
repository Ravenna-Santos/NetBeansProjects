
package codes;


public class Teste {
    public static void main(String[] args) {
        Invoice f = new Invoice(203,"Teclado mecânico gamer rgb muito foda", 2, 300);
        System.out.println("==========================================================");
        System.out.println("                         Fatura");
        System.out.println("==========================================================");
        System.out.println("Produto: " + f.getNum() + " - " + f.getDescricao());
        System.out.println("Preço unitário: " + f.getPreco() + " Quantidade: " + f.getQuantidade());
        System.out.println("Total a pagar: " + f.getInvoiceAmount());
    }
}
