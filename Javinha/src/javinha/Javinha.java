package javinha;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Javinha {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        String n1 = input.nextLine();
        double a = Double.parseDouble(n1);
        System.out.print("Digite a segunda nota: ");
        String n2 = input.nextLine();
        double b = Double.parseDouble(n2);
        double media = (a + b)/2;
        DecimalFormat formato = new DecimalFormat("#.##");
        String mediaFormatada = formato.format(media);
        System.out.println("A média é: "+ mediaFormatada);
            
        
    }
    
}
