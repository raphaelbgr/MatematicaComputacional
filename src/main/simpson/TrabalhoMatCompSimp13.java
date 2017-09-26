package main.simpson;

import utils.Printer;

public class TrabalhoMatCompSimp13 {

	public static void main(String[] args) {
		double f0 = f(0);
		double f1 = f(0.2);
		double f2 = f(0.4);
		double f3 = f(0.6);
		double f4 = f(0.8);
		double h = 0.2;
		
		System.out.println("======= Simpson 1/3 Execução Única =======");
		Printer.printError(simp13(h, f0, f1, f2, f3, f4));
		System.out.println();
			
		System.out.println("======= Simp13m Algoritmo Iterativo =======");
		Printer.printError(Simp13m(h, 20));

	}

	// Função a ser utilizada
	private static double f(double x) {
		return 0.2 + 25*x - 200 * Math.pow(x, 2) + 675 * Math.pow(x, 3)
		- 900 * Math.pow(x, 4) + 400 * Math.pow(x, 5);
	}
	
	// Simpson 1/3
	private static double simp13(double h, double f0,  double f1, double f2, double f3, double f4) {		
		return 0.8*((h + (4*(f1+f3)) + 2*f2 + f4) / 12);
	}
	
	/**
	 * A função está travada em h e n fixos, os parâmetros não funcionam
	 * a não ser que modificados por você - programador, rs
	 * 
	 * @param h Tamanho de cada segmento já calculado
	 * @param n Numero correspondente ao valor do ponto m�ximo no eixo x
	 * @return
	 */
	private static double Simp13m(double h, double n) {
		double tam = 0.8 / n;
		double soma = f(0);
		for (int i = 1; i <= n - 2; i += 2) {
			soma = soma + (4 * f(i*tam)) + (2 * f(i*tam+tam));
		}
		soma = soma + (4 * f(0.8-tam)) + f(0.8);
		return tam * (soma / 3);
	}

}
