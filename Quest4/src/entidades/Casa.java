package entidades;

import java.util.ArrayList;
import java.util.List;

public class Casa {

	//ATRIBUTOS
	
	private String cor;
	private List<Porta> portas = new ArrayList<>();
	
	//CONSTRUTORES
	
	public Casa() {
		this.cor = "Branco";
	}
	
	//GETTERS E SETTERS
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public List<Porta> getPortas() {
		return portas;
	}
	
	//METODOS
	
	public int quantasPortasEstaoAbertas() {
		int soma = 0;
		for (int i = 0; i < portas.size(); i++) {
			if (portas.get(i).estaAberta()) {
				soma++;
			}
		}
		return soma;
	}
	
	public void imprimePortas() {
		for (int i = 0; i < portas.size(); i++) {
			System.out.println(i + ": " + portas.get(i));
		}
	}
}
