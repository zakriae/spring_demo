package country.dao;

import country.model.Country;

import java.util.List;

public interface CountryDAO {

	Country getByCode(String code);

	void addNewCountry(Country country);

	void deleteCountry(Country country);

	void updateCountry(Country country);

	List<Country> getCountries(String code);
}
