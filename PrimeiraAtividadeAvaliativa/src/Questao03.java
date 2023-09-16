
import java.util.Scanner;

public class Questao03 {
  public static void main(String[] args) {
   double c;
      System.out.print("Digite uma temperatura em graus centígrados: ");
      Scanner input = new Scanner (System.in);
      c = input.nextDouble();
      double f = (9 * c + 160)/5;
      System.out.println(c + "°C são " + f + "°F");
}
  
}
