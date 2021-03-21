package br.edu.insper.desagil.vaimalte;

public class Pedido {

	private Produto produto;
	private int quantidade;
	
	public Pedido(Produto produto) {
		this.produto = produto;
		this.quantidade = 1;
	}

	public Produto getProduto() {
		return produto;
	}

	public int getQuantidade() {
		return quantidade;
	}
	
	public void incrementaQuantidade() {
		this.quantidade += 1;
	}
	
	public double retornaTotal(double preco) {
		return this.quantidade*preco;
	}
}
