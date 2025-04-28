package model;

public class Temperatura {

	private double celsius;

	// Setters e Getters
	public double getCelsius() {
		return celsius;
	}

	public void setCelcius(double celsius) {
		this.celsius = celsius;
	}

	// Método Kelvin
	public double converterParaKelvin() {
		double kelvin = celsius + 273;
		return kelvin;
	}

	// Método Fahreinheit
	public double converterParaFahreinheit() {
		double fahreinheit = (celsius * 1.8) + 32;
		return fahreinheit;
	}

}
