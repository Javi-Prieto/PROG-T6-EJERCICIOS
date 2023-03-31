package ejercicio1;


public class Calculadora {
	//Fields
	private double num1, num2;
	//Constructor

	public Calculadora(double num1, double num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	public Calculadora(double num1) {
		super();
		this.num1 = num1;
	}
	//Getter and Setter

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}
	//Methods
	public double sumar() {
		return num1 + num2;
	}
	public double restar() {
		return num1 - num2;
	}
	public double multiplicar() {
		return num1 * num2;
	}
	public double dividir() {
		return num1/num2;
	}
	public double hacerRaiz() {
		return Math.sqrt(num1);
	}
	public double elevar() {
		return Math.pow(num1, num2);
	}
}
