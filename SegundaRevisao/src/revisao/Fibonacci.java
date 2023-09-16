package revisao;

public class Fibonacci {
    public static void main(String[] args) {
        long num1 = 0;
        long num2 =1;
        long sequencia;
        System.out.println(num1);
        System.out.println(num2);
        do{
            sequencia = num1+num2;
            System.out.println(sequencia);
            num1 = num2;
            num2 = sequencia;
}while(sequencia < 100);
    }
}
