package metodos;

public class Exemplo02 {
    public static void main(String[] args) {
        System.out.println("Área 3: " + Matematica.calcularAreaRetangulo(2, 5));
        System.out.println("Área 2: "  + Matematica.calcularAreaRetangulo(1.5, 23));
        
        Matematica math = new Matematica();
        System.out.println("IMC: " + math.calcularImc(5, 6.4));
        
        System.out.println("É par? " + math.isPar(10));
        System.out.println("É impar? " + math.isImpar(10));
        
    }
    
}
