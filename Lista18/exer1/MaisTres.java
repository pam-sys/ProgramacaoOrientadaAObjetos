package exer1;

public class MaisTres implements Series {
    private int inicio, valor;

    public MaisTres(){
        this.inicio=0;
        this.valor=0;
    }

    @Override
    public int getNext() {
        valor +=3;
        return valor;
    }

    @Override
    public void reset() {
        valor=inicio;
    }

    @Override
    public void setStart(int x) {
       inicio = x;
       valor = x;
    }
    
}
