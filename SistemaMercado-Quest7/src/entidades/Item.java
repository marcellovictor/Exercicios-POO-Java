package entidades;

public class Item {

	//ATRIBUTOS
	
	private Produto produto;
	private int quantidade;
	
	//CONSTRUTORES
	
	public Item(Produto produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}
	
	public Item(Produto produto) {
		this.produto = produto;
		this.quantidade = 1;
	}

	//GETTERS E SETTERS
	
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}
	
	//METODOS
	
	@Override
	public String toString() {
		return produto.toString() + " - Quantidade: " + quantidade;
	}
	
	public double subTotal() {
		return produto.getPreco() * quantidade;
	}
	
	
}
