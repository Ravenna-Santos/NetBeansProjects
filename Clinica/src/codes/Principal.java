
package codes;

public class Principal {
    public static void main(String[] args) {
        Paciente p = new Paciente("Ravenna", "00000000-0", 18);
        Paciente p2 = new Paciente("Maria", "00000000-0", 40);
        ColecaoPaciente cp = new ColecaoPaciente();
        
        cp.cadastrarPaciente(p);
        cp.cadastrarPaciente(p2);
        
        cp.listarPaciente();
        
        cp.procurarPacientePorPosicao(1);
    }
}
