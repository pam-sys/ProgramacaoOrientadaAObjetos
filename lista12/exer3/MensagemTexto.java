public class MensagemTexto extends Mensagem {
    private boolean eTexto;

    public MensagemTexto(String mensagem) {
      super(mensagem);
      eTexto = true;
    }

    @Override
    public String toString() {
      return (super.toString() + "; É um texto? " + eTexto);
    }
}
