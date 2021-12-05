package country;

import country.dao.DataAccess;
import country.service.Country;
import org.springframework.beans.factory.annotation.Autowired;


public abstract class AbstractCountryService implements ICountryService {
	@Autowired
	DataAccess dataAccess;
	public String welcome() {
		dataAccess.getCountryByCode();
		return getCountry().greet();
	}
	
	public abstract Country getCountry();// c'est quoi ton pays ?
}
