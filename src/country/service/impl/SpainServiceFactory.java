package country.service.impl;

import country.CountryService;

public class SpainServiceFactory {
	
	public  CountryService getInstance() {
		return new CountryService();
	}
	
	public  CountryService getInstanceForFrance() {
		return new CountryService();
	}
	
}
