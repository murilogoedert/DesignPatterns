package br.udesc.ppr55.command0;

public interface Command {
	
	void execute() throws Exception;

	void undo();

	void redo();

}
