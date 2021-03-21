package br.edu.insper.desagil.vaimalte;

import java.util.*;

public class Caixa {

	private Map<Integer, Integer> dicionarioDeDescontos;

	public Caixa() {
		this.dicionarioDeDescontos = new HashMap<>();
	}
	
	public void adicionaAoDicionario(Produto produto, int desconto) {
		this.dicionarioDeDescontos.put(produto.getCodigo(), desconto);
	}
	
	public double retornaTotalCaixa(Carrinho carrinho) {
		double total=0;
		ArrayList<Pedido> listaDePedidos = carrinho.getListaDePedidos();
		for (int i=0; i<listaDePedidos.size(); i++) {
			Pedido pedido = listaDePedidos.get(i);
			Produto produto = pedido.getProduto();
			int codigo = produto.getCodigo();
			if (!this.dicionarioDeDescontos.isEmpty() && this.dicionarioDeDescontos.get(codigo)!=null) {
				double desconto = this.dicionarioDeDescontos.get(codigo);
				double precoComDesconto = produto.getPreco()-produto.getPreco()*(desconto/100);
				double somaPedido = pedido.retornaTotal(precoComDesconto);
				total += somaPedido;
				continue;
			}
			double precoComDesconto = produto.getPreco();
			double somaPedido = pedido.retornaTotal(precoComDesconto);			
			total += somaPedido;
		}
		return total;
	}
	
}
