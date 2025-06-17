public class MensagemImagem extends Mensagem {
  private boolean eImagem;

  public MensagemImagem(String mensagem) {
    super(mensagem);
    eImagem = true;
  }

  @Override
  public String toString() {
    return (super.toString() + "; É uma imagem? " + eImagem);
  }

}
