package main.exercicios;

import main.simpson.Simpson13;
import main.trapezio.Trapezio;
import utils.Printer;

public class ExercicioVinteUmPontoSeis {

	public static void main(String[] args) {		
		System.out.println("Exerc�cio 21.6 \t\t-- M�todo anal�tico (Wolfram alpha)");
		System.out.println("98.428");
		System.out.println();
		
		System.out.println("Exerc�cio 21.6 \t\t-- M�todo do Trap�zio");
		Printer.printError(Trapezio.trapmExercicio(4, 3), Printer.EXERCISE_ERROR);
		System.out.println();
		
		System.out.println("Exerc�cio 21.6 \t\t-- M�todo do Simpson 1/3");
		Printer.printError(Simpson13.Simp13mExercicio(3.0 / 4.0, 4.0), Printer.EXERCISE_ERROR);
		System.out.println();
	}

}
