
package questao2;

public class Vendedor extends Empregado {
    private float percentualComissao;
    Empregado e = new Empregado();

    public Vendedor(float percentualComissao, float salario, String nome) {
        this.percentualComissao = percentualComissao;
        this.salario = salario;
        e.setNome(nome);
    }

    public float getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(float percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    
    public static float calcularSalario(float percentualComissao, float salario){
        float salarioAcrecido = salario * (1 + percentualComissao);
        return salarioAcrecido;
    }

    @Override
    public String toString() {
        return "nome= " + e.getNome() + " comissão= " + percentualComissao + " Salário sem comissão R$: " + super.getSalario() + " Salário com comissão R$: ";
    }
    
    
}
