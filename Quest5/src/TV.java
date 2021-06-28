
public class TV {

	//ATRIBUTOS
	
	private boolean ligada;
	private int volume;
	private int canal;
	private boolean mutada;
	
	//CONSTRUTORES
	
	public TV() {
		this.ligada = false;
		this.volume = 5;
		this.canal = 11;
		this.mutada = false;
	}
	
	//GETTERS E SETTERS

	public boolean isLigada() {
		return ligada;
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public boolean isMutada() {
		return mutada;
	}

	public void setMutada(boolean mutada) {
		this.mutada = mutada;
	}

	public int getVolume() {
		return volume;
	}
	
	//MÉTODOS
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Ligada: " + ligada + "\n");
		sb.append("Volume: " + volume + "\n");
		sb.append("Canal: " + canal + "\n");
		sb.append("Mutada: " + mutada + "\n");
		
		return sb.toString();
	}
	
	public void botaoOnOff() {
		if (ligada) {
			ligada = false;
			System.out.println("Desligando TV...");
		}
		else {
			ligada = true;
			System.out.println("Ligando TV...");
		}
	}
	
	public void botaoMute() {
		if (mutada) {
			mutada = false;
			System.out.println("Som ativado...");
		}
		else {
			mutada = true;
			System.out.println("Som desativado...");
		}
	}
	
	public void subirCanal() {
		if (canal < 99) {
			canal++;
		}
		System.out.println("Canal atual: " + canal);
	}
	
	public void descerCanal() {
		if (canal > 0) {
			canal--;
		}
		System.out.println("Canal atual: " + canal);
	}
	
	public void aumentarVolume() {
		if (volume < 10) {
			volume ++;
		}
		System.out.println("Volume atual: " + volume);
	}
	
	public void diminuirVolume() {
		if (volume > 0) {
			volume--;
		}
		System.out.println("Volume atual: " + volume);
	}
	
	
	
}
