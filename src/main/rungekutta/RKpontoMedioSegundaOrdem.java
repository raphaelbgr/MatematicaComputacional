package main.rungekutta;

import java.text.DecimalFormat;

import main.funcoes.Funcoes;

/**
 * P�gina 623 do PDF -- Algoritmo de RK de segunda ordem
 * @author md10
 *
 */
public class RKpontoMedioSegundaOrdem {
	public static void main(String[] args) {
		double y0 = 1, yv;
		double h = 0.5;		//(b - a) / n;
		double yi = 1;
		
		System.out.println("x\t yVerd\t\ty\t\terro%\t");
		for (double i = 0; i <= 4.0; i += h) {
			yv = Funcoes.f4(i);
			
			double k1 = Funcoes.f3(i, y0);
			double k2 = Funcoes.f3(i + h/2, y0 + (k1*h)/2);
			
			double yant = yi; // y Antes de calcular yi
			yi = yi + k2 * h;
			
			print(i, yv, yant, ((yv - yant) / yv) * 100);
		}
		
	}

	private static void print(double i, double yv, double yant,
			double error) {
		
		DecimalFormat df = new DecimalFormat("0.00");
		String errorString = df.format(error);
		
		String output;
		if (String.valueOf(yv).length() > 6) {
			output = i + "\t " + yv + "\t";
		} else {
			output = i + "\t " + yv + "\t\t";
		}
		
		if (String.valueOf(yant).length() > 6) {
			output = output + yant + "\t" + errorString + "%";
		} else {
			output = output + yant + "\t\t" + errorString + "%";
		}
		
		System.out.println(output);
	}
}
