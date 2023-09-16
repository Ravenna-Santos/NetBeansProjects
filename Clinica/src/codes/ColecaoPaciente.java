
package codes;

public class ColecaoPaciente {
    private Paciente [] paciente = new Paciente[2];
    private int aux = 0;
    public void cadastrarPaciente(Paciente p){
        paciente[this.aux] = p;
        this.aux ++;
    }
    public void listarPaciente(){
        for(int cont =0; cont < this.paciente.length; cont ++){
            System.out.println(this.paciente[cont]);
        }
    }
    public void procurarPacientePorPosicao(int posi){
        System.out.println(this.paciente[posi]);
    }
}
