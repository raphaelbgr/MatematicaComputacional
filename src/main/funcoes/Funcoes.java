package main.funcoes;

public class Funcoes {
	
	// Equação a ser utilizada
	public static double f(double x) {
		return 0.2 + 25*x - 200 * Math.pow(x, 2) + 675 * Math.pow(x, 3)
				- 900 * Math.pow(x, 4) + 400 * Math.pow(x, 5);
	}
	
	// Equação a ser utilizada
	public static double f2(double x) {
		return Math.pow(x, 2) * Math.pow(Math.E, x);
	}
	
	// Equação a ser utilizada para o Runge Kutta
	public static double f3(double x, double y) {
		return -2 * Math.pow(x, 3) + 12 * Math.pow(x, 2) - 20 * x + 8.5;
	}
	
	// Equação f3 integrada usada para o cálculo do erro, como dito no livro
	public static double f4(double x) {
		return (-1 * (Math.pow(x, 4) / 2)) + (4 * Math.pow(x, 3)) 
				- (10 * Math.pow(x, 2)) + (8.5 * x) + 1;
	}
}
