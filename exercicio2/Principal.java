package exercicio2;

public class Principal {

    public static void main(String[] args) {

        Empregado emp1 = new Empregado("João", "Pedro", 100);
        Empregado emp2 = new Empregado("Carlota", "Joaquina", 200);

        System.out.println("Salário mensal de " + emp1.getNome() + " " + emp1.getSobrenome() + ": " + emp1.getSalarioMes());
        System.out.println("Salário anual de " + emp1.getNome() + " " + emp1.getSobrenome() + ": " + emp1.SalarioAnual());

        System.out.println("Salário mensal de " + emp2.getNome() + " " + emp2.getSobrenome() + ": " + emp2.getSalarioMes());
        System.out.println("Salário anual de " + emp2.getNome() + " " + emp2.getSobrenome() + ": " + emp2.SalarioAnual());

        System.out.println("Recebendo aumento de 10% de salário");
        emp1.AumentoSalarial();
        emp2.AumentoSalarial();

        System.out.println("Salário mensal de " + emp1.getNome() + " " + emp1.getSobrenome() + ": " + emp1.getSalarioMes());
        System.out.println("Salário anual de " + emp1.getNome() + " " + emp1.getSobrenome() + ": " + emp1.SalarioAnual());

        System.out.println("Salário mensal de " + emp2.getNome() + " " + emp2.getSobrenome() + ": " + emp2.getSalarioMes());
        System.out.println("Salário anual de " + emp2.getNome() + " " + emp2.getSobrenome() + ": " + emp2.SalarioAnual());

    }
}
