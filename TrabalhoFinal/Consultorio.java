import java.util.ArrayList;
import java.util.List;

public class Consultorio {
    private List<Paciente> pacientes = new ArrayList<>();
    private List<Medico> medicos = new ArrayList<>();
    private List<Consulta> consultas = new ArrayList<>();

    public void adicionarPaciente(Paciente p) { pacientes.add(p); }
    public void adicionarMedico(Medico m) { medicos.add(m); }
    public List<Paciente> getPacientes() { return pacientes; }
    public List<Medico> getMedicos() { return medicos; }
    public List<Consulta> getConsultas() { return consultas; }

    public Paciente buscarPacientePorNome(String nome) {
        for (Paciente p : pacientes) {
            if (p.getNome().equalsIgnoreCase(nome)) return p;
        }
        return null;
    }

    public Medico buscarMedicoPorNome(String nome) {
        for (Medico m : medicos) {
            if (m.getNome().equalsIgnoreCase(nome)) return m;
        }
        return null;
    }

    public List<Medico> buscarMedicosPorEspecialidade(String especialidade) {
        List<Medico> res = new ArrayList<>();
        for (Medico m : medicos) {
            if (m instanceof MedicoEspecialista) {
                MedicoEspecialista me = (MedicoEspecialista) m;
                if (me.getEspecialidade().equalsIgnoreCase(especialidade)) res.add(me);
            }
        }
        return res;
    }

    public Consulta agendarConsulta(String data, String nomeMedico, String nomePaciente)
            throws MedicoIndisponivelException {
        Medico medico = buscarMedicoPorNome(nomeMedico);
        if (medico == null) throw new MedicoIndisponivelException("Médico não encontrado: " + nomeMedico);

        Paciente paciente = buscarPacientePorNome(nomePaciente);
        if (paciente == null) {
            paciente = new Paciente(nomePaciente);
            adicionarPaciente(paciente);
        }

        for (Consulta c : consultas) {
            if (c.getMedico().equals(medico) && c.getData().equalsIgnoreCase(data) && c.getStatus() == StatusConsulta.AGENDADA) {
                throw new MedicoIndisponivelException("Médico indisponível na data: " + data);
            }
        } 

        Consulta nova = new Consulta(data, medico, paciente);
        consultas.add(nova);
        paciente.adicionarConsulta(nova);
        medico.adicionarPaciente(paciente);
        nova.agendar();
        return nova;
    }

    public void cancelarConsulta(Consulta consulta) throws ConsultaNaoEncontradaException {
        if (!consultas.remove(consulta)) {
            throw new ConsultaNaoEncontradaException("Consulta não encontrada");
        }
        consulta.cancelar();
    }
}

    

