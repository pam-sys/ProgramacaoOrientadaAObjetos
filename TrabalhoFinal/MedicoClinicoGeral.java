public class MedicoClinicoGeral extends Medico {

    public MedicoClinicoGeral(String nome){
        super(nome);
    }

    @Override
    public void realizarConsulta(Paciente paciente) {
        System.out.println("Clínico geral atendendo paciente: " + paciente.getNome());
    }
}
    

