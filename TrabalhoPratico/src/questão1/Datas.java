
package questão1;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Datas {
    private String dia;
    private String mes;
    private String ano;

    public Datas(String dia, String mes, String ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    public Datas() {
       Date date = new Date();
       SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");
       String dataF = formatar.format(date);
       System.out.println(dataF);
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
    @Override
   public String toString() {
       return this.getDia() + "/" + this.getMes() + "/" + this.getAno();
   }
}
