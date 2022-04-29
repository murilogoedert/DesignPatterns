package br.udesc.ppr55.command3.command;

import br.udesc.ppr55.command3.observer.Observer;

public abstract class Command {
	
	protected Observer observer;

	public Command(Observer observer) {
		this.observer = observer;
	}
	
	public abstract void execute();
	
	public abstract void undo();
	
	public abstract void redo();

}
