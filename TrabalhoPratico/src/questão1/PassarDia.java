
package questão1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.Date;

public class PassarDia {
    public static String adicionarDia(String dataPass) throws ParseException{
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT);
        LocalDate data = LocalDate.parse(dataPass, parser);
        LocalDate diaSeguinte = data.plusDays(1); 
        Date dt = new SimpleDateFormat("yyyy-MM-dd").parse(diaSeguinte.toString());
        String dataFormatada = new SimpleDateFormat("dd/MM/yyyy").format(dt);
        System.out.println(dataFormatada);
        return null;
    }
}
