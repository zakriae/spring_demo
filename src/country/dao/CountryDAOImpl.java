package country.dao;

import country.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.LinkedHashMap;
import java.util.Map;

@Repository
public class PaysParCodeDAOImpl implements PaysParCodeDAO {
	@Autowired
	DataAccess dataAccess;
	
	@Override
	public Country getByCode(String code) {
		return dataAccess.getCountryByCode(code);
	}
}
