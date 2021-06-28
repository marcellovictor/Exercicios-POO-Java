package entidades;

public class Baralho {

	private Carta[] arrayDeCartas = new Carta[52];
	
	public Baralho () {
		String naipe = null;
		
		for (int i = 0; i < 4; i++) {
			
			switch (i) {
			case 0:
				naipe = "Ouros";
				break;
				
			case 1:
				naipe = "Copas";
				break;
				
			case 2:
				naipe = "Espadas";
				break;
			
			case 3:
				naipe = "Paus";
				break;
				
			default:
				System.out.println("Erro no naipe!");
				break;
			}
			
			for (int j = 0; j < 13; j++) {
				String valor = null;
				
				switch (j) {
				case 0:
					valor = "Às";
					break;
					
				case 10:
					valor = "Valete";
					break;
					
				case 11:
					valor = "Dama";
					break;
					
				case 12:
					valor = "Rei";
					break;
					
				default:
					valor = Integer.toString(j+1);
					break;
				}
				
				arrayDeCartas[j + (13*i)] = new Carta(valor, naipe);
			}
			
		}
				
	}
	
	
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < 52; i++) {
			sb.append(arrayDeCartas[i] + "\n");
		}
		
		return sb.toString();
	}
}
