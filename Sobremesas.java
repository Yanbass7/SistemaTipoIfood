public class Sobremesas extends Produto{
	private boolean geladas;

	
	public Sobremesas(String estoque, String nome, boolean geladas) {
		super(estoque, nome);
		this.geladas = geladas;
	}

	public boolean isGeladas() {
		return geladas;
	}

	public void setGeladas(boolean geladas) {
		this.geladas = geladas;
	}
	
	
	
}
	
	