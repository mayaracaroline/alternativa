package dominio;

import java.util.Date;

public class PessoaFisica extends Pessoa {
	protected String cpf;
	protected Genero genero;
	protected Date dataNacimento ;
	
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
  public Genero getGenero() {
    return genero;
  }
  public void setGenero(Genero genero) {
    this.genero = genero;
  }
  public Date getDataNacimento() {
    return dataNacimento;
  }
  public void setDataNacimento(Date dataNacimento) {
    this.dataNacimento = dataNacimento;
  }

}
