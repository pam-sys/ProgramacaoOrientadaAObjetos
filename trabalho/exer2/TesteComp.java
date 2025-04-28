package exer2;
public class TesteComp{


    public static void main(String[] args){
    CPU cpu1 = new CPU(true);
    Monitor monitor1 = new Monitor(true);
    Teclado teclado1 = new Teclado(true);
    Computador computador1 = new Computador(teclado1, monitor1, cpu1);
   
    
    computador1.ligar();
    monitor1.observar();
    cpu1.observar();
    teclado1.observar();
    
    computador1.desligar();
    monitor1.observar();
    cpu1.observar();
    teclado1.observar();
    }
}
