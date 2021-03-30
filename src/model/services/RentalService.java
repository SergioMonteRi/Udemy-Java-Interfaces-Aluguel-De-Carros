package model.services;

import model.entities.CarRental;

public class RentalService {

	private Double pricePerDay;
	private Double pricePerHouer;
	
	private BrazilTaxService taxService;

	public RentalService(Double pricePerDay, Double pricePerHouer, BrazilTaxService taxService) {
		super();
		this.pricePerDay = pricePerDay;
		this.pricePerHouer = pricePerHouer;
		this.taxService = taxService;
	}
	
	public void processInvoice(CarRental carRental) {
		
	}
}
