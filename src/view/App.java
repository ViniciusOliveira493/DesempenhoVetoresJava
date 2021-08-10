package view;

import controller.OperacaoController;

public class App {
	public static void main(String[] args) {
		OperacaoController op = new OperacaoController();
		int v1[] = new int[1000];
		int v2[] = new int[10000];
		int v3[] = new int[100000];
		
		op.percerrerVetor(v1);
		op.percerrerVetor(v2);
		op.percerrerVetor(v3);
		
		
		
		
	}
}
