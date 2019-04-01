package les.dao;

import java.math.BigInteger;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dominio.Cartao;
import dominio.Cliente;
import dominio.Endereco;
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
      
      cliente.setId(id.intValue());
      DAOEndereco daoEndereco = new DAOEndereco();
      
      if (cliente.getEnderecoResidencial() != null) {
        Resultado rsEndResidencial = daoEndereco.salvar(cliente.getEnderecoResidencial());
        Endereco endereco = (Endereco) rsEndResidencial.getResultado();
        cliente.getEnderecoResidencial().setId(endereco.getId().intValue());
      }
      
      if (cliente.getEnderecoEntrega() != null) {
        Resultado rsEndEntrega = daoEndereco.salvar(cliente.getEnderecoEntrega());
        Endereco endereco = (Endereco) rsEndEntrega.getResultado();
        cliente.getEnderecoEntrega().setId(endereco.getId().intValue());
      }
      if (cliente.getEnderecoCobranca() != null) {
        Resultado rsEndCobranca = daoEndereco.salvar(cliente.getEnderecoCobranca());
        Endereco endereco = (Endereco) rsEndCobranca.getResultado();
        cliente.getEnderecoCobranca().setId(endereco.getId().intValue());
      }  
      
      DAOClientes_Endereco daoCliEndereco = new DAOClientes_Endereco();
      
      daoCliEndereco.salvar(cliente);
      
      DAOCartao daoCartao = new DAOCartao();
      Resultado rsCartao = daoCartao.salvar(cliente.getCartao());
      Cartao cartao = (Cartao) rsCartao.getResultado();
      cliente.setCartao(cartao);
      
      DAOCartoesCliente daoCartoesCli = new DAOCartoesCliente();
      
      daoCartoesCli.salvar(cliente);      
            
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
    Resultado resultado = new Resultado();
    Cliente cliente = (Cliente) entidade;
    
    String sql = "SELECT * FROM clientes WHERE cli_id = ? ";
    
    try {
      PreparedStatement pst = conexao.prepareStatement(sql);
      pst.setInt(1, cliente.getId().intValue());
      
    } catch (Exception e) {
      resultado.erro("Erro ao consultar cliente");
      e.printStackTrace();
    }
    
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
