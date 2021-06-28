package entidades;

public class Porta {

	//ATRIBUTOS
	
	private double largura;
	private double altura;
	private String cor;
	private boolean aberta;
	
	//CONSTRUTORES
	
	public Porta(double largura, double altura, String cor) {
		this.largura = largura;
		this.altura = altura;
		this.cor = cor;
		this.aberta = false;
	}
	
	public Porta(double largura, double altura) {
		this.largura = largura;
		this.altura = altura;
		this.cor = "branco";
		this.aberta = false;
	}
	
	//GETTERS

	public double getLargura() {
		return largura;
	}

	public double getAltura() {
		return altura;
	}

	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}

	public boolean estaAberta() {
		return aberta;
	}
	
	
	//MÉTODOS
	
	@Override
	public String toString() {
		return cor + " - " + largura + "x" + altura + " - " + "Aberta: " + aberta;
	}
	
	
	public void moverPorta() {
		if (estaAberta()) {
			aberta = false;
			System.out.println("Porta fechando...");
		}
		else {
			aberta = true;
			System.out.println("Porta arbindo...");
		}
	}
}
