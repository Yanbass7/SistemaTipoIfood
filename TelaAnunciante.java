import java.util.Scanner;

public class TelaAnunciante implements Tela{
	
Scanner sc = new Scanner(System.in);
public Bebidas b1;
public Sobremesas s1;
	
	public void exibirTela() {
		
		
		System.out.println("Informe o item");
		System.out.println("1 - Bebidas");
		System.out.println("2 - Sobremesas");

		int selecionar;
		selecionar = sc.nextInt();
		switch (selecionar) {
		
			
		}
		
	}

	public void addtipo()
	{
		String estoque,nome;
		
		System.out.println("******Criando Anúncio!******");
		
		System.out.println("Informe se quer bebida ou sobremesa!");
		
		nome = sc.next();
		System.out.println("Quantidade disponível!");
		estoque = sc.next();
		
	}
}
