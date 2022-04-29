package br.udesc.ppr55.command3.sistema;

import br.udesc.ppr55.command3.observer.Observer;

public class ConsoleObserver implements Observer {

	@Override
	public void buscouDados(String[][] dados) {
		
		for (String[] umDados: dados) {
			System.out.println(umDados[0] + " " + umDados[1]);
		}
		
	}

}
