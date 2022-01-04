package country.dao;

import country.model.Country;

public interface CountryDAO {
	
	Country getByCode(String code);
	void addNewCountry(Country country);
	
}
;