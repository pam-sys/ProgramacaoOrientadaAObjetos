public class Usuario {
    private int matricula;
    private String nome;
    private Dispositivo dispositivo;

    public Usuario (int matricula, String nome){
        this.matricula=matricula;
        this.nome=nome;
    }
    
    public void setDispositivo(Dispositivo dispositivo){
        this.dispositivo=dispositivo;
    }

    public Dispositivo getDispositivo(){
        return dispositivo;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public String getNome(){
        return nome;
    }

    public void setMatricula(int matricula){
        this.matricula=matricula;
    }

    public int getMatricula(){
        return matricula;
    }

    public void trabalhar(){
        System.out.println(nome + " esta usando o dispositivo: ");
        dispositivo.usar();
    }
}
