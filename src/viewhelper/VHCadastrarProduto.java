package viewhelper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dominio.EntidadeDominio;
import dominio.GeneroLiterario;
import dominio.Livro;
import util.Resultado;
import util.Numero;

public class VHCadastrarProduto implements IViewHelper {
	
	@Override
	public EntidadeDominio getEntidade(HttpServletRequest request) {
		
		String titulo = request.getParameter("titulo");
		String autor = request.getParameter("autor");
		
		ArrayList<GeneroLiterario> generosLiterarios = new ArrayList<GeneroLiterario>();
		String[] generos = request.getParameterValues("genero");
		String editora = request.getParameter("editora");
		String edicao = request.getParameter("edicao");
		String isbn = request.getParameter("isbn");
		String sinopse = request.getParameter("sinopse");
		String codigoBarras = request.getParameter("codBarras");
		String ativoStr =  request.getParameter("ativo");
		String motivoInativacao = request.getParameter("motivoInativacao");	
		String motivoAtivacao = request.getParameter("motivoAtivacao");
		
		// Tratamento de n�meros e bool
		int codigo;
		int categoriaAtivacao;
		int categoriaInativacao;
		int ano;
		int quantidadePaginas;
		double altura;
		double largura;
		double peso;
		double profundidade;
		boolean ativo =  ativoStr == null ? false : true;
		
		categoriaAtivacao = null != request.getParameter("categoriaAtivacao") && 
				!"".equals(request.getParameter("categoriaAtivacao")) &&
				Numero.isNumeric(request.getParameter("categoriaAtivacao")) ? 
				Integer.parseInt(request.getParameter("categoriaAtivacao")) : 0;
				
		categoriaInativacao = null != request.getParameter("categoriaInativacao") && 
				!"".equals(request.getParameter("categoriaInativacao")) &&
				Numero.isNumeric(request.getParameter("categoriaInativacao")) ? 
				Integer.parseInt(request.getParameter("categoriaInativacao")) : 0;
					
		ano = null != request.getParameter("ano") && 
				!"".equals(request.getParameter("ano")) &&
				Numero.isNumeric(request.getParameter("ano")) ? 
				Integer.parseInt(request.getParameter("ano")) : 0;
		
		codigo = null != request.getParameter("codigo") && 
				!"".equals(request.getParameter("codigo")) && 
				Numero.isNumeric(request.getParameter("codigo")) ?	
				Integer.parseInt(request.getParameter("codigo")) : -1;
				
		altura = null != request.getParameter("altura") && 
				!"".equals(request.getParameter("altura")) &&
				Numero.isNumeric(request.getParameter("altura")) ?
				Double.parseDouble(request.getParameter("altura").replace(",",".")) : 0;				
		
	    quantidadePaginas = null != request.getParameter("quantidadePaginas") && 
	    		!"".equals(request.getParameter("quantidadePaginas")) &&
	    		Numero.isNumeric(request.getParameter("quantidadePaginas")) ?
	    		Integer.parseInt(request.getParameter("quantidadePaginas")) : 0;
		
	    largura = null != request.getParameter("largura") && 
	    		!"".equals(request.getParameter("largura"))	&&
	    		Numero.isNumeric(request.getParameter("largura")) ?	
				Double.parseDouble(request.getParameter("largura").replace(",",".")) : 0;
	
	    peso = null != request.getParameter("peso") && 
	    		!"".equals(request.getParameter("peso")) &&
	    		Numero.isNumeric(request.getParameter("peso")) ?	
				Double.parseDouble(request.getParameter("peso").replace(",",".")) : 0;
				
	    profundidade = null != request.getParameter("profundidade") && 
	    		!"".equals(request.getParameter("profundidade")) &&
	    		Numero.isNumeric(request.getParameter("profundidade")) ?	
				Double.parseDouble(request.getParameter("profundidade").replace(",",".")) : 0;							
		
		// Tratamento de String
		
		ArrayList<String> parameters = new ArrayList<String>();
		
		parameters.add(titulo);
		parameters.add(autor);
		parameters.add(edicao);
		parameters.add(editora);
		parameters.add(isbn);
		parameters.add(sinopse);
		parameters.add(codigoBarras);
		parameters.add(motivoInativacao);
		parameters.add(motivoAtivacao);
		
		for (String parameter : parameters) {
			if (parameter == null) {
				parameter = ".";
			}
		}
		
		if (generos == null || generos.length == 0) {
			GeneroLiterario generoLiterario = new GeneroLiterario();
			generos = new String[1];
			generos[0] = ".";
			generoLiterario.setId(0);
			generoLiterario.setDescricao("");
			generosLiterarios.add(generoLiterario);
		} else {			
			for (String genero : generos ) {
				GeneroLiterario generoLiterario = new GeneroLiterario();
				int idGenero = Numero.format(genero);
				generoLiterario.setId(idGenero);
				generosLiterarios.add(generoLiterario);
			}
		}
		
		//categoria
		Livro livro = new Livro();
		livro.setId(codigo);
		livro.setTitulo(titulo);
		livro.setAutor(autor);
		livro.setAno(ano);
		livro.setEdicao(edicao);
		livro.setEditora(editora);
		livro.setIsbn(isbn);
		livro.setSinopse(sinopse);
		livro.setAltura(altura);
		livro.setLargura(largura);
		livro.setPeso(peso);
		livro.setProfundidade(profundidade);
		livro.setCodigoBarras(codigoBarras);
		livro.setAtivo(ativo);
		livro.setCategoriaAtivacao(categoriaAtivacao);
		livro.setCategoriaInativacao(categoriaInativacao);
		livro.setJustificativaInativacao(motivoInativacao);
		livro.setJustificativaAtivacao(motivoAtivacao);
		livro.setCategorias(generosLiterarios);
		livro.setQuantidadePaginas(quantidadePaginas);			
		
		return livro;
	}
	
