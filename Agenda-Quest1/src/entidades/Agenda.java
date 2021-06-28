package entidades;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

	private static List<Contato> listaDeContatos = new ArrayList<>();
	
	public void adicionarContato(Contato contato) {
		listaDeContatos.add(contato);
	}
	
	public void removerContato(Contato contato) {
		listaDeContatos.remove(contato);
	}
	
	public static List<Contato> getListaDeContatos() {
		return listaDeContatos;
	}
	
	public static void imprimeLista() {
		
		System.out.println();
		for (int i = 0; i < listaDeContatos.size(); i++) {
			System.out.println(listaDeContatos.get(i));
		}
		System.out.println();
		
	}
}
