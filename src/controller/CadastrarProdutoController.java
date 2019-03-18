package controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dominio.EntidadeDominio;
import les.command.CommandAlterar;
import les.command.CommandConsultar;
import les.command.CommandExcluir;
import les.command.CommandSalvar;
import les.command.ICommand;
import util.Resultado;
import viewhelper.IViewHelper;
import viewhelper.VHCadastrarProduto;

/**
 * Servlet implementation class CadastrarProdutoController
 */
@WebServlet({ "/CadastrarProduto", "/cadastro", "/ConsultaProduto", "/ExcluiProduto", "/AlterarProduto"})
public class CadastrarProdutoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Map<String, IViewHelper> mapViewHelper;
	private Map<String, ICommand> mapCommand;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastrarProdutoController() {
    	
    	mapViewHelper = new HashMap<String, IViewHelper>();
    	mapViewHelper.put("/livraria/CadastrarProduto", new VHCadastrarProduto());
    	mapViewHelper.put("/livraria/ConsultaProduto", new VHCadastrarProduto());
    	mapViewHelper.put("/livraria/ExcluiProduto", new VHCadastrarProduto());
    	mapViewHelper.put("/livraria/AlterarProduto", new VHCadastrarProduto());
    	mapCommand = new HashMap<String, ICommand>();
    	mapCommand.put("SALVAR", new CommandSalvar());
    	mapCommand.put("CONSULTAR", new CommandConsultar());
    	mapCommand.put("EXCLUIR", new CommandExcluir());
    	mapCommand.put("ALTERAR", new CommandAlterar());
    	
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String operacao = request.getParameter("operacao");
		String vh = request.getRequestURI();
		IViewHelper viewHelper = mapViewHelper.get(vh);
		ICommand command = mapCommand.get(operacao);		
		EntidadeDominio entidade = viewHelper.getEntidade(request);
		Resultado resultado = command.executar(entidade);
		
		viewHelper.setView(resultado, request, response);
		
	}

	/**
	 * @see HttpServlet#doTrace(HttpServletRequest, HttpServletResponse)
	 */
	protected void doTrace(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
