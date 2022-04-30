package br.udesc.ppr55.command4.observer;

import javax.swing.JPanel;

import br.udesc.ppr55.command4.observer.Observer;

public class SwingObserver implements Observer {
	
	private JPanel canvas;
	
	public SwingObserver(JPanel canvas) {
		this.canvas = canvas;
	}

	@Override
	public void atualizou() {
		canvas.repaint();
	}

}
