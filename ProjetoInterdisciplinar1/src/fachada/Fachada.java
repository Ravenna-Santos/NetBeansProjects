package fachada;

import java.util.Vector;

import basico.Cliente;

import cadastro.CadastroCliente;
import cadastro.InterfarceCadastroCliente;
import colecao.ColecaoClienteDB;


public class Fachada {
	private  InterfarceCadastroCliente cadastroCliente;
	

	
	private Fachada() {
		
		cadastroCliente = new CadastroCliente(new ColecaoClienteDB());
	}
	
	
	private static Fachada instancia;
	

	
	public static Fachada getInstancia() {

		if(instancia == null) {
			instancia = new Fachada();
		}
		return instancia;
	}
	
	
	public void adicionarCliente(Cliente c) {
		cadastroCliente.adicionarCliente(c);
	}
	public void atualizarCliente(Cliente c) {
		cadastroCliente.atualizarCliente(c);
	}
	public Vector<Cliente> listarClientes() {
		return cadastroCliente.listarClientes();
	}
	public Cliente procurarClienteId(int id) {
		return cadastroCliente.procurarClienteId(id);
	}
	public void removerCliente(Cliente c) {
		cadastroCliente.removerCliente(c);
	}
	
}