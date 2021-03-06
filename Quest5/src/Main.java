import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		TV tv = new TV();
		
		int escolha;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
			imprimeMenu(tv);
			
			System.out.print(">>> ");
			escolha = sc.nextInt();
			
			if (escolha < 0 || escolha > 8) {
				System.out.println("Op??o n?o dispon?vel!");
				continue;
			}
			
			switch (escolha) {
			case 1:
				tv.botaoOnOff();
				break;
				
			case 2:
				tv.aumentarVolume();
				break;
				
			case 3:
				tv.diminuirVolume();
				break;
				
			case 4:
				tv.subirCanal();
				break;
				
			case 5:
				tv.descerCanal();
				break;
				
			case 6:
				int novoCanal;
				System.out.print("Canal desejado >>> ");
				novoCanal = sc.nextInt();
				
				if (novoCanal < 0 || novoCanal > 99) {
					System.out.println("Canal n?o existente!");
				}
				else {
					tv.setCanal(novoCanal);
					System.out.println("Sintonizando canal " + tv.getCanal() + "...");
				}
				break;
				
			case 7:
				tv.botaoMute();
				break;
				
			case 8:
				System.out.println("\n" + tv + "\n");
				break;
				
			default:
				break;
				
			}
			
			
			
		} while (escolha != 0);
		
		
		sc.close();

	}

	
	static void imprimeMenu(TV tv) {
		System.out.println();
		System.out.println("-----------MENU----------/");
		System.out.println(tv.isLigada() ? "Desligar TV ...........(1)" : "Ligar TV ..............(1)");
		System.out.println("Aumentar volume .......(2)");
		System.out.println("Diminuir volume .......(3)");
		System.out.println("Subir canal ...........(4)");
		System.out.println("Descer canal ..........(5)");
		System.out.println("Selecionar canal ......(6)");
		System.out.println(tv.isMutada() ? "Ativar som ............(7)" : "Desativar som .........(7)");
		System.out.println("Mostrar estado da TV ..(8)");
		System.out.println("Sair ..................(0)");
		System.out.println();
	}
}
