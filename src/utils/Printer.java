package utils;

public class Printer {
	
	public static final double DEFAULT_TARGET = 1.640533;
	public static final double EXERCISE_ERROR = 98.428;
	
	public static double printError(double e, double error) {
		double m = error - e; 			// Diferença do erro
		double a = (e / error) * 100;	// Percentual do acerto (Acurácia)
		double p = 100 - a;				// Percentual do erro
		
		System.out.println("Resultado:\t\t" + String.valueOf(e));
		System.out.println("Diferença do erro:\t" + String.valueOf(m));
		System.out.println("Percentual do erro:\t" + String.valueOf(p) + "%");
		return e;
	}
}
