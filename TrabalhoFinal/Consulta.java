public class Consulta implements Agendavel{
    private String data;
    private Medico medico;
    private Paciente paciente;
    private StatusConsulta status;

    Consulta(String data, Medico medico, Paciente paciente){
        this.data=data;
        this.medico=medico;
        this.paciente=paciente;
        this.status=StatusConsulta.AGENDADA;
    }

    public String getData(){
        return data;
    }

    public Medico getMedico(){
        return medico;
    }

    public Paciente getPaciente(){
        return paciente;
    }

    public StatusConsulta getStatus() {
        return status;
    }

    public void setStatus(StatusConsulta status){
        this.status=status;
    }

     @Override
    public void agendar() {
        this.status = StatusConsulta.AGENDADA;
    }

    public void realizar() {
        this.status = StatusConsulta.REALIZADA;
        medico.realizarConsulta(paciente);
    }

    public void cancelar() {
        this.status = StatusConsulta.CANCELADA;
    }
    
}
