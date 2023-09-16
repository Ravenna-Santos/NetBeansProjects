package cadastro;


import java.util.Vector;

import basico.Cliente;
import colecao.InterfarceColecaoCliente;

public class CadastroCliente implements InterfarceCadastroCliente {
	
	private InterfarceColecaoCliente colecaoCliente;

	public CadastroCliente(InterfarceColecaoCliente colecaoCliente) {
		this.colecaoCliente = colecaoCliente;
	}

	public void adicionarCliente(Cliente c) {
		colecaoCliente.adicionarCliente(c);
	}

	
	public void atualizarCliente(Cliente c) {
		colecaoCliente.atualizarCliente(c);
	}


	public Vector<Cliente> listarClientes() {
		return colecaoCliente.listarClientes();
	}


	public Cliente procurarClienteId(int id) {
		return colecaoCliente.procurarClienteId(id);
	}


	public void removerCliente(Cliente c) {
		colecaoCliente.removerCliente(c);
	}
	
	
}

