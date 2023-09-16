package fachada;

import java.util.Vector;

import basico.Cliente;

import cadastro.CadastroCliente;
import cadastro.InterfarceCadastroCliente;
import colecao.ColecaoClienteDB;


public class Fachada {
	private  InterfarceCadastroCliente cadastroCliente;
	
	
	//Padrão de projeto Singleton - Todas as telas do sistema acessarão 
	//o mesmo objeto da fachada. 
	//O construtor deve ser private
	
	private Fachada() {
		//Inicializar todos os cadastros e coleções
		cadastroCliente = new CadastroCliente(new ColecaoClienteDB());
	}
	
	//Define-se um atributo estático do mesmo tipo da classe chamado instancia
	private static Fachada instancia;
	
	//O método get da instancia também será estático.
	
	public static Fachada getInstancia() {
		//Verifica se a instancia já foi inicializada
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