package ejercicio2;

public class Temperatura {
	//Methods
	public double calcularTemperaturaEnFahrenheit(double celsius) throws ImpossibleTemperatureException{
		if(celsius < -273) {
			throw new ImpossibleTemperatureException("No puede haber temperaturas menores a -273º");
		}else {
			return (celsius * 1.8)+32;
		}
	}
}
