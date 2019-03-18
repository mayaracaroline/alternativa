package les.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dominio.EntidadeDominio;
import dominio.GeneroLiterario;
import dominio.Livro;
import util.Resultado;

public class DAOGenerosLivro extends AbstractDAO implements IDAO{

	@Override
	public Resultado salvar(EntidadeDominio entidade) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Resultado consultar(EntidadeDominio entidade) {
		Livro livro = (Livro) entidade;
		Resultado resultado = new Resultado();
		ArrayList<GeneroLiterario> generos = new ArrayList<>();
		ResultSet queryResult;
		
		String sql = "SELECT * FROM GENEROS_LIVRO WHERE glv_livro_id = ?";
			
		try {
			
			PreparedStatement preparedStatment = conexao.prepareStatement(sql);	
			preparedStatment.setInt(1,livro.getId().intValue());
			for (int i = 0; i < livro.getCategorias().size(); i++) {						
				queryResult = preparedStatment.executeQuery();
				
				while(queryResult.next()) {
					GeneroLiterario g = new GeneroLiterario();
										
					g.setId(queryResult.getInt("glv_genero_id"));
					g.setDescricao(queryResult.getString("glv_genero_descricao"));
					
					generos.add(g);
				}
					
				queryResult.close();
			}
			
			preparedStatment.close();
			livro.setCategorias(generos);
			resultado.setResultado(livro);
			resultado.sucesso("");
						
			return resultado;
		
			
		} catch (Exception e) {
			e.printStackTrace();
			resultado.erro("Erro de consulta.");
			
			return resultado;
		}
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

}
