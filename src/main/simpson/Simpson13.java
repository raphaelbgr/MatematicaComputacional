package main.simpson;

import main.funcoes.Funcoes;

public class Simpson13 {
	
	private static final double TARGET = 1.640533;

	public static void main(String[] args) {
		
		double f0 = Funcoes.f(0), f1 = Funcoes.f(0.2), f2 = Funcoes.f(0.4), f3 = Funcoes.f(0.6), f4 = Funcoes.f(0.8);
		double h = 0.2;
		
		System.out.println("======= Simpson 1/3 Execução Única =======");
		System.out.println("Result: " + printError(simp13(h, f0, f1, f2, f3, f4)));
		System.out.println();
		
		System.out.println("======= Smp13m Algoritmo Iterativo =======");
		System.out.println("Simp13m result: " + printError(Simp13m(h, 0.8)));
	}
	
	private static double printError(double e) {
		double m = TARGET - e; 			// Diferença do erro
		double a = (e / TARGET) * 100;	// Percentual do acerto (Acurácia)
		double p = 100 - a;				// Percentual do erro
		
		System.out.println("Diferença do erro: " + String.valueOf(m));
		System.out.println("Percentual do erro: " + String.valueOf(p) + "%");
		return e;
	}
	
	private static double simp13(double h, double f0,  double f1, double f2, double f3, double f4) {		
		return 0.8*((h + (4*(f1+f3)) + 2*f2 + f4) / 12);
	}
	
	/**
	 * 
	 * @param h Tamanho de cada segmento já calculado
	 * @param n Numero correspondente ao valor do ponto máximo no eixo x
	 * @return
	 */
	public static double Simp13m(double h, double n) {
		n = 20;
		h = 0.8 / n;
		double soma = Funcoes.f(0);
		for (int i = 1; i <= n - 2; i += 2) {
			soma = soma + (4 * Funcoes.f(i*h)) + (2 * Funcoes.f(i*h+h));
		}
		soma = soma + (4 * Funcoes.f(0.8-h)) + Funcoes.f(0.8);
		return h * (soma / 3);
	}
	
	/**
	 * 
	 * @param h Tamanho do segmento
	 * @param n Numero correspondente ao valor do ponto máximo no eixo x
	 * @return
	 */
	public static double Simp13mExercicio(double h, double n) {
		n = 40;
		h = 3 / n;
		double soma = Funcoes.f2(0);
		for (int i = 1; i <= n - 2; i += 2) {
			soma = soma + (4 * Funcoes.f2(i*h)) + (2 * Funcoes.f2(i*h+h));
		}
		soma = soma + (4 * Funcoes.f2(0.8-h)) + Funcoes.f2(0.8);
		return h * (soma / 3);
	}

}
