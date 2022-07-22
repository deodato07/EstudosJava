package br.com.deodato07.cm;

import br.com.deodato07.cm.modelo.Tabuleiro;
import br.com.deodato07.cm.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 3);
		new TabuleiroConsole(tabuleiro);
		
	}
}
