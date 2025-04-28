package exer1;

public class Cozinha{
    private Geladeira geladeira;
    private Liquidificador liquidificador;
    private Microondas microondas;

    Cozinha(Geladeira geladeira, Liquidificador liquidificador, Microondas microondas){
        this.geladeira=geladeira;
        this.liquidificador=liquidificador;
        this.microondas=microondas;
    }
    
    void ligar(){
        geladeira.ligar();
        liquidificador.ligar();
        microondas.ligar();
    }

    void desligar(){
        geladeira.desligar();
        liquidificador.desligar();
        microondas.desligar();
    }
}
