
package revisao.hotel;

public class Formatar {
    public double FormatarHora(String tempoString){
        String[] textoSeparado = tempoString.split(":");
        String horas = textoSeparado[0];
        String minutos = textoSeparado[1];
        double tempo = (Double.parseDouble(horas)) + ((Double.parseDouble(minutos))/60);
        return tempo;
}
}