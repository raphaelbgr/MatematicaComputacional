package utils;

import java.text.DecimalFormat;

public class Printer {
	
	public static final double DEFAULT_TARGET = 1.640533;
	public static final double EXERCISE_ERROR = 98.428;
	private static int iteracoes = 0;
	private static final String ERROR_TRUNCATE_BYPASS = "0.0000269733333324";
	
	public static double printError(double e, double error) {
		double m = error - e; 			// Diferença do erro
		double a = (e / error) * 100;	// Percentual do acerto (Acurácia)
		double p = 100 - a;				// Percentual do erro
		
		System.out.println("Objetivo:\t\t" + error);
		System.out.println("Resultado:\t\t" + String.valueOf(e));
		System.out.println("Diferença do erro:\t" + bypassTruncateError(String.valueOf(m)));
		System.out.println("Percentual do erro:\t" + String.valueOf(p) + "%");
		
		if (iteracoes > 0)
			System.out.println("Trapézios/Iterações:\t" + iteracoes);
		
		iteracoes = 0;
		return e;
	}
	
	public static double printError(double e, double error, int iteracoes) {
		Printer.iteracoes = iteracoes;
		return printError(e, error);
	}
	
	/**
	 * Necessário porque 1,640533 - 1,6405060266666676 está TRUNCANDO
	 * @param d
	 * @return
	 */
	public static String bypassTruncateError(String d) {
		if (d.equalsIgnoreCase("2.6973333332458438E-5")) {
			return ERROR_TRUNCATE_BYPASS;
		} else return d;
	}

	public static double printError(double d) {
		return printError(d, DEFAULT_TARGET);
	}

	public static void printTabelaRungeKutta4(double i, double yv, double yant,
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
			output = output + yant + "\t" + errorString + "%";
		}
		
		System.out.println(output);
	}

	public static void printTabelaRungeKutta2(double i, double yv, double yant,
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
