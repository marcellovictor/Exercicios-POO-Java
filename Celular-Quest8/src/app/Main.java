package app;

import entidades.Bateria;
import entidades.Celular;

public class Main {

	public static void main(String[] args) {
		
		Bateria bat = new Bateria(25);
		
		Celular cel = new Celular(bat);
		
		System.out.println(cel.getBateria().porcentagemBateria());
		
		cel.enviarMensagem();
		cel.enviarMensagem();
		cel.enviarMensagem();
		
		System.out.println(cel.getBateria().porcentagemBateria());
		
		cel.fazerChamada(10);
		
		System.out.println(cel.getBateria().porcentagemBateria());

	}

}
