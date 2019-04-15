package dominio;

public class ItemCarrinho {
  
  EntidadeDominio item;
  int quantidade;
  
  public EntidadeDominio getItem() {
    return item;
  }
  public void setItem(Livro produto) {
    this.item = produto;
  }
  public int getQuantidade() {
    return quantidade;
  }
  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }
  
}
