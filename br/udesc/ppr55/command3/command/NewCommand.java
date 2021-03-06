package br.udesc.ppr55.command3.command;

import br.udesc.ppr55.command3.dao.BancoPessoas;
import br.udesc.ppr55.command3.observer.Observer;

public class NewCommand extends Command {

	private String[] dados;

	public NewCommand(Observer observer, String[] dados) {
		super(observer);
		this.dados = dados;
	}

	@Override
	public void execute() {
		BancoPessoas banco = BancoPessoas.getInstance();
		banco.addPessoa(Integer.parseInt(this.dados[0]), this.dados[1]);
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
