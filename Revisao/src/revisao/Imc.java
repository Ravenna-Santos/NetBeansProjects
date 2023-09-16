package revisao;

import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        float altura, peso;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite sua altura: ");
        altura = input.nextFloat();
        System.out.print("Digite seu peso: ");
        peso = input.nextFloat();
        calcularImc(altura, peso);
    }
    public static void calcularImc(float altura, float peso){
        float imc = peso/(altura*altura);
        if(imc < 18.5){
            System.out.println("Você está ABAIXO do peso ideal!");
        } else if (imc > 35){
            System.out.println("Você está ACIMA do peso ideal!");
        }else{
            System.out.println("Você está no peso ideal!");
        }

    }
}
