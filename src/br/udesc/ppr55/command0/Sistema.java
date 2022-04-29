package br.udesc.ppr55.command0;

import java.util.Scanner;

public class Sistema {

	public static void main(String[] args) throws Exception {
		Musica m1 = new Musica("AAahhhh", 15430, 15, 13.2f);
		Musica m2 = new Musica("Vai moleque", 22311, 72, 13.2f);
		Musica m3 = new Musica("Louca da caixa d'agua", 35723, 84, 13.2f);
		
		BancoMusicas.getInstancia().add(m1);
		BancoMusicas.getInstancia().add(m2);
		BancoMusicas.getInstancia().add(m3);
		
		CarrinhoCompras cc = new CarrinhoCompras();
		
		CommandInvoker invoker = new CommandInvoker();

		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("Menu");
			System.out.println("1-Adicionar no carrinho");
			System.out.println("2-Listar carrinho");
			System.out.println("3-Tamanho das m\u00FAsicas");
			System.out.println("4-Pre\u00E7o total");
			
			int op = sc.nextInt();
			switch (op) {
			    case 1: // adicionar no carrinho
			    		System.out.println("Escolha a m\u00FAsica (1 a 3)");
			    		int opMusica = sc.nextInt() - 1;
			    		
			    		Command comm1 = new AddCarrinhoCommand(cc, opMusica);
			    		invoker.execute(comm1);
			    	

			    		break;
			    		
			    case 2:	// listar carrinho 
			    		Command comm2 = new ListarCarrinhoCommand(cc.getProdutos());
			    		invoker.execute(comm2);
			    		break;
			    		
			    case 3: // tamanho das musicas
			    		Command comm3 = new ListarTamanhoMusicasCommand(cc);
			    		invoker.execute(comm3);
			    		break;
			    		
			    case 4: // preco total
			    		float precoTotal = 0;
			    		for (Musica mus:cc.getProdutos()) {
			    			precoTotal += mus.getPreco();
			    		}
			    		System.out.println("> R$ " + precoTotal);
			    		break;
			}
		}
	}

}
