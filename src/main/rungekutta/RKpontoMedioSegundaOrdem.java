package main.rungekutta;

import main.funcoes.Funcoes;
import utils.Printer;

/**
 * Página 623 do PDF -- Algoritmo de RK de segunda ordem
 * @author md10
 *
 */
public class RKpontoMedioSegundaOrdem {
	public static void main(String[] args) {
		double y0 = 1, yv;
		double h = 0.5;		//(b - a) / n;
		double yi = 1;
		
		System.out.println("==== RungeKutta de Segunda Ordem ====");
		System.out.println("==== Tabela do Livro para comparação de resultado ====");
		System.out.println("x\t yVerd\t\ty\t\terro%\t");
		for (double i = 0; i <= 4.0; i += h) {
			yv = Funcoes.f4(i);
			
			double k1 = Funcoes.f3(i, y0);
			double k2 = Funcoes.f3(i + h/2, y0 + (k1*h)/2);
			
			double yant = yi; // y Antes de calcular yi
			yi = yi + k2 * h;
			
			Printer.printTabelaRungeKutta2(i, yv, yant, ((yv - yant) / yv) * 100);
		}
		
	}
}
