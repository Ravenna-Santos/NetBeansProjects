package introducao;

import java.util.Scanner;

public class Exemplo08 {
    public static void main(String[] args) {
        int dia;
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