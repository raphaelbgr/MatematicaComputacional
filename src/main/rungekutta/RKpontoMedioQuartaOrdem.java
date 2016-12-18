package main.rungekutta;

import main.funcoes.Funcoes;
import utils.Printer;

/**
 * Página 626 do PDF -- Algoritmo de RK de quarta ordem
 * @author md10
 *
 */
public class RKpontoMedioQuartaOrdem {
	public static void main(String[] args) {
		double y0 = 1, yv;
		double h = 0.5;		//(b - a) / n;
		double yi = 1;
		
		System.out.println("==== RungeKutta de Quarta Ordem ====");
		System.out.println("==== Tabela do Livro para comparação de resultado ====");
		System.out.println("x\t yVerd\t\ty\terro");
		for (double i = 0; i <= 4.0; i += h) {
			yv = Funcoes.f4(i);
			
			double k1 = Funcoes.f3(i, y0);
			double k2 = Funcoes.f3(i + h/2, y0 + (k1*h)/2);
			double k3 = Funcoes.f3(i + h/2, y0 + (k2*h)/2);
			double k4 = Funcoes.f3(i + h, y0 + k3*h);
			
			double yant = yi; // y Antes de calcular yi
			yi = yi + 1.0/6.0 * (k1 + 2*k2 + 2*k3 + k4) * h;
			
			Printer.printTabelaRungeKutta4(i, yv, yant, ((yv - yant) / yv) * 100);
		}
	}
}
