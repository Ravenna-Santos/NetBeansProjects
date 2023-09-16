package orientacaoobjetos;

public class Cadastro {
    public static void main(String[] args) {
        Aluno alu1 = new Aluno();
        alu1.nome = "Danilo Silva";
        alu1.cpf = "772.334.222-87";
        alu1.curso = "Informática";
        alu1.matricula = "2019.1010115";
        
        Aluno alu2 = new Aluno();
        alu2.nome = "Rafaela Wanderley";
        alu2.curso = "Administração";
        alu2.matricula = null;
        
        //listando os dados
        System.out.println("Aluno 1:");
        System.out.println("Nome: "+alu1.nome); 
        System.out.println("CPF: "+alu1.cpf);
        System.out.println("Curso: "+alu1.curso);
        System.out.println("Matricula: "+alu1.matricula);
        System.out.println("------------------------------");
        System.out.println("Aluno 2:");
        System.out.println("Nome: "+alu2.nome); 
        System.out.println("CPF: "+alu2.cpf);
        System.out.println("Curso: "+alu2.curso);
        System.out.println("Matricula: "+alu2.matricula);
        
        //imprimindo o endereço de memória dos objetos
        System.out.println("endereço objeto alu1: "+alu1);
        System.out.println("endereço objeto alu2: "+alu2);
        System.out.println("Endereço físico classe aluno: "+alu1.getClass().getResource("")); 
        
        //cadastrando livros
        Livro livro1 = new Livro();
        
        
        
        
    }
}
