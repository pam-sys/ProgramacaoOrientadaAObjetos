package exer2;


public class Computador {
    private CPU cpu ;
    private  Monitor monitor;
    private Teclado teclado;

    Computador(Teclado teclado, Monitor monitor, CPU cpu){
        this.teclado=teclado;
        this.monitor=monitor;
        this.cpu=cpu;
    }
    
    void ligar(){
        teclado.ligar();
        monitor.ligar();
        cpu.ligar();
    }

    void desligar(){
        teclado.desligar();
        monitor.desligar();
        cpu.desligar();
    }
    
}
