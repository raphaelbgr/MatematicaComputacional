package utils;

public class Print {
	
	private static final double TARGET = 1.640533;
	
	public static double printError(double e) {
		double m = TARGET - e; 			// Diferença do erro
		double a = (e / TARGET) * 100;	// Percentual do acerto (Acurácia)
		double p = 100 - a;				// Percentual do erro
		
		System.out.println("Diferença do erro: " + String.valueOf(m));
		System.out.println("Percentual do erro: " + String.valueOf(p) + "%");
		return e;
	}
}
