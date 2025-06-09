import exer4.Veiculo;

public class Oficina{
    public void consertar(Veiculo v ){
        v.verificar();
        v.ajustar();
        v.limpar();   
    }
}