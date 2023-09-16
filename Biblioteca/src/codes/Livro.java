
package codes;

import java.util.Date;


public class Livro {
    private String nome;
    private String autor;
    private String volume;
    private String editora;
    private int ano;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }
    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }    
    
    public Livro() {
    }

    public Livro(String nome, String autor, String volume, String editora, int ano) {
        this.nome = nome;
        this.autor = autor;
        this.volume = volume;
        this.editora = editora;
        this.ano = ano;
    }




    
    
}
