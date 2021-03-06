package app;

import java.util.Scanner;

import entidades.Agenda;
import entidades.Contato;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tarefa;
		
		do {
		
			imprimeMenu();
			
			tarefa = escolheTarefa(sc);
			sc.nextLine();
			// executa tarefa
			
			String nome;
			
			switch (tarefa) {
			case 1:
				System.out.print("Nome: ");
				nome = sc.nextLine();
				
				System.out.print("Telefone: ");
				String telefone = sc.nextLine();
				
				Agenda.getListaDeContatos().add(new Contato(nome, telefone));
				break;
				
			case 2:
				System.out.print("Nome: ");
				nome = sc.nextLine();
				
				if (Agenda.getListaDeContatos().contains(new Contato(nome))) {
					Agenda.getListaDeContatos().remove(new Contato(nome));
				}
				else {
					System.out.println("Contato n?o existente!");
				}
				break;
				
			case 3:
				Agenda.imprimeLista();
			default:
				break;
			}
			
		} while (tarefa != 0); 
		
		///////////////////////////////
		
		sc.close();

	}
	
	static void imprimeMenu() {
		System.out.println();
		System.out.println("----------MENU----------");
		System.out.println("Criar contato .......(1)");
		System.out.println("Remover contato .....(2)");
		System.out.println("Mostra lista ........(3)");
		System.out.println("Sair ................(0)");
		System.out.println();
	}
	
	static int escolheTarefa(Scanner sc) {
		System.out.print(">>> ");
		int action = sc.nextInt();
		while (action < 0 || action > 3) {
			System.out.println("Op??o n?o dispon?vel! Digite novamente:");
			
			imprimeMenu();
			
			System.out.print(">>> ");
			action = sc.nextInt();
		}
		return action;
	}
	
	static void executaTarefa() {
		
	}
	
}
