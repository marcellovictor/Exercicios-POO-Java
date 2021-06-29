package entidades;

public class Bateria {

	//ATRIBUTOS
	
	private int capacidadeDeCarga;
	private int cargaAtual;
	
	
	//CONSTRUTOR
	
	public Bateria(int capacidadeDeCarga) {
		this.capacidadeDeCarga = capacidadeDeCarga;
		this.cargaAtual = capacidadeDeCarga;
	}
	
	
	//GETTERS
	
	public int getCapacidadeDeCarga() {
		return capacidadeDeCarga;
	}


	public int getCargaAtual() {
		return cargaAtual;
	}
	
	
	//METODOS

	public String porcentagemBateria() {
		return  String.format("%s%%", Integer.toString(cargaAtual * 100 / capacidadeDeCarga));
	}
	
	public void gastarBateria(int quantidade) {
		cargaAtual-= quantidade;
		if (cargaAtual < 0) {
			cargaAtual = 0;
		}
	}
	
	public void carregarBateria() {
		while (cargaAtual < capacidadeDeCarga) {
			cargaAtual++;
		}
	}
}
