public class Tratamento {
    private String descricao;
    private String inicio;
    private String fim;

    public Tratamento(String descricao, String inicio, String fim) {
        this.descricao = descricao;
        this.inicio = inicio;
        this.fim = fim;
    }

    public String getDescricao() { return descricao; }
    public String getInicio() { return inicio; }
    public String getFim() { return fim; }
    public void setDescricao(String d) { this.descricao = d; }
    public void setInicio(String i) { this.inicio = i; }
    public void setFim(String f) { this.fim = f; }
}
