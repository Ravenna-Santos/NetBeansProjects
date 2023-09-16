package colecao;

import java.util.Vector;
import basico.Cliente;
public interface InterfarceColecaoCliente {
	void adicionarCliente(Cliente c);
	void removerCliente(Cliente c);
	Vector<Cliente> listarClientes();
	void atualizarCliente(Cliente c);
	Cliente procurarClienteId(int id);

}
