package br.udesc.ppr55.command4.command;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

import br.udesc.ppr55.command4.observer.Observer;

public class CommandFactory {

	private Map<String, Class<? extends Command>> comandos = new HashMap<>();
	private Observer observer;

	public CommandFactory(Observer observer) {
		comandos.put("quadrado", QuadradoCommand.class);
		this.observer = observer;
	}

	public Command getCommand(String comando) throws Exception {
	
		Class<? extends Command> commClass = comandos.get(comando);
		
		Class<?>[] params;
		if (dados != null) {
			params = new Class<?>[] {Observer.class, String[].class};
		} else {
			params = new Class<?>[] {Observer.class};
		}

		Constructor<? extends Command> constr = commClass.getConstructor(params);
		
		Command comm;
		if (dados != null) {
			comm = constr.newInstance(observer, dados);
		} else {
			comm = constr.newInstance(observer);
		}

		return comm;
	}
}
