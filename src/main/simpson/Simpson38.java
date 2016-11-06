package main.simpson;

import main.funcoes.Funcoes;
import main.trapezio.Trapezio;
import utils.Print;

public class Simpson38 {

	public static void main(String[] args) {
		// Segmentos 1
		double seg1[] = {0, 0.2667, 0.5333, 0.8};
		double f[] = { Funcoes.f(seg1[0]), Funcoes.f(seg1[1]), Funcoes.f(seg1[2]), Funcoes.f(seg1[3])}; // 4 segmentos
		double h = 0.2; // n = 4 pontos igualmente espaçados
		
		System.out.println("======= Simpson 3/8 - Execução Única - 4 Pontos =======");
		System.out.println("Result: " + Print.printError(simp38(h, f, seg1)));
		System.out.println();
		
		// Segmentos 2
		double seg2[] = {0, 0.16, 0.32, 0.48, 0.64, 0.80};
		double g[] = {Funcoes.f(0), Funcoes.f(0.16), Funcoes.f(0.32), Funcoes.f(0.48), Funcoes.f(0.64), Funcoes.f(0.8)}; // 6 segmentos
		h = 0.16;
		System.out.println("======= Simpson 3/8 - Execução Única - 5 Pontos =======");
		System.out.println("Result: " + Print.printError(simp38(h, g, seg2)));
		System.out.println();
		
		System.out.println("======= Simpson 3/8 - Iterativo - 5 Pontos =======");
		System.out.println("Result: " + Print.printError(SimpInt(seg2[0], seg2[5], 6)));
	}
	
	// Formula de Simpson 3/8 - Única
	private static double simp38(double h, double [] f, double [] seg) {
		
		switch (f.length) {
		case 4:
			return 0.8*((h + 3*((f[1]+f[2])) + f[3]) / 8);
		case 6:
			return seg[2]*(f[0] + 4*f[1] + f[2]) / 6 + seg[3]*(f[2] + 3*(f[3]+f[4]) + f[5]) / 8;	
		default:
			return 0;
		}
	}
	
	/** Formula de Simpson 3/8 - Iterativa
	 * 
	 * @param a Ponto mínimo no eixo x
	 * @param b Ponto máximo no eixo x
	 * @param n Quantidade de segmentos
	 */
	private static double SimpInt(double a, double b, double n) {
		/**
		 * h Tamanho do segmento
		 */
		double h = (b - a) / n;
		double soma = 0;
		if (n == 1) {
			soma = Trapezio.Trap(h, Funcoes.f((n-1)*h), Funcoes.f(b));
		} else {
			double m = n;
			boolean impar = n % 2 != 0;
			if (impar && n > 1) {
				// Primeiro array com os valores dos pontos em função de f
				// Segundo array com os valores dos segmentos ( b maximo menos a qtd de vezes do tamanho de cada)
				soma = soma + simp38(h, new double [] { Funcoes.f(b-3*h), Funcoes.f(b-2*h), Funcoes.f(b-1*h), Funcoes.f(b) }, new double []{ b-3*h, b-2*h, b-1*h, b });
				m = n - 3;
			}
			if (m > 1) {
				soma = soma + Simpson13.Simp13m(h, b);
			}
		}
		return soma;
	}

}