
package codes;

public class Empregado {
    private String primeiroNome;
    private String sobrenome;
    private double salarioMensal;

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobreNome) {
        this.sobrenome = sobreNome;
    }

    public double getSalarioMensal() {
            return salarioMensal;        
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public Empregado(String primeiroNome, String sobrenome, double salarioMensal) {
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        if (salarioMensal <= 0){
            this.salarioMensal = 0;
        }else{
          this.salarioMensal = salarioMensal; 
        }

    }

    public Empregado() {
    }
    
    public static double getSalarioAnual(double salarioMensal){
        return (salarioMensal*12);
    }
    
    public static double getSalarioAnualAumento(double salarioMensal){
        return ((salarioMensal*12)*1.10);
    }
}
