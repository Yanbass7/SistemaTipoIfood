
public class Anuncio {
	
	private Usuario usuarioAnunciante; //referencia ao objeto usuario ja instanciado
	private String descricao;
	private int quantidade;

	
	private int id;
	
	public Anuncio(Usuario u, String descricao) {
		this.usuarioAnunciante=u;
	}

	public Usuario getUsuarioAnunciante() {
		return usuarioAnunciante;
	}

	public void setUsuarioAnunciante(Usuario usuarioAnunciante) {
		this.usuarioAnunciante = usuarioAnunciante;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	

	
}
