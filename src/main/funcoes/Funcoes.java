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
}
