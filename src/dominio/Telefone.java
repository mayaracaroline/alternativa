package dominio;

public class Telefone {
  
  private String tipo;
  private int ddd;
  private String numero;
  
  public String getTipo() {
    return tipo;
  }
  public void setTipo(String tipo) {
    this.tipo = tipo;
  }
  public int getDdd() {
    return ddd;
  }
  public void setDdd(int ddd) {
    this.ddd = ddd;
  }
  public String getNumero() {
    return numero;
  }
  public void setNumero(String numero) {
    this.numero = numero;
  }
  
}
