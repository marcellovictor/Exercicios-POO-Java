package app;

import java.util.Scanner;

import entidades.Casa;
import entidades.Porta;

public class Main {

	public static void main(String[] args) {
		
		Casa casa = new Casa();
		
		Scanner sc = new Scanner(System.in);
		
		int escolha;

		do {
		
			imprimeMenu();
			
			System.out.print(">>> ");
			escolha = sc.nextInt();
			
			while (escolha < 0 || escolha > 5) {
				System.out.println("Opção não disponível!");
				
				imprimeMenu();
				
				System.out.print(">>> ");
				escolha = sc.nextInt();
			}
			
			switch(escolha) {
			case 1:
				sc.nextLine();
				System.out.print("Nova cor: ");
				String novaCor = sc.nextLine();
				casa.setCor(novaCor);
				System.out.println("Casa pintada na cor " + casa.getCor() + "!");
				break;
				
			case 2:
				System.out.println("Total de portas abertas: " + casa.quantasPortasEstaoAbertas());
				System.out.println();
				break;
			
			case 3:
				casa.imprimePortas();
				break;
			
			case 4:
				System.out.print("Largura: ");
				int largura = sc.nextInt();
				
				System.out.print("Altura: ");
				int altura = sc.nextInt();
				
				casa.getPortas().add(new Porta(largura, altura));
				break;
				
			case 5:
				if (casa.getPortas().size() == 0) {
					System.out.println("Sua casa não tem portas!");
					break;
				}
				
				System.out.println("Índice da porta: ");
				int indicePorta = sc.nextInt();
				
				while (indicePorta < 0 || indicePorta > casa.getPortas().size()-1) {
					System.out.println("Índice não existente!");
					System.out.println("Confira os índices existentes abaixo:");
					System.out.println();
					
					casa.imprimePortas();
					
					System.out.println();
					System.out.println("Índice da porta: ");
					indicePorta = sc.nextInt();
				}
				
				casa.getPortas().get(indicePorta).moverPorta();
				break;
			
			default:
				break;
			}
		
		} while(escolha != 0);
				
				
		sc.close();

	}
	
	static void imprimeMenu() {
		System.out.println();
		System.out.println("-----------MENU----------/");
		System.out.println("Pintar casa ...........(1)");
		System.out.println("Verificar portas ......(2)");
		System.out.println("Menu de portas ........(3)");
		System.out.println("Adicionar porta .......(4)");
		System.out.println("Abrir ou fechar porta .(5)");
		System.out.println("Sair ..................(0)");
		System.out.println();
	}

}
