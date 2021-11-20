package country.service.impl;

import country.FrenchCountryServiceImpl;
import country.ICountryService;


public class SpainServiceFactory {
	
	public ICountryService getInstance() {
		return new FrenchCountryServiceImpl();
	}
	
	public ICountryService getInstanceForFrance() {
		return new FrenchCountryServiceImpl();
	}
	
}
