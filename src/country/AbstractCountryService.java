package country;

import country.service.Country;


public abstract class AbstractCountryService implements ICountryService {
	
	public String welcome() {
		return getCountry().greet();
	}
	
	public abstract Country getCountry();
}
