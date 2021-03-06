import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Porta porta = new Porta(1.2, 3.5, "Roxo");
		
		int escolha;
		
		Scanner sc = new Scanner(System.in);
		
		do {
		
			imprimeMenu(porta);
			
			escolha = escolheOpcao(sc);
			
			switch(escolha) {
			case 1:
				porta.moverPorta();
				break;
			case 2:
				sc.nextLine();
				System.out.print("Nova cor >>> ");
				String novaCor = sc.nextLine();
				porta.setCor(novaCor);
				System.out.println("Porta pintada na cor " + porta.getCor() + "!");
				break;
			default:
				System.out.println("Saindo...");
				break;
			}
		
		} while (escolha != 0);
		
		sc.close();

	}
	
	static void imprimeMenu(Porta porta) {
		
		System.out.println();
		System.out.println("-------MENU-------/");
		System.out.println((porta.estaAberta()) ? "Fechar porta ...(1)" : "Abrir porta ....(1)");
		System.out.println("Pintar .........(2)");
		System.out.println("Sair ...........(0)");
		System.out.println("------------------/");
		System.out.println();
	}
	
	static int escolheOpcao(Scanner sc) {
		
		
		System.out.println("Digite o que deseja fazer");
		System.out.print(">>> ");
		int resp = sc.nextInt();
		
		while (resp < 0 || resp > 2) {
			System.out.println("Op??o indispon?vel!");
			System.out.println();
			System.out.println("Digite o que deseja fazer");
			System.out.print(">>> ");
			resp = sc.nextInt();
		}
		
		
		return resp;
	}

}
