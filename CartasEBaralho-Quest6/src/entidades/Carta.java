package entidades;

public class Carta {

	//ATRIBUTOS
	
	private String valor;
	private String naipe;
	
	//CONSTRUTOR
	
	public Carta(String valor, String naipe) {
		this.valor = valor;
		this.naipe = naipe;
	}

	//GETTERS
	
	public String getNaipe() {
		return naipe;
	}

	public String getValor() {
		return valor;
	}
	
	//METODOS
	
	@Override
	public String toString() {
		return valor + " de " + naipe;
	}
	
	
}
