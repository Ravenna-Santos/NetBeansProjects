package basico;

public class Cliente {
	private int id;
	private String nome;
	private String celular;
	private String cpf;
	private String cep;
	private String complEnd;
	private String email;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getComplEnd() {
		return complEnd;
	}
	public void setComplEnd(String compleEnd) {
		this.complEnd = compleEnd;
	}
	
	public Cliente(int id, String nome, String celular, String cpf, String cep, String complEnd, String email) {
		this.id = id;
		this.nome = nome;
		this.celular = celular;
		this.cpf = cpf;
		this.cep = cep;
		this.complEnd = complEnd;
		this.email = email;
	}
	public Cliente() {
	
	}


}
