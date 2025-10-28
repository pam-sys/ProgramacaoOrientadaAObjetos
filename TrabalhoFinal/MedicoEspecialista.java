public class MedicoEspecialista extends Medico {
    private String especialidade;

    public MedicoEspecialista(String nome, String especialidade){
        super(nome);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() { return especialidade; }

    @Override
    public void realizarConsulta(Paciente paciente) {
        System.out.println("Especialista (" + especialidade + ") atendendo paciente: " + paciente.getNome());
    }
}
