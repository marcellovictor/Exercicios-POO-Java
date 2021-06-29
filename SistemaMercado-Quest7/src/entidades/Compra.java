package entidades;

import java.util.ArrayList;
import java.util.List;

import util.FormasDePagamento;

public class Compra {

	//ATRIBUTOS
	
	private List<Item> itens = new ArrayList<>();
	private FormasDePagamento formaDePagamento;
	
	//CONSTRUTOR
	
	public Compra() {
		this.formaDePagamento = FormasDePagamento.DINHEIRO;
	}

	//GETTERS E SETTERS
	
	public List<Item> getItens() {
		return itens;
	}

	public FormasDePagamento getFormaDePagamento() {
		return formaDePagamento;
	}

	public void setFormaDePagamento(FormasDePagamento formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}
	
	//METODOS
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < itens.size(); i++) {
			sb.append(itens.get(i) + "\n");
		}
		
		sb.append("\nTotal: R$" + String.format("%.2f", this.total()));
		
		return sb.toString();
	}
	
	public double total() {
		
		double tot = 0;
		
		for (int i = 0; i < itens.size(); i++) {
			tot += itens.get(i).subTotal();
		}
		
		return tot;
	}
	
}
