package exercicio1;

import java.util.Scanner;

public class testeFatura {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Invoice fatura= new Invoice();
        System.out.println("Quantos produtos deseja colocar na fatura?");
        int numeroProdutos = input.nextInt();
        Double valorFatura = 0.0;
        for(int  i = 0; i<numeroProdutos; i++){
            System.out.println("Produto "+(i+1)+":");
            System.out.println("Digite a descrição do produto: ");
            fatura.setDescricaoItem(input.next());
            System.out.println("Digite a preço do produto: ");
            fatura.setPrecoItem(input.nextDouble());
            System.out.println("Digite a quantidade do produto: ");
            fatura.setQuantidadeItem(input.nextInt());
            valorFatura += fatura.getInvoiceAmount();
        }
        System.out.println("Total da fatura: R$"+valorFatura);
    }

}
