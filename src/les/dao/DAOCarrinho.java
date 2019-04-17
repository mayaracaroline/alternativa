package les.dao;

import java.sql.PreparedStatement;
import java.util.HashMap;

import javax.servlet.http.HttpSession;

import dominio.Bloqueio;
import dominio.Carrinho;
import dominio.EntidadeDominio;
import dominio.ItemCarrinho;
import dominio.Produto;
import util.Resultado;

public class DAOCarrinho extends AbstractDAO implements IDAO {

  @Override
  public Resultado salvar(EntidadeDominio entidade) {
    Bloqueio produtoBloqueado = (Bloqueio) entidade;
    Carrinho carrinho = produtoBloqueado.getCarrinho();
    // Index do último produto adicionado
    Integer indexProdutoAdicionado = carrinho.getItensCarrinho().size() - 1;
    HttpSession sessaoUsuario = produtoBloqueado.getSessao();
    ItemCarrinho itemCarrinho = carrinho.getItensCarrinho().get(indexProdutoAdicionado);
    Produto produto = itemCarrinho.getProduto();
    Resultado resultado = new Resultado();
    String sql = "UPDATE estoque SET est_quantidade = est_quantidade - ? WHERE est_pro_id = ? ;";
    
    try {
      
      PreparedStatement pst = conexao.prepareStatement(sql);
      pst.setInt(1, itemCarrinho.getQuantidade());
      pst.setInt(2, produto.getId().intValue());
      
      pst.executeUpdate();
      
    } catch (Exception e) {
      resultado.erro("Erro ao inserir produto no carrinho, tente novamente");
    }
    
    sessaoUsuario.setAttribute("carrinho", carrinho);

    HashMap<String, Carrinho> mapProdutosBloqueados;
    mapProdutosBloqueados= (HashMap<String, Carrinho>) sessaoUsuario.getServletContext()
        .getAttribute("bloqueio");
    
    if(mapProdutosBloqueados.containsValue(sessaoUsuario.getId())) {
      mapProdutosBloqueados.get(sessaoUsuario.getId()).addItem(itemCarrinho);
    } else {
      mapProdutosBloqueados.put(sessaoUsuario.getId(), carrinho);
    }
    
    resultado.setResultado(produto);
    resultado.sucesso("Produto inserido com sucesso");
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
