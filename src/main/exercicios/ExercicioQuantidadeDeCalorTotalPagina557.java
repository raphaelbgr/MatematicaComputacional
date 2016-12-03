package main.exercicios;

public class ExercicioQuantidadeDeCalorTotalPagina557 {
	
	public static int TEMP_ATUAL = 25;
	public static int TEMP_DESEJADA = 100;
	
	public static void main(String[] args) {
		double T = TEMP_DESEJADA - TEMP_ATUAL;
		
		System.out.println(equacao(20, 1, T) + " cal");
	}
	
	/**
	 * 
	 * @param m Massa em gramas
	 * @param c Capacidade calorífica em cal/g * ºC
	 * @param T Variação de temperatura
	 * @return
	 */
	public static double equacao(double m, double c, double T) {
		return m * c * T;
	}
}