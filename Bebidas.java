public class Bebidas extends Produto{
	
	private int quantidade;
    private boolean alcool;
	public Bebidas(String estoque, String nome, int quantidade, boolean alcool) {
		super(estoque, nome);
		this.quantidade = quantidade;
		this.alcool = alcool;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public boolean isAlcool() {
		return alcool;
	}
	public void setAlcool(boolean alcool) {
		this.alcool = alcool;
	}
	
    
    
    
}