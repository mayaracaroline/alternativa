package fachada;	

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dominio.EntidadeDominio;
import les.dao.DAOLivro;
import les.dao.IDAO;
import les.negocio.IStrategy;
import les.negocio.StComplementarGeneroLiterario;
import les.negocio.StValidarDadosObrigatorios;
import les.negocio.StValidarIdExclusao;
import les.negocio.StValidarMotivoAtivacao;
import util.Resultado;

public class Fachada implements IFachada  {
	
	private Map<String, List<IStrategy>> mapStrategy;
	private Map<String, IDAO> mapDAO;
	private List<IStrategy> listStrategySalvar;
	private List<IStrategy> listStrategyConsultar;
	private List<IStrategy> listStrategyExcluir;
	
	public Fachada() {
		mapStrategy = new HashMap<String, List<IStrategy>>();
		mapDAO = new HashMap<String, IDAO>();

		listStrategySalvar = new ArrayList<IStrategy>();
		listStrategyConsultar = new ArrayList<IStrategy>();
		listStrategyExcluir = new ArrayList<IStrategy>();

		listStrategySalvar.add(new StValidarDadosObrigatorios());
		listStrategySalvar.add(new StValidarMotivoAtivacao());
		listStrategySalvar.add(new StComplementarGeneroLiterario());
		
		listStrategyConsultar.add(new StValidarMotivoAtivacao());
		
		listStrategyExcluir.add(new StValidarIdExclusao());

		mapStrategy.put("SALVAR", listStrategySalvar);
		mapStrategy.put("CONSULTAR", listStrategyConsultar);
		mapStrategy.put("EXCLUIR", listStrategyExcluir);
		
		mapDAO.put("LIVRO", new DAOLivro());
	}
	
	public Resultado validarStrategys(EntidadeDominio entidade, String operacao) {
		
		Resultado resultado = new Resultado();
		String mensagem = "";
		String mensagens = "";
		
		List<IStrategy> listStrategy;
		listStrategy = mapStrategy.get(operacao);
		
		for (IStrategy iStrategy : listStrategy) {
			
			mensagem = iStrategy.processar(entidade);
			
			if(mensagem != null){
				mensagens += mensagem;
			}
		}
		
		if( "".equals(mensagens)){
			resultado.sucesso("SUCESSO");
		}else{
			List<EntidadeDominio> l = new ArrayList<>();
			l.add(entidade);
			resultado.setListaResultado(l);
			resultado.erro(mensagens);
		}
		
		return resultado;
	}

	
	public Resultado salvar(EntidadeDominio entidade) {
		Resultado resultado = new Resultado();
		
		resultado = validarStrategys(entidade, "SALVAR");
	
		if (!resultado.getErro()) {
			IDAO dao = mapDAO.get(entidade.getClass().getSimpleName().toUpperCase());
			resultado = dao.salvar(entidade);
		}
		
		return resultado;
	}
	
	public Resultado consultar(EntidadeDominio entidade) {
		Resultado resultado = new Resultado();
		
		resultado = validarStrategys(entidade, "CONSULTAR");

		if (!resultado.getErro()) {
			IDAO dao = mapDAO.get(entidade.getClass().getSimpleName().toUpperCase());
			resultado = dao.consultar(entidade);
		}
		
		return resultado;	
	}
		
	public Resultado excluir(EntidadeDominio entidade) {
		Resultado resultado = new Resultado();
		
		resultado = validarStrategys(entidade, "EXCLUIR");

		if (!resultado.getErro()) {
			IDAO dao = mapDAO.get(entidade.getClass().getSimpleName().toUpperCase());
			resultado = dao.excluir(entidade);
		}
		
		return resultado;	
		
	}
		
	public Resultado alterar(EntidadeDominio entidade) {
		Resultado resultado = new Resultado();
		
		return resultado;
		
	}

}