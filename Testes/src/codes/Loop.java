
package codes;

public class Loop {
    public static void main(String[] args) {
        for(int i = 2; i <= 8; i = i + 2){ // entra no caso 2 e 4
            for(int j = i; j <= 4; j++){ // j vai de 2 até 4, no 5 sai do loop 
                for(int k = 1; k <= j; k = k + 1){ // executa loop nos casos j = i logo 2 e 4
                    // k inicia com 1 e é incrementado de 1 em 1, enquanto é menor ou igual a j logo até 4
                    System.out.println(i +", " + j + ", " + k); 
                }
            }
        }
    }
}

/* a saída é:
2, 2, 1
2, 2, 2
2, 3, 1
2, 3, 2
2, 3, 3
2, 4, 1
2, 4, 2
2, 4, 3
2, 4, 4
4, 4, 1
4, 4, 2
4, 4, 3
4, 4, 4
*/