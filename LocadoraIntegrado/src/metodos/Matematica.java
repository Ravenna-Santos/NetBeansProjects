package metodos;


public class Matematica {
    public static double calcularAreaRetangulo(double altura, double base){
        double area = altura * base;
        return area;
    }
    public double calcularImc(double peso, double altura){
        return peso/(altura*altura);
    }
    public boolean isPar(int num){
        boolean resultado = false;
        if(num % 2 == 0){
            resultado = true;
        }
        return resultado;
        
    }
    public boolean isImpar(int num){
        boolean resultado = false;
        if (num % 2 != 0){
            resultado = true;
        }
        return resultado;
    }
    
}
