package main.euler;

public class Euler {
	
	/**
	 * Página 589 do livro
	 * @param args
	 */
	public static void main(String[] args) {
		// Intervalos
		double xi = 0;
		double xf = 4;
		
		double x = xi;
		double y = 1;
		
		double dx = 0.5;
		double  nc = (xf - xi) / dx;
		
		double yv = -0.5 * Math.pow(x, 4) + 4 * Math.pow(x, 3)
				- 10 * Math.pow(x, 2) + 8.5 * x + 1;
		
//		System.out.println("xv:\t" + x + "\tyv:\t" + yv + "\t" + " y Euler:\t" + y);
		
		for (int i = 1; i <= nc; i++) {
			yv = -0.5 * Math.pow(x, 4) + 4 * Math.pow(x, 3)
					- 10 * Math.pow(x, 2) + 8.5 * x + 1;
			
			double dydx = -2 * Math.pow(x, 3) + 12 * Math.pow(x, 2)
					- 20 * x + 8.5;
			y = y + dydx * dx;
			x = x + dx;
			System.out.println("xv:\t" + x + "\tyv:\t" + yv + "\t" + " y Euler:\t" + y);
		}
	}
}
