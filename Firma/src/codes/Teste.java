
package codes;


public class Teste {
    public static void main(String[] args) {
        Empregado e1 = new Empregado("Ravenna","Santos", -4);
        Empregado e2 = new Empregado("Ricy", "Sanchez", 100000);
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("               Firma Chamada Firma");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("Folha de pagamento:");
        System.out.println("O salário anual de " + e1.getPrimeiroNome() + " " + e1.getSobrenome() +
                " é de R$: " + Empregado.getSalarioAnual(e1.getSalarioMensal()));
        System.out.println("O salário anual de " + e2.getPrimeiroNome() + " " + e2.getSobrenome() +
                " é de R$: " + Empregado.getSalarioAnual(e2.getSalarioMensal()));
        System.out.println("================= AUMENTO DE 10% ===================");
        System.out.println("O novo salário anual de " + e1.getPrimeiroNome() + " " + e1.getSobrenome() +
                " é de R$: " + Empregado.getSalarioAnualAumento(e1.getSalarioMensal()));
        System.out.println("O novo salário anual de " + e2.getPrimeiroNome() + " " + e2.getSobrenome() +
                " é de R$: " + Empregado.getSalarioAnualAumento(e2.getSalarioMensal()));
    }
}
