package cadastro;

import java.util.Vector;

import basico.Cliente;

public interface InterfarceCadastroCliente {

	public abstract void adicionarCliente(Cliente c);

	public abstract void atualizarCliente(Cliente c);

	public abstract Vector<Cliente> listarClientes();

	public abstract Cliente procurarClienteId(int id);

	public abstract void removerCliente(Cliente c);
}
