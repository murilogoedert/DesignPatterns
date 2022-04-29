package br.udesc.ppr55.command0;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {

	private List<Musica> produtos = new ArrayList<>();
	
	public void add(Musica m) {
		produtos.add(m);
	}

	public List<Musica> getProdutos() {
		return this.produtos;
	}

}
