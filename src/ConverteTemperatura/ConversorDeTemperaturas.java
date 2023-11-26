package ConverteTemperatura;

public class ConversorDeTemperaturas {

	public static void main(String[] args) {
		EscalasTemperatura conversor = new EscalasTemperatura(30, 0, 0, 0, 0);
		conversor.fahrenheit();
		conversor.kelvin();
		conversor.reaumur();
		conversor.rankine();
		conversor.celsius();

	}

}
