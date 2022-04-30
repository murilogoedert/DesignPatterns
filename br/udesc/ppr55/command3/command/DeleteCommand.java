package br.udesc.ppr55.command3.command;

import br.udesc.ppr55.command3.dao.BancoPessoas;
import br.udesc.ppr55.command3.modelo.Pessoa;
import br.udesc.ppr55.command3.observer.Observer;

public class DeleteCommand extends Command {

	private String[] dados;

	public DeleteCommand(Observer observer, String[] dados) {
		super(observer);
		this.dados = dados;
	}

	@Override
	public void execute() {
		BancoPessoas banco = BancoPessoas.getInstance();
		Pessoa p = banco.getPessoa(Integer.parseInt(this.dados[0]));
		banco.removerPessoa(Integer.parseInt(this.dados[0]));
		this.observer.showMessage(p.getNome() + " Excluido com sucesso!");
		
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
