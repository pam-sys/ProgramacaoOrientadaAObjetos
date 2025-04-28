package exer1;
public class Teste {
    public static void main(String[] args){
    Geladeira geladeira1 = new Geladeira(true);
    Liquidificador liquidificador1 = new Liquidificador(true);
    Microondas microondas1 = new Microondas(true);
    Cozinha cozinha1 = new Cozinha(geladeira1, liquidificador1, microondas1);
   
    
    cozinha1.ligar();
    geladeira1.observar();
    microondas1.observar();
    liquidificador1.observar();
    
    cozinha1.desligar();
    geladeira1.observar();
    microondas1.observar();
    liquidificador1.observar();

    }
        
    
}
