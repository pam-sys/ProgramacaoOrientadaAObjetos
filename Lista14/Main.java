public class Main{
    
    public static void main(String[] args){
        Baralho baralho = new Baralho();

    
        baralho.embaralhar();

         System.out.println("Cartas distribuídas:");
        for (int i = 0; i < 5; i++) {
            Card carta = baralho.comprar();   
            if (carta != null) {
                System.out.println(carta);    
            }
        }

         System.out.println("Cartas restantes no baralho: " + baralho.cartasRestantes());
    }        
}
