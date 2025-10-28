import java.util.ArrayList;
import java.util.List;

public class Paciente {
    private String nome;
    private List<Consulta> consultas;
    private List<Tratamento> tratamentos;

    Paciente(String nome){
        this.nome=nome;
        this.consultas = new ArrayList<>();
        this.tratamentos = new ArrayList<>();
    }

    public void adicionarConsulta(Consulta consulta){
        this.consultas.add(consulta);
    }

    public void adicionarTratamento(Tratamento tratamento){
        this.tratamentos.add(tratamento);
    }

    public List<Consulta> getConsultas(){
        return consultas;
    }

    public List<Tratamento> getTratamento(){
        return tratamentos;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    
}