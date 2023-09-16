
package codes;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Principal {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Pessoa cliente = new Pessoa("Raven Alguma coisa", "Duque de Caxias", "Santa Brígida", "(75) 98800-0000", "090.000.000-5");
        Livro obra = new Livro("O cosmo de Einstein", "Michio Kaku", "1", "companhia das letras", 2005 );
        Emprestimo emp = new Emprestimo(obra, cliente, formatter.parse("19/07/2020"), formatter.parse("29/07/2020"));
      
        System.out.println("=========================================================");
        System.out.println("       Biblioteca Couro de Vaca e Papel de Cana");
        System.out.println("=========================================================");
        System.out.println("Dados do Cliente: ");
        System.out.println("Nome: " + emp.getPessoa().getNomeCompleto());
        System.out.println("CPF: " + emp.getPessoa().getCpf());
        System.out.println("Endereço: " + emp.getPessoa().getEnderecoCidade() + " Rua: " + emp.getPessoa().getEnderecoRua());
        System.out.println("Telefone: " + emp.getPessoa().getTelefone());
        System.out.println("=========================================================");
        System.out.println("Dados do Livro: ");
        System.out.println(emp.getLivro().getNome() + ", volume " + emp.getLivro().getVolume() + ", de " + emp.getLivro().getAutor()+ ", " + emp.getLivro().getAno() + 
                "\nEditora: " + emp.getLivro().getEditora());
        System.out.println("=========================================================");
        System.out.println("Dados do Emprestimo: ");
        System.out.println("Data de Empretimo: " + formatter.format(emp.getDataEmprestimo()));
        System.out.println("Data de Devolução: " + formatter.format(emp.getDataDevolucao()));
        
    
    }
}
