package lista;

import basicas.Contatos;

public class Celula {
	
	private Celula proxima;
	private Contatos contato;
	
	public Celula(Celula proxima, Contatos contato) {
		super();
		this.proxima = proxima;
		this.contato = contato;
	}

    public Celula() {
    }

	public Celula(Contatos contato) {
		super();
		this.contato = contato;
	}

	public Celula getProxima() {
		return proxima;
	}

	public void setProxima(Celula proxima) {
		this.proxima = proxima;
	}

	public Contatos getContato() {
		return contato;
	}

	public void setContato(Contatos contato) {
		this.contato = contato;
	}

}