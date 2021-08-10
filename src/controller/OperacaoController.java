package controller;

import java.text.DecimalFormat;

public class OperacaoController {
	public OperacaoController() {
		super();
	}
	
	public void percerrerVetor(int vetor[]) {
		DecimalFormat df = new DecimalFormat("#,#######0.0000000");
		double tempoInicial = System.nanoTime();
		for(int posicao : vetor) {
			posicao = 1;
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial; 
		tempoTotal = tempoTotal / Math.pow(10, 9);
		
		System.out.println("Vetor com "+vetor.length+" posições: "+df.format(tempoTotal)+" S");
		
	}	
}
