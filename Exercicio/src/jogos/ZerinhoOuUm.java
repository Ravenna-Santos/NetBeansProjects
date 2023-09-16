
package jogos;
import java.util.Random;
import java.util.Arrays;
public class ZerinhoOuUm {
    public static void main(String[] args) {
        Random n = new Random();
        int[] jogadores = new int[3];
        for(int i = 0; i < jogadores.length; i++){
             jogadores[i] = n.nextInt(2);
        }
        System.out.println("As escolhas aleatórias foram: " + Arrays.toString(jogadores));
        if (jogadores[0] != jogadores[1] && jogadores[0] != jogadores[2]){
            System.out.println("O jogador A venceu!");
        }else if(jogadores[1] != jogadores[0] && jogadores[1] != jogadores[2]){
            System.out.println("O jogador B venceu!");
        }else if(jogadores[2] != jogadores[1] && jogadores[2] != jogadores[0]){
            System.out.println("O jogador C venceu!");
        }
    }
}
