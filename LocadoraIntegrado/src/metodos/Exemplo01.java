package metodos;
import java.util.Scanner;

public class Exemplo01 {
    // não retorna nada e não recebe argumentos;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Primeiro executa aqui!!!");
        metodo1();
        System.out.println(metodo2());
        System.out.println(metodo3());
        System.out.println("Média: " + metodo4(8.5, 7));
        //metodo5(80, "José");
        System.out.print("Digite a idade: ");
        int idade = input.nextInt();
        input.nextLine();
        System.out.print("Digite o nome: ");
        String nome = input.nextLine(); //acabar com o lixo do enter
        metodo5(idade, nome);
        
        
    }
    private static void metodo1() {
        System.out.println("Depois executa esse!");
    }
    private static String metodo2(){
        String frase = "Chamou o método 2";
        return frase;
        //return "Chamou o método 2";
    }
    private static int metodo3(){
        return 10;
    }
    private static double metodo4(double valor1, double valor2){
        double media = (valor1 + valor2)/2;
        return media;
    }
    private static void metodo5(int idade, String nome){
        System.out.println("Idade: " + idade);
        System.out.println("Nome: " + nome);
    }
}
// system e scanner n tem main; metodo é a mesma coisa q função; reutilizar code;
// use static ou crie um objeto;
// private n é chamado em outra classe;
// mas public pode; o main tem q ser public;
// System.out.println("Valor1: "+args[0]);
// System.out.println("Valor2: "+args[1]);
/*
public class Exemplo01 {
    public static void main(String[] args) {
        System.out.println("Primeiro executa aqui!!!");
        
       Exemplo01 ex = new Exemplo01();
        ex.metodo1();
    }
    public static void metodo1 () {
        System.out.println("Depois executa esse!");
    }
}
*/