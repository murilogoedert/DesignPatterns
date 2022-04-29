package br.udesc.ppr55.command0;

import java.util.List;

public class ListarCarrinhoCommand implements Command{
	


	private List<Musica> produtos;

	public ListarCarrinhoCommand(List<Musica> produtos) {
		this.produtos = produtos;
	}

	@Override
	public void execute() throws Exception {
		for (Musica mus:this.produtos) {
			System.out.println("> " + mus);
		}
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void redo() {
		// TODO Auto-generated method stub
		
	}

}
