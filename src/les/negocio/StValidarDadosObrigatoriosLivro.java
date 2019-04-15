package les.negocio;

import java.math.BigInteger;

import dominio.EntidadeDominio;
import dominio.Livro;

public class StValidarDadosObrigatoriosLivro implements IStrategy {
	@Override
	public String processar(EntidadeDominio entidade) {
		
		Livro livro = (Livro) entidade;
		
		StringBuilder mensagem = new StringBuilder();
		
		if(livro.getId().intValue() == -1){
			mensagem.append("Digite um c�digo v�lido\n");
		}
		
		if(livro.getTitulo().equals(".")){
			mensagem.append("T�tulo � obrigat�rio\n");
		}
		
		if(livro.getAltura() == 0.0){
			mensagem.append("Altura � obrigat�ria\n");
		}

		if(livro.getAno() == 0){
			mensagem.append("Ano de publica��o � um campo obrigat�rio\n");
		}
		
		if(livro.getAutor().equals(".")){
			mensagem.append("Insira o nome do autor\n");
		}
		
		if(livro.getCategorias().get(0).getId().equals(BigInteger.ZERO)){			
			mensagem.append("Selecione no m�nimo um g�nero \n");
		}
		
		if(livro.getEdicao().equals(".")){
			mensagem.append("Insira o ano de edi��o\n");
		}
		
		if(livro.getEditora().equals(".")){
			mensagem.append("Numero � obrigat�rio\n");
		}
		
		if(livro.getIsbn().equals(".")){
			mensagem.append("C�digo ISBN � obrigat�rio\n");
		}
		
		if(livro.getLargura() == 0.0){
			mensagem.append("Insira a largura do livro\n");
		}
		
		if(livro.getPeso() == 0.0){
			mensagem.append("Insira o peso\n");
		}

		if(livro.getProfundidade() == 0.0){
			mensagem.append("Profundidade � obrigat�ria\n");
		}

		if(livro.getQuantidadePaginas() == 0){
			mensagem.append("Insira a quantidade de p�ginas\n");
		}

		if(livro.getSinopse().equals(".")){
			mensagem.append("A sinopse � obrigat�ria\n");
		}

		if(livro.getCodigoBarras().equals(".")){
			mensagem.append("Insira o c�digo de barras\n");
		}
		
		if(mensagem.length() == 0){
			return null;
		}
		return mensagem.toString();
	}

}
