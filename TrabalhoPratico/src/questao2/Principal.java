
package questao2;


public class Principal {
    public static void main(String[] args) {
        Gerente g = new Gerente ("departamentoA ", 123,"Gerente nem é gente");
        System.out.println(g);
        Vendedor v = new Vendedor((float) 0.5, 100, "Vida de Empreguete");
        System.out.println(v);
        System.out.println(Vendedor.calcularSalario(v.getPercentualComissao(),v.getSalario()));
    }
}
