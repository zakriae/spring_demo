package country.dao;

import country.model.Country;

public interface PaysParCodeDAO {
	Country getByCode(String code);
}
