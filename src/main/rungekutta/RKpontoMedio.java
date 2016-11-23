package main.rungekutta;

import main.funcoes.Funcoes;

/**
 * Página 623 do PDF -- Algoritmo de RK de segunda ordem
 * @author md10
 *
 */
public class RKpontoMedio {
	public static void main(String[] args) {
		double y0 = 1, yv;
		double h = 0.5;		//(b - a) / n;
		double yi = 1;
		
		System.out.println("x\t yVerd\t\t y\t\t erro%\t");
		for (double i = 0; i <= 4.0; i += h) {
			yv = Funcoes.f4(i);
			
			double k1 = Funcoes.f3(i, y0);
			double k2 = Funcoes.f3(i + h/2, y0 + (k1*h)/2);
			
			double yant = yi; // y Antes de calcular yi
			yi = yi + k2 * h;
			System.out.println(i + "\t " + yv + "\t\t" + yant);
		}
		
	}
}
