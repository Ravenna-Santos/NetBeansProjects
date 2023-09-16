package javinha;
import java.util.Scanner;

public class DoWhilezinho {
    public static void main(String[] args) {
        int n, s = 0;
        String resp = "";
        Scanner input = new Scanner(System.in);
        do{
            System.out.print("Digite um número: ");
            n = input.nextInt();
            s += n;
            System.out.print("Quer continuar? [S/N]: ");
            resp = input.next();
            
        }
        while (resp.equals("S"));
        System.out.println("A soma de todos os números é: " + s);
        System.out.println("Tchauzinho");
    
    } 
}
/*
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro número do intervalo: ");
        int a = input.nextInt();
        System.out.print("Digite o segundo número do intervalo: ");
        int b = input.nextInt();
        if(a < b){
            int aux = a;
            a = b;
            b = aux;
        }
        do{
            System.out.println(b);
            b++;
            
        }
        while(b <= a);
*/