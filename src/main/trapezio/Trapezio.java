package main.trapezio;

import main.funcoes.Funcoes;

public class Trapezio {
	public static void main(String [] args) {
		System.out.println(multipleSegment());
	}
	
	private static double multipleSegment() {
		return trapm(10);
	}
	
	private static double trapm(double n) {
		double soma = f(0);
		double h = 0.8 / n;
		
		for (int i = 1; i <= n -1 ; i++) {
			soma = soma + (2 * f(i * h));
		}
		
		soma = soma + f(0.8);
		
		return h * (soma / 2);
	}

	private static double f(double x) {
		return 0.2 + 25*x - 200 * Math.pow(x, 2) + 675 * Math.pow(x, 3)
				- 900 * Math.pow(x, 4) + 400 * Math.pow(x, 5);
	}
	
	/**
	 * 
	 * @param h Tamanho do segmento
	 * @param fn1 Tamanho do segmento vezes o pen�ltimo ponto de x em fun��o de f
	 * @param fn Ponto m�ximo no eixo x em fun��o de f
	 * @return
	 */
	public static double Trap(double h, double fn1, double fn) {
		return h * (fn1 + fn) / 2;
	}
	
	/**
	 * 
	 * @param n N�mero de segmentos
	 * @param tam Tamanho do segmento
	 * @return
	 */
	public static double trapmExercicio(double n, double tam) {
		double soma = Funcoes.f2(0);
		double h = tam / n;
		
		for (int i = 1; i <= n -1 ; i++) {
			soma = soma + (2 * Funcoes.f2(i * h));
		}
		
		soma = soma + Funcoes.f2(tam);
		
		return h * (soma / 2);
	}
}