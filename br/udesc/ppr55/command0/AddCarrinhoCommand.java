package src.br.udesc.ppr55.command0;

public class AddCarrinhoCommand implements Command {

	private CarrinhoCompras carrinho;
	private int opMusica;

	public AddCarrinhoCommand(CarrinhoCompras cc, int opMusica) {
		this.carrinho = cc;
		this.opMusica = opMusica;
	}

	@Override
	public void execute() throws Exception {
		Musica m = BancoMusicas.getInstancia().getMusicas().get(opMusica);
		carrinho.add(m);

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
