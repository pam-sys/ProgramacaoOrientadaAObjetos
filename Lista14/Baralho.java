import java.util.Random;
public class Baralho {
     Card cartas[];
    private int topo = 0;

     public Baralho(){
        cartas = new Card[enumNaipe.values().length * enumValor.values().length];
        int index = 0;
        for(enumNaipe naipe: enumNaipe.values()){
            for(enumValor valor: enumValor.values()){
                cartas[index++]=new Card(naipe, valor);
            }
        }
     }

    public void embaralhar(){
        Random rand = new Random();
        for(int i = cartas.length - 1; i > 0; i--){
            int j = rand.nextInt(i + 1);
            Card temp = cartas[i];
            cartas[i] = cartas[j];
            cartas[j] = temp;
        }
         topo = 0;
    }

    public Card comprar(){
         if (topo < cartas.length) {
            return cartas[topo++];
        } else {
            return null; 
        }
    } 
    
     public int cartasRestantes() {
        return cartas.length - topo;
    }
}