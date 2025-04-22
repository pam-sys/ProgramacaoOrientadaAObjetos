public class Dispositivo {
    private int codigo;
    private String nome;

    public Dispositivo(int codigo, String nome){
        this.codigo=codigo;
        this.nome=nome;
    }
    
    public void setCodigo(int codigo){
        this.codigo=codigo;
    }

    public int getCodigo(){
        return codigo;
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }

    public String getNome(){
        return nome;
    }

    public void usar(){
        System.out.println(nome);
    }   
}