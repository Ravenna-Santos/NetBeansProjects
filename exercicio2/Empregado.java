package exercicio2;

public class Empregado {

    private String nome;
    private String sobrenome;
    private double salarioMes;

    public Empregado() {
    }

    public Empregado(String nome, String sobrenome, double salarioMes) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        if (salarioMes < 0) {
            this.salarioMes = 0.0;
        }
        this.salarioMes = salarioMes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalarioMes() {
        return salarioMes;
    }

    public void setSalarioMes(double salarioMes) {
        if (salarioMes < 0) {
            this.salarioMes = 0.0;
        }
        this.salarioMes = salarioMes;
    }
     public void AumentoSalarial(){
         this.salarioMes *=1.1; 
         
     }
    
    
    public Double SalarioAnual() {
        double salarioAno = this.salarioMes * 13;
        return salarioAno;
    }

}
