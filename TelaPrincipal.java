import java.util.List;
import java.util.Scanner;

public class TelaPrincipal implements Tela{

	private List<Usuario> listaUsuarios;
	private Scanner sc= new Scanner(System.in);
	private TelaUsuario tU=new TelaUsuario(this);
	private TelaAnunciante tA=new TelaAnunciante();
	private Usuario uAtual;
	


	//construtor
	public TelaPrincipal(List<Usuario> listaUsuarios) {
		this.listaUsuarios=listaUsuarios;
	}

	public Usuario solicitarCadastro() {
		
		boolean cadusuario = true;
		Usuario u = new Usuario();
		
		System.out.println("****Cadastro de Usuários****");
		while (cadusuario) {
			
			 System.out.println("Cadastro de Usuário");
			 System.out.println("Informe seu Nome: ");
			 u.setNome(sc.next());
			 System.out.println("Informe seu Sobrenome: ");
			 u.setSobrenome(sc.next());
			 System.out.println("Informe sua Cidade: ");
			 u.setCidade(sc.next());
			 System.out.println("Informe seu CPF: ");
			 u.setCpf(sc.next());
			 System.out.println("Informe seu Email: ");
			 u.setEmail(sc.next());
			 System.out.println("Informe sua senha: ");
			 u.setSenha(sc.next());
			
		
			
		
			System.out.println("Confirmar Cadastro (S/N)?");
			String cadastro = sc.next();
			
			
			
		
			if (cadastro.equalsIgnoreCase("s")) {
				listaUsuarios.add(u);
				System.out.println("Cadastro realizado com sucesso!");
				cadusuario = false;
			} else if (cadastro.equalsIgnoreCase("n")){
				System.out.println("Cadastro não realizado!");
			} else {
				System.out.println("\nOpção inválida \n");
			}
			
		}
			return null;

	}
	
	public Usuario solicitarLogin() {

		sc= new Scanner(System.in);
		String nomeDigitado="";
		String senhaDigitada="";
		

		//Usuario usuarioAtual;

		do{
			System.out.println("Digite seu usuário ou -1 para voltar:");

			nomeDigitado=sc.nextLine();
			if(nomeDigitado.equals("-1")) {
				return null;
			}

			for(Usuario u:listaUsuarios) {
				if(u.getNome().equals(nomeDigitado)) {
					//usuarioAtual=u;
					System.out.println("usuario encontrado");

					System.out.println("Digite sua senha ou -1 para voltar:");

					senhaDigitada=sc.nextLine();

					if(senhaDigitada.equals("-1")) {
						return null;
					} else {
						if(u.getSenha().equals(senhaDigitada)) {
							return u;
						} else {
							System.out.println("senha incorreta, tente novamente");
						}
					}				

					System.out.println("usuario nao encontrado");
				
				}
			}


		}while(senhaDigitada!="-1" || nomeDigitado!="-1");

		return null;


	}

	public void exibirTela() {

		int opcao=-1;

		do {
			
			System.out.println("Digite a opcao desejada:");
			System.out.println("1 para se logar:");
			System.out.println("2 para se cadastrar:");
			System.out.println("-1 para sair:");
			
			opcao=sc.nextInt();
			
			switch (opcao) {
			case 1:
				Usuario u=solicitarLogin();
				if(u!=null) {
					uAtual=u;
					tU.exibirTela();
				}
					//exibirMenuUsuario(u);
				break;

			case 2:
				u=solicitarCadastro();
				if(u!=null) {
					uAtual=u;
					tU.exibirTela();
				}
			case -1:
				System.out.println("Até mais");
				break;

			default:
				System.out.println("opcao nao existente, tente novamente");
				break;
			}
			
		}while(opcao!=-1);


	}


	private void exibirMenuUsuario(Usuario u) {
		// TODO Auto-generated method stub
		//Anunciante a=new Anunciante(u);
		//Comprador c=new Comprador(u);
		TelaAnunciante tA=new TelaAnunciante();
		tA.exibirTela();
		
	}

	/**
	 * @return the listaUsuarios
	 */
	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	/**
	 * @param listaUsuarios the listaUsuarios to set
	 */
	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	/**
	 * @return the sc
	 */
	public Scanner getSc() {
		return sc;
	}

	/**
	 * @param sc the sc to set
	 */
	public void setSc(Scanner sc) {
		this.sc = sc;
	}

	/**
	 * @return the tU
	 */
	public TelaUsuario gettU() {
		return tU;
	}

	/**
	 * @param tU the tU to set
	 */
	public void settU(TelaUsuario tU) {
		this.tU = tU;
	}

	/**
	 * @return the tA
	 */
	public TelaAnunciante gettA() {
		return tA;
	}

	/**
	 * @param tA the tA to set
	 */
	public void settA(TelaAnunciante tA) {
		this.tA = tA;
	}

	/**
	 * @return the uAtual
	 */
	public Usuario getuAtual() {
		return uAtual;
	}

	/**
	 * @param uAtual the uAtual to set
	 */
	public void setuAtual(Usuario uAtual) {
		this.uAtual = uAtual;
	}


}
