package introducao;

public class Exemplo07 {
    public static void main(String[] args) {
        double nota1 = 5.5, nota2 = 10, media;
        media = (nota1 + nota2)/2;
        if(media >= 6){
            System.out.println("Aluno aprovado!");
        }
        else{
            System.out.println("Aluno reprovado!");    
        }
    }
}
