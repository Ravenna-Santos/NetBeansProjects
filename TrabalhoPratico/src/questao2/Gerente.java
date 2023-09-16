
package questao2;


public class Gerente extends Empregado {
    private String departamento;
    Empregado e = new Empregado();

    public Gerente(String departamento, float salario, String nome) {
        this.departamento = departamento;
        this.salario = salario;
        e.setNome(nome);
        
    }
    
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "nome= "+ e.getNome() +" departamento= " + departamento + " Salário R$: " +this.getSalario();
    }
   
    

    

    
}
