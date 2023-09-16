package javinha;

public class While {
    public static void main(String[] args) {
        int x = 0;
        System.out.println("Os números pares de 1 à 10 são: ");
        while(x <= 10){
            x++;
            if (x % 2 != 0){
                continue;
            }
        System.out.println(x);
        }
    }
}