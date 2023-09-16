
package code;


public class BinDecimal {
   public static int decimal(String bits) {//101
    int tamanho = bits.length(); //2
    int bitAtual = Integer.parseInt(bits.substring(0, 1)); //1
    String bitsRestantes = bits.substring(1); //01 
    if(tamanho > 0){
            return bitAtual * (int) Math.pow(2, tamanho - 1) + decimal(bitsRestantes);
    }
       return 0;
} 
}
