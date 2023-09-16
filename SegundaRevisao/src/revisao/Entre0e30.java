
package revisao;

public class Entre0e30 {
    public static void main(String[] args) {
        double soma = 0;
        double multi = 1;
        for(int cont = 1; cont < 30; cont ++){ // considerei um conjunto fechado já q n foi especificado e para o 0 n atrapalhar a multiplicação assim 0 e 30 n pertencem ao conjunto
            if(cont%2!=0){
               soma += cont;  
            }else{
                multi *= cont; 
            }
        }

        System.out.println("Soma ente os números ímpares entre 0 e 30: " + soma);
        System.out.println("multiplicação ente os números pares entre 0 e 30: " + multi);
    }
}
