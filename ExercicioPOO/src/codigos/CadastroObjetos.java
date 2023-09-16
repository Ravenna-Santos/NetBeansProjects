package codigos;

public class CadastroObjetos {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza();
        pizza1.sabor = "queijo";
        pizza1.valor = 40;
        pizza1.id = 1234;
        
        Cliente cliente1 = new Cliente();
        cliente1.nome = "Raven";
        cliente1.celular = "(75)98800-0000";
        cliente1.id = 12334;
        
        Usuario usuario1 = new Usuario();
        usuario1.id = 123;
        usuario1.password = "hihihihiihihi";
        usuario1.login = "Pessoa";
        
        //listando os dados
        System.out.println("Pizza 1:");
        System.out.println("Sabor: " + pizza1.sabor);
        System.out.println("valor: " + pizza1.valor);
        System.out.println("id: " + pizza1.id);
        System.out.println("Ingredientes: " + pizza1.ingredientes);
        System.out.println("Tipo: " + pizza1.tipo);
        System.out.println(" ");
        
        System.out.println("Cliente 1: ");
        System.out.println("Nome: " + cliente1.nome);
        System.out.println("Celular: " + cliente1.celular);
        System.out.println("id: " + cliente1.id);
        System.out.println("cpf: " + cliente1.cpf);
        System.out.println(" ");
        
        System.out.println("Usuário 1: ");
        System.out.println("Perfil: " + usuario1.perfil);
        System.out.println("Login: " + usuario1.login);
        System.out.println("Password: " + usuario1.password);
        System.out.println("id: " + usuario1.id);
        
    }
}
