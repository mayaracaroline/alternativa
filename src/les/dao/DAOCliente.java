package les.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.math.BigInteger;
import java.sql.Date;

import dominio.Cliente;
import dominio.EntidadeDominio;
import util.Resultado;

public class DAOCliente extends AbstractDAO implements IDAO {

  @Override
  public Resultado salvar(EntidadeDominio entidade) {
    Resultado resultado = new Resultado();
    Cliente cliente = (Cliente) entidade;
    
  
    String sql = "INSERT INTO clientes (cli_cpf, cli_genero, cli_data_nascimento, "
        + "cli_nome, cli_sobrenome, cli_telefone, cli_email, cli_senha, "
        + "cli_status, cli_data_cadastro, cli_ddd, cli_tipo_telefone) "
        + "VALUES(?, ?, ?, ?, ?, ?, ?, ? ,? , ?, ?, ?);";
    
    PreparedStatement preparedStatement; 
    
    try {
      preparedStatement = conexao.prepareStatement(sql);
      preparedStatement.setString(1, cliente.getCpf());
      preparedStatement.setString(2, cliente.getGenero().toString());
      preparedStatement.setDate(3, Date.valueOf(cliente.getDataNascimento()));
      preparedStatement.setString(4, cliente.getNome());
      preparedStatement.setString(5, cliente.getSobrenome());
      preparedStatement.setString(6, cliente.getTelefone().getNumero());
      preparedStatement.setString(7, cliente.getUsuario().getUsername());
      preparedStatement.setString(8, cliente.getUsuario().getPassword());
      preparedStatement.setBoolean(9, true);
      preparedStatement.setDate(10, Date.valueOf(cliente.getDataCadastro()));
      preparedStatement.setString(11, cliente.getTelefone().getDdd());
      preparedStatement.setString(12, cliente.getTelefone().getTipo().toString());
      
      preparedStatement.execute();
      
      ResultSet rs = preparedStatement.getGeneratedKeys();
      BigInteger id = BigInteger.ZERO;
      
      while(rs.next()) {
        id = rs.getBigDecimal(1).toBigInteger();
      }
      
      resultado.sucesso("Cliente salvo com sucesso");
      
    } catch (Exception e) {
      resultado.erro("Erro ao salvar cliente");
      e.printStackTrace();
    }
    
    resultado.setResultado(cliente);
    return resultado;
  }

  @Override
  public Resultado consultar(EntidadeDominio entidade) {
    // TODO Auto-generated method stub
    return null;
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