	@Override
	public void setView(Resultado resultado, HttpServletRequest request, HttpServletResponse response) {
		String operacao = request.getParameter("operacao");
    String page = null != request.getParameter("page") ? request.getParameter("page") : "product" ;
//    System.out.println(page);
    int codigo = null != request.getParameter("codigo") && 
        !"".equals(request.getParameter("codigo")) ?  
            Integer.parseInt(request.getParameter("codigo")) : 0;
//            System.out.println("codigo" + codigo);
    String mensagem[] = resultado.getMensagem().split("\n");
    
		if(resultado.getErro())
			request.setAttribute("erro", mensagem);
		else
			request.setAttribute("sucesso", mensagem);
		
		if(operacao.equals("SALVAR")){
			if(resultado.getErro()){
				request.setAttribute("livro", resultado.getListaResultado().get(0));
			}
		} else if(operacao.equals("CONSULTAR")){
			if(!resultado.getErro()){
				if(resultado.getResultado() != null){
					request.getSession().setAttribute("livro", (Livro) resultado.getResultado());
				}else{
					request.getSession().setAttribute("resultado",  resultado.getListaResultado());
				}
			} else if(operacao.equals("EXCLUIR")){
				if(resultado.getErro()){
					request.setAttribute("resultado", (Livro) resultado.getResultado());
				} 
			} else if(operacao.equals("INATIVAR")){
				if(resultado.getErro()){
					request.setAttribute("resultado", (Livro) resultado.getResultado());
				} 
			}
		}
		try {
			if(operacao.equals("SALVAR")){
				request.setAttribute("livro", (Livro) resultado.getResultado());
				RequestDispatcher rd = request.getRequestDispatcher("/Pages/lumino/produtoSalvo.jsp");
				rd.forward(request, response);
			}
			else if(operacao.equals("CONSULTAR")){
			  RequestDispatcher rd ;
			  if(page.equals("product")) {
			    rd = request.getRequestDispatcher("/Pages/lumino/produtos.jsp");
			    if(codigo != 0) {
            rd = request.getRequestDispatcher("/Pages/lumino/productDetails.jsp");
            
          }
			  } else {
          rd = request.getRequestDispatcher("/Pages/lumino/listaProduto.jsp");
        }
			  rd.forward(request, response);		
			} else if(operacao.equals("EXCLUIR")){
				request.setAttribute("livro", (Livro) resultado.getResultado());
				RequestDispatcher rd = request.getRequestDispatcher("/Pages/lumino/produtoExcluido.jsp");
				rd.forward(request, response);
			} else if(operacao.equals("ALTERAR")){
				request.setAttribute("livro", (Livro) resultado.getResultado());
				RequestDispatcher rd = request.getRequestDispatcher("/Pages/lumino/produtoAlterado.jsp");
				rd.forward(request, response);
			} else if(operacao.equals("INATIVAR")){
				request.setAttribute("livro", (Livro) resultado.getResultado());
				RequestDispatcher rd = request.getRequestDispatcher("/Pages/lumino/produtoAlterado.jsp");
				rd.forward(request, response);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
