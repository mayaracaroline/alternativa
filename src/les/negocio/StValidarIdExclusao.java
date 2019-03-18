package les.negocio;

import java.math.BigInteger;

import dominio.EntidadeDominio;
import dominio.Livro;

public class StValidarIdExclusao implements IStrategy {

	@Override
	public String processar(EntidadeDominio entidade) {
		String mensagem = "";
		Livro livro = (Livro) entidade;
		
		if(livro.getId().equals(BigInteger.ZERO)) {
			mensagem = "Insira o código para consulta";			
		}
		
		return mensagem;
	}

}
