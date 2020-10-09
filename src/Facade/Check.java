package Facade;

import Facade.CarsAvailable;


public class Check {
	private CarsAvailable carsAvailable;
	
	public Check() {
		carsAvailable = new CarsAvailable();
		
		
	}
	
	public void searching(String num_placa, String Marca, int modelo) {
		carsAvailable.searchCars(num_placa, Marca, modelo);
	}

}
