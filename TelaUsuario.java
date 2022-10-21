import java.util.Scanner;

public class TelaUsuario implements Tela{
	
	TelaPrincipal tp;
	
	Usuario uAtual;
	
	//TelaUsuario tU=new TelaUsuario();
	TelaAnunciante tA=new TelaAnunciante();
	
	Scanner sc= new Scanner(System.in);
	
	public TelaUsuario(TelaPrincipal tp) {
		this.tp=tp;
		
	}
	
	@Override
	public void exibirTela() {
		uAtual=tp.getuAtual();
		int opcao=-1;

		do {

			System.out.println("Digite a opcao desejada:");
			System.out.println("1 para se comprar:");
			System.out.println("2 para se anunciar:");
			System.out.println("-1 para sair:");

			opcao=sc.nextInt();

			switch (opcao) {
			case 1:
				
				//exibirMenuUsuario(u);
				break;

			case 2:
				tA.exibirTela();
				break;
			case -1:
				System.out.println("Até mais");
				break;

			default:
				System.out.println("opcao nao existente, tente novamente");
				break;
			}

		}while(opcao!=-1);
	}



}
