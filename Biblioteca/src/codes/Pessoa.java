
package codes;


public class Pessoa {
    private String nomeCompleto;
    private String enderecoRua;
    private String enderecoCidade;
    private String telefone;
    private String cpf;


    public Pessoa() {
    }

    public Pessoa(String nome, String enderecoRua, String enderecoCidade, String telefone, String cpf) {
        this.nomeCompleto = nome;
        this.enderecoRua = enderecoRua;
        this.enderecoCidade = enderecoCidade;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEnderecoRua() {
        return enderecoRua;
    }

    public void setEnderecoRua(String enderecoRua) {
        this.enderecoRua = enderecoRua;
    }

    public String getEnderecoCidade() {
        return enderecoCidade;
    }

    public void setEnderecoCidade(String enderecoCidade) {
        this.enderecoCidade = enderecoCidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
}
