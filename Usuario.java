import java.util.List;

public class Usuario {
	private String nome;
	private String senha;
	private String sobrenome; 
	private String cidade;
	private String cpf;
	private String email;
	
	
	
	private List<Anuncio> listaCompras;

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * @param senha the senha to set
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	/**
	 * @return the sobrenome
	 */
	public String getSobrenome() {
		return sobrenome;
	}

	/**
	 * @param nome the sobrenome to set
	 */
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	/**
	 * @return the cidade
	 */
	public String getCidade() {
		return cidade;
	}

	/**
	 * @param nome the cidade to set
	 */
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * @param nome the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param nome the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	public List<Anuncio> getListaCompras() {
		return listaCompras;
	}

	public void setListaCompras(List<Anuncio> listaCompras) {
		this.listaCompras = listaCompras;
	}
	
}
