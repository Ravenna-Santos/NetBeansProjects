package Basica;

public class Processo {
    private int pid;
    private String conteudo;

    public Processo() {
    }

    public Processo(int pid, String conteudo) {
        this.pid = pid;
        this.conteudo = conteudo;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return "[" + "pid=" + this.pid + ", conteudo=" + this.conteudo + ']';
    }

    




    
}