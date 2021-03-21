package br.edu.insper.desagil.vaimalte;

import java.util.*;

public class Carrinho {
	
	private ArrayList<Pedido> listaDePedidos;

	public Carrinho() {
		this.listaDePedidos = new ArrayList<>();
	}

	public ArrayList<Pedido> getListaDePedidos() {
		return listaDePedidos;
	}
	
	public void addNoCarrinho(Produto produto) {
		Pedido novoPedido = new Pedido(produto);
		boolean addLista = true;
		for (int i=0; i < this.listaDePedidos.size(); i++) {
			Pedido pedidoDaLista = this.listaDePedidos.get(i);
			if (produto == pedidoDaLista.getProduto()) {
				pedidoDaLista.incrementaQuantidade();
				addLista = false;
			}
		}
		if (addLista) {
			this.listaDePedidos.add(novoPedido);
		}
	}
}
