
package questão1;

import java.text.ParseException;

public class Aplicativo {
    public static void main(String[] args) throws ParseException {
        System.out.print("A data do sistema é ");
        Datas hj = new Datas();
        Datas data = new Datas("02","02","2021");
        System.out.println("Uma data usando o construtor com os 3 atributos: " + data);
        ValidarData teste = new ValidarData();
        System.out.println("A data é válida? " + teste.isDateValid(data.toString()));
        PassarDia mais = new PassarDia();
        System.out.print("Depois da data " + data + " É dia ");
        mais.adicionarDia(data.toString());
        
    }
}
