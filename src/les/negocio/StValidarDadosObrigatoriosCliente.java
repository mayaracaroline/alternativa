package les.negocio;

import java.time.LocalDate;

import dominio.Cliente;
import dominio.EntidadeDominio;
import dominio.Genero;

public class StValidarDadosObrigatoriosCliente implements IStrategy {

  @Override
  public String processar(EntidadeDominio entidade) {

    Cliente cliente = (Cliente) entidade;
    
    StringBuilder mensagem = new StringBuilder();
    
    if(cliente.getGenero().equals(Genero.valueOf("SELECIONE"))){
      mensagem.append("Informe o g�nero \n");
    }
    
    if(cliente.getNome().equals("")){
      mensagem.append("� necess�rio informar o nome\n");
    }

    if(cliente.getDataNascimento().equals(LocalDate.of(1800, 01, 01))){
      mensagem.append("A data de nascimento � um campo obrigat�rio\n");
    }
    
    if(cliente.getCpf().equals("")){
      mensagem.append("� necess�rio informar o CPF \n");
    }
    
    if( "".equals(cliente.getTelefone().getDdd()) ||
        "".equals(cliente.getTelefone().getNumero()) ||
        "".equals(cliente.getTelefone().getTipo())){     
      mensagem.append("Informe um telefone (DDD, n�mero e t�tulo) \n");
    }
    
    if(cliente.getUsuario().getUsername().equals("")){
      mensagem.append("� necess�rio informar e-mail para acesso\n");
    }
    
    if(cliente.getUsuario().getPassword().equals("")){
      mensagem.append("Informe uma senha\n");
    } 
    
    if(mensagem.length() == 0){
      return null;
    }
    return mensagem.toString();
  }
    

}
