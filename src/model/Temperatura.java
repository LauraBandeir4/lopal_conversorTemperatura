package model;

public class Temperatura {

	private double celcius;

	// Setters e Getters
	public double getCelcius() {
		return celcius;
	}

	public void setCelcius(double celcius) {
		this.celcius = celcius;
	}
	
    //Método Kelvin
	public double converterParaKelvin() {
		double kelvin = celcius + 273;
		return kelvin;
	}

	// Método Fahreinheit
	public double converterParaFahreinheit() {
		double fahreinheit = (celcius * 1.8) + 32;
		return fahreinheit;
	}

}
