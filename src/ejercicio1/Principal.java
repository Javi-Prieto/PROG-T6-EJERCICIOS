package ejercicio1;

import utilidades.Leer;

public class Principal {
	public static void main(String[] args){
		double num1, num2;
		int op = 1;
		do {
			try {
				imprimirMenu();
				System.out.println("¿Qué desea hacer?");
				op = Leer.datoInt();
				switch(op) {
					case 1:
						System.out.println("Indique un sumando");
						num1 = Leer.datoDouble();
						System.out.println("Indique el otro sumando");
						num2 = Leer.datoDouble();
						
						System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
						break;
					case 2:
						System.out.println("Indique el número restado");
						num1 = Leer.datoDouble();
						System.out.println("Indique el número a restar");
						num2 = Leer.datoDouble();
						
						System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
						break;
					case 3:
						System.out.println("Indique el primer número");
						num1 = Leer.datoDouble();
						System.out.println("Indique el segundo número");
						num2 = Leer.datoDouble();
						
						System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
						break;
					case 4:
						System.out.println("Indique el dividendo");
						num1 = Leer.datoDouble();
						System.out.println("Indique el divisor");
						num2 = Leer.datoDouble();
						
						System.out.println(num1 + "/" + num2 + "=" + (num1/num2));
						break;
					case 5:
						System.out.println("Diga el número");
						num1 = Leer.datoDouble();
						System.out.println("Raiz cuadrada de " +num1 +  "=" + Math.sqrt(num1));
						break;
					case 6:
						System.out.println("Diga la base");
						num1 = Leer.datoDouble();
						System.out.println("Diga el exponente");
						num2 = Leer.datoDouble();
						System.out.println(num1 + "^" + num2 + "=" + Math.pow(num1, num2));
						break;
					case 0:
						System.out.println("Gracias por usar el Programa");
						break;
					default:
						System.err.println("Error: Número Incorrecto");
				}
			}catch(ArithmeticException e){
				System.err.println("Error: Esta usted intendando dividir por 0");
			}catch(NumberFormatException e) {
				System.err.println("Error: Esta usted intentando introducir un valor incorrecto");
			}catch(Exception e) {
				System.err.println("Error: Error desconocido, estamos trabajando en ello");
			}
		}while(op != 0);
	}
	public static void imprimirMenu() {
		System.out.println("----------------CALCULADORA----------------");
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");
		System.out.println("5. Raíz Cuadrada");
		System.out.println("6. Elevar");
		System.out.println("0. Salir");
		System.out.println("------------------------------------------");
	}
}
