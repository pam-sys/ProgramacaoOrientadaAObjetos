public class Livro {
    private String titulo;
    private String autor;

    public Livro(String titulo){
        this.titulo=titulo;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo=titulo;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor=autor;
    }

    void exibeDados(){
        System.out.println(this.titulo + " " + this.autor);
    }
    
}