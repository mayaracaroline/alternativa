package les.negocio;

import java.math.BigInteger;

import dominio.Cliente;
import dominio.EntidadeDominio;

public class StValidarEnderecosObrigatorios implements IStrategy {

  @Override
  public String processar(EntidadeDominio entidade) {
   String mensagem = "";
   Cliente cliente = (Cliente) entidade;
   
   if(cliente.getEnderecoEntrega().getId().equals(BigInteger.ZERO) ||
       cliente.getEnderecoResidencial().getId().equals(BigInteger.ZERO) ||
       cliente.getEnderecoCobranca().getId().equals(BigInteger.ZERO)) {
     
     mensagem = "� necess�rio preencher ao menos um endere�o: \n Residencial, Entrega e Cobran�a";
     
   }
   
    return mensagem;
  }
  
  

}
