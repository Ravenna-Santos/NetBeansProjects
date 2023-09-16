
package javinha;

import java.util.Scanner;

public class IfzinhoSwitchcase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Você deseja os numerais em Português ou Inglês? ");
        String lan = input.nextLine();
        System.out.print("Digite um número de 0 à 2: ");
        int num = input.nextInt();
        switch (lan) {
            case "Portugues":
                switch (num){
                    case 0:
                        System.out.println("zero");
                        break;
                    case 1:
                        System.out.println("Um");
                        break;
                    case 2:
                        System.out.println("Dois");
                        break;
                    default: 
                        System.out.println("Inválido");
                }
                break;
            case "Ingles":
                switch (num){
                    case 0:
                        System.out.println("zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    default: 
                        System.out.println("Inválido");
                }
                break;
            default:
                System.out.println("Porra");
                break;
        }
        
    }
    
}
   
 

/* if(dia == 1){
            diaSemana = "Domingo";
        }
        else if(dia == 2){
            diaSemana = "Segunda";
        }
        else if(dia == 3){
            diaSemana = "Terça";
        }
        else if(dia == 4){
            diaSemana = "Quarta";
        }
        else if(dia == 5){
            diaSemana = "Quinta";
        }
        else if(dia == 6){
            diaSemana = "Sexta";
        }
        else if(dia == 7){
            diaSemana = "Sábado";
        }
        else{
            System.out.println("Número inválido");
        }
*/
 /*     int dia;
        Scanner input = new Scanner (System.in);
        System.out.print("Digite um número: ");
        dia = input.nextInt();
        String diaSemana = "";
        switch (dia) {
            case 1:
                diaSemana = "Domingo";
                break;
            case 2:
                diaSemana = "Segunda";
                break;
            case 3:
                diaSemana = "Terça";
                break;
            case 4:
                diaSemana = "Quarta";
                break;
            case 5:
                diaSemana = "Quinta";
                break;
            case 6:
                diaSemana = "Sexta";
                break;
            case 7:
                diaSemana = "Sábado";
                break;
            default:
                System.out.println("Número inválido");
                break;
        }
        if(dia <= 7){
            System.out.println("O dia referente à " + dia + " é " + diaSemana);
        }
*/