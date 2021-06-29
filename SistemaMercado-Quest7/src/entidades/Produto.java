package entidades;

public class Produto {

	//ATRIBUTOS
	
	private String nome;
	private double preco;
	private int emEstoque;
	
	//CONSTRUTORES
	
	public Produto(String nome, double preco, int emEstoque) {
		this.nome = nome;
		this.preco = preco;
		this.emEstoque = emEstoque;
	}
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
		this.emEstoque = 0;
	}
	
	//GETTERS
	
	public String getNome() {
		return nome;
	}
	public double getPreco() {
		return preco;
	}
	
	public int getEmEstoque() {
		return emEstoque;
	}
	
	//METODOS
	
	@Override
	public String toString() {
		return nome + " - R$" + String.format("%.2f", preco);
	}
	
	public void vendido(int quantidade) {
		emEstoque -= quantidade;
	}
	
	public void novoCarregamento(int quantidade) {
		emEstoque += quantidade;
	}
	
	
}
