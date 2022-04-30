package br.udesc.ppr55.command4.command;

import br.udesc.ppr55.command4.observer.Observer;

public abstract class Command {
	
	private Observer observer;

	public Command(Observer obs) {
		this.observer = obs;
	}

	public abstract void execute();
	
	public abstract void undo();
	
	public abstract void redo();

}
