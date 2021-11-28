package country.service.impl;

import country.model.Country;
import country.service.ICountryService;


public abstract class AbstractCountryService implements ICountryService {
	
	public String welcome() {
		return getCountry().greet();
	}
	
	@Override
	public String devise() {
		return getCountry().devise();
	}
	
	public abstract Country getCountry();// c'est quoi ton pays ?
}
