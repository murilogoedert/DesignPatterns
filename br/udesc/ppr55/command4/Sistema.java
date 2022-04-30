package br.udesc.ppr55.command4;

import javax.swing.SwingUtilities;

public class Sistema {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new PaintFixo();
			}
		});
	}

}
