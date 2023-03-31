package ejercicio2;

import java.util.Scanner;

public class Principal {
	public static void main(String [] args) {
		double celsius;
		int op;
		Scanner sc = new Scanner(System.in);
		Temperatura tem = new Temperatura();
		
		do {
			
			try {
				System.out.println("Indique los grasdos celsius");
				celsius = Double.parseDouble(sc.nextLine());
				tem.calcularTemperaturaEnFahrenheit(celsius);
			}catch(ImpossibleTemperatureException e) {
				System.err.println("Usted ha introducido un valor inferior a -273º");
			}catch(NumberFormatException e) {
				System.err.println("Usted ha introducido un valor incorrecto");
			}catch(Exception e) {
				System.err.println("Error desconocido");
			}
			System.out.println("Si desea parar pulse 0");
			op =  Integer.parseInt(sc.nextLine());
		}while(op != 0);
	}
}
