public class Card {
    enumNaipe Naipe;
    enumValor Valor;
    
    public Card(enumNaipe naipe, enumValor valor){
        Naipe=naipe;
        Valor=valor;
    }

    @Override
    public String toString() {
        return Valor + " de " + Naipe;
    }
}
