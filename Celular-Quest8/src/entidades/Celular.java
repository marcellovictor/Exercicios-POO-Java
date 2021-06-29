package entidades;

public class Celular {

	//ATRIBUTOS
	
	private Bateria bateria;
	
	//CONSTRUTOR
	
	public Celular(Bateria bateria) {
		this.bateria = bateria;
	}
	
	//GETTERS E SETTERS
	
	public Bateria getBateria() {
		return bateria;
	}
	
	public void setBateria(Bateria bateria) {
		this.bateria = bateria;
	}
	
	//METODOS
	
	public void enviarMensagem() {
		bateria.gastarBateria(1);
	}
	
	public void fazerChamada(int segundos) {
		bateria.gastarBateria(segundos/5);
	}
}
