package dominio;

public class Produto extends EntidadeDominio {
	protected String codigoBarras;
	protected int categoriaAtivacao;
	protected int categoriaInativacao;
	protected String justificativaAtivacao;
	protected String justificativaInativacao;
	protected boolean ativo;
	protected String imagePath;
	
	
	public String getCodigoBarras() {
		return codigoBarras;
	}
	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	public int getCategoriaAtivacao() {
		return categoriaAtivacao;
	}
	public void setCategoriaAtivacao(int categoriaAtivacao) {
		this.categoriaAtivacao = categoriaAtivacao;
	}
	public int getCategoriaInativacao() {
		return categoriaInativacao;
	}
	public void setCategoriaInativacao(int categoriaInativacao) {
		this.categoriaInativacao = categoriaInativacao;
	}
	public String getJustificativaAtivacao() {
		return justificativaAtivacao;
	}
	public void setJustificativaAtivacao(String justificativaAtivacao) {
		this.justificativaAtivacao = justificativaAtivacao;
	}
	public String getJustificativaInativacao() {
		return justificativaInativacao;
	}
	public void setJustificativaInativacao(String justificativaInativacao) {
		this.justificativaInativacao = justificativaInativacao;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
		
}
