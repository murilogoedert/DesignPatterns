package br.udesc.ppr55.command3.command;
import br.udesc.ppr55.command3.dao.BancoPessoas;
import br.udesc.ppr55.command3.modelo.Pessoa;
import br.udesc.ppr55.command3.observer.Observer;

public class GetCommand extends Command {

	private String[] dados;

	public GetCommand(Observer observer, String[] dados) {
		super(observer);
		this.dados = dados;
	}

	@Override
	public void execute() {
		BancoPessoas banco = BancoPessoas.getInstance();
		Pessoa p = banco.getPessoa(Integer.parseInt(this.dados[0]));
		observer.showMessage("Nome: " + p.getNome() + ", id: " + p.getId());		
	}

	@Override
	public void undo() {
		// Esse Command nao precisa de undo
	}

	@Override
	public void redo() {
		// Esse Command nao precisa de redo
	}

}
