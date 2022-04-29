package br.udesc.ppr55.command0;

public class ListarTamanhoMusicasCommand implements Command {

	private CarrinhoCompras cc;

	public ListarTamanhoMusicasCommand(CarrinhoCompras cc) {
		this.cc = cc;
	}

	@Override
	public void execute() throws Exception {
		int tamTotal = 0;
		for (Musica mus:cc.getProdutos()) {
			tamTotal += mus.getTamanho();
		}
		System.out.println("> " + tamTotal + " MB");

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
