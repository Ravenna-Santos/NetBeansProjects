package lista;

import basicas.Funcionario;

public class Celula {
	
	private Celula proxima;
	private Funcionario funcionario;
	
	public Celula(Celula proxima, Funcionario funcionario) {
		super();
		this.proxima = proxima;
		this.funcionario = funcionario;
	}

    public Celula() {
    }

	public Celula( Funcionario funcionario) {
		super();
		this.funcionario = funcionario;
	}

	public Celula getProxima() {
		return proxima;
	}

	public void setProxima(Celula proxima) {
		this.proxima = proxima;
	}

	public Funcionario getContato() {
		return funcionario;
	}

	public void setContato( Funcionario funcionario) {
		this.funcionario = funcionario;
	}

}