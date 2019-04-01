package les.dao;

import dominio.Endereco;
import dominio.EntidadeDominio;
import util.Resultado;

public class DAOEndereco extends AbstractDAO implements IDAO {

  @Override
  public Resultado salvar(EntidadeDominio entidade) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Resultado consultar(EntidadeDominio entidade) {
    Endereco endereco = (Endereco) entidade;
    Resultado resultado = new Resultado();
    
    String sql = "SELECT cid_nome FROM cidade WHERE cid_id = ?";
    
    return resultado;
  }

  @Override
  public Resultado alterar(EntidadeDominio entidade) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Resultado excluir(EntidadeDominio entidade) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Resultado inativar(EntidadeDominio entidade) {
    // TODO Auto-generated method stub
    return null;
  }

}
