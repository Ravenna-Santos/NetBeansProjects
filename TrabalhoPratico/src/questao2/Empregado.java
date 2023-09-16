
package questao2;

public class Empregado {
     private String nome; //o diagrama representou privado mas assim n dar para ser herdado e preenchido
     protected float salario;

    public Empregado() {
    }

    public Empregado(String nome) {
        this.nome = nome;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empregado{" + "nome=" + nome + ", salario=" + salario + '}';
    }
    
    
}
