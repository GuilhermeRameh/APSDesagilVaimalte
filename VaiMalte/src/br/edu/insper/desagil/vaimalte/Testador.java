package br.edu.insper.desagil.vaimalte;

import java.util.ArrayList;

public class Testador {
	
	public boolean testeA() {
	    Carrinho carrinho = new Carrinho();
	    // Teste A não adiciona nenhum produto
	    Caixa caixa = new Caixa();
	    double totalCaixa = caixa.retornaTotalCaixa(carrinho);
	    if (totalCaixa == 0) {
	    	return true;
	    }		
		return false;
	}

	public boolean testeB() {
		Carrinho carrinho = new Carrinho();
	    // Teste B adiciona 1 produto sem desconto
	    Produto produto = new Produto(1, "Cenoura", 10.0);
		carrinho.addNoCarrinho(produto);
		
		Caixa caixa = new Caixa();
	    double totalCaixa = caixa.retornaTotalCaixa(carrinho);
	    if (totalCaixa == 10.0) {
	    	return true;
	    }		
	    return false;
	}

	public boolean testeC() {
		Carrinho carrinho = new Carrinho();
	    // Teste C adiciona 1 produto com desconto
	    Produto produto = new Produto(1, "Cenoura", 10.0);
		carrinho.addNoCarrinho(produto);
		
		Caixa caixa = new Caixa();
		caixa.adicionaAoDicionario(produto, 10);
	    double totalCaixa = caixa.retornaTotalCaixa(carrinho);
	    if (totalCaixa == 9.0) {
	    	return true;
	    }		
	    return false;
	}

	public boolean testeD() {
		Carrinho carrinho = new Carrinho();
	    // Teste D adiciona 1 produto com desconto e duas unidades de outro produto sem desconto
	    Produto produto1 = new Produto(1, "Cenoura", 10.0);
	    Produto produto2 = new Produto(2, "Ervilha com Wasabi", 20.00);
		carrinho.addNoCarrinho(produto1);
		carrinho.addNoCarrinho(produto2);
		carrinho.addNoCarrinho(produto2);
		
		Caixa caixa = new Caixa();
		caixa.adicionaAoDicionario(produto1, 10);
	    double totalCaixa = caixa.retornaTotalCaixa(carrinho);
	    if (totalCaixa == 49.0) {
	    	return true;
	    }		
	    return false;
	}

	public boolean testeE() {
		Carrinho carrinho = new Carrinho();
	    // Teste E adiciona 2 unidades de um produto com desconto e 1 unidade de outro produto sem desconto
	    Produto produto1 = new Produto(1, "Cenoura", 10.0);
	    Produto produto2 = new Produto(2, "Ervilha com Wasabi", 20.00);
		carrinho.addNoCarrinho(produto1);
		carrinho.addNoCarrinho(produto1);
		carrinho.addNoCarrinho(produto2);
		
		Caixa caixa = new Caixa();
		caixa.adicionaAoDicionario(produto1, 10);
	    double totalCaixa = caixa.retornaTotalCaixa(carrinho);
	    if (totalCaixa == 38.0) {
	    	return true;
	    }		
	    return false;
	}
}
