
public abstract class Produto {

	
	private String estoque;
	private String nome;
	public Produto(String estoque, String nome) {
		super();
		this.estoque = estoque;
		this.nome = nome;
	}
	public String getEstoque() {
		return estoque;
	}
	public void setEstoque(String estoque) {
		this.estoque = estoque;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	


}
