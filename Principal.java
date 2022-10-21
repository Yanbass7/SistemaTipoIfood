import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		//construtor de banco de dados
		List<Usuario> listaUsuarios= criarUsuariosIniciais();
		
		List<Usuario> listaAnuncios= criarAnunciosIniciais(listaUsuarios);
		
		
		TelaPrincipal tp= new TelaPrincipal(listaUsuarios);
		tp.exibirTela();

	}

	private static List<Usuario> criarAnunciosIniciais(List<Usuario> listaUsuarios) {
		// TODO Auto-generated method stub
		return null;
	}

	//mock data
	public static List<Usuario> criarUsuariosIniciais() {
		List<Usuario> listaUsuario;
		listaUsuario=new ArrayList<Usuario>(); // uso de heranca
		
		Usuario teste1=new Usuario();
		teste1.setNome("galdir");
		teste1.setSenha("123");
		listaUsuario.add(teste1);
		
		
		
				
				
		
		Usuario teste2=new Usuario();
		teste2.setNome("mario");
		teste2.setSenha("123");
		listaUsuario.add(teste2);
		
		
		
		Usuario teste4=new Usuario();
		teste4.setNome("yan");
		teste4.setSenha("123");
		listaUsuario.add(teste4);
		
		return listaUsuario;
	}


}
