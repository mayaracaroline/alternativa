package les.dao;

import java.math.BigInteger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dominio.Endereco;
import dominio.EntidadeDominio;
import util.Resultado;

public class DAOEndereco extends AbstractDAO implements IDAO {

  @Override
  public Resultado salvar(EntidadeDominio entidade) {
    Resultado resultado = new Resultado();
    Endereco endereco = (Endereco) entidade;
    
    String sql = "INSERT INTO enderecos(end_logradouro,end_bairro, end_cep, end_descricao, end_observacao, end_tipo_residencia, end_tipo, end_tpl_id, end_cid_id, end_est_id, end_status) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?);";
    
    try {
      
      PreparedStatement pst = conexao.prepareStatement(sql);
      pst.setString(1, endereco.getLogradouro());
      pst.setString(2, endereco.getBairro());
      pst.setString(3, endereco.getCep());
      pst.setString(4, endereco.getDescricao());
      pst.setString(5, endereco.getObservacao());
      pst.setString(6, endereco.getTipoResidencia().toString());
      pst.setString(7, endereco.getTipoEndereco());
      pst.setInt(8, endereco.getTipoLogradouro().getId().intValue());
      pst.setInt(9, endereco.getCidade().getId().intValue());
      pst.setInt(10, endereco.getEstado().getId().intValue());
      pst.setBoolean(11, true);
      
      pst.execute();
      
      ResultSet rs = pst.getGeneratedKeys();
      BigInteger id = BigInteger.ZERO;
      
      while(rs.next()) {
        id = rs.getBigDecimal(1).toBigInteger();
      }
      
      endereco.setId(id.intValue());
      
      resultado.setResultado(endereco);
      resultado.sucesso("Endereço salvo com sucesso");
            
      
    } catch (Exception e) {
      resultado.erro("Erro ao salvar endereço");
      e.printStackTrace();
    }
    
    return resultado;
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
