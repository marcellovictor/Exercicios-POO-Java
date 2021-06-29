package app;

import entidades.Compra;
import entidades.Item;
import entidades.Produto;

public class Main {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Tênis", 499.90);
		Produto p2 = new Produto("Bola", 69.99);
		Produto p3 = new Produto("Celular", 2600.0);
		
		Item i1 = new Item(p1, 2);
		Item i2 = new Item(p2, 5);
		Item i3 = new Item(p3);
		
		Compra comp = new Compra();
		
		comp.getItens().add(i1);
		comp.getItens().add(i2);
		comp.getItens().add(i3);
		
		System.out.println(comp);

	}

}
