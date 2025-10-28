import java.util.ArrayList;
import java.util.List;

public abstract class Medico {
    private String nome;
    private List<Paciente> pacientes;

    public Medico(String nome){
        this.nome=nome;
        this.pacientes = new ArrayList<>();
    }

    public void adicionarPaciente(Paciente paciente){
        if (!this.pacientes.contains(paciente)) {
            this.pacientes.add(paciente);
        }
    }

    public List<Paciente> getPacientes(){
        return pacientes;
    }

    public String getNome(){
        return nome;
    }

    // polimorfismo: cada tipo de médico implementa sua consulta
    public abstract void realizarConsulta(Paciente paciente);
}
