package country.dao;

import country.model.Country;
import country.model.England;
import country.model.France;
import country.model.Germany;
import country.model.Spain;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.LinkedHashMap;
import java.util.Map;

@Repository
public class PaysParCodeDAOImpl implements PaysParCodeDAO {
	private Map<String, Country> countriesMap = new LinkedHashMap<>();
	
	public PaysParCodeDAOImpl() {
	
	}
	
	@PostConstruct
	public void init() {
		countriesMap.put("fr", new France());
		countriesMap.put("es", new Spain());
		countriesMap.put("en", new England());
		countriesMap.put("de", new Germany());
	}
	
	@Override
	public Country getByCode(String code) {
		// juste un mock du fait que cela va être récupéré depuis la couche DAO
		return countriesMap.get(code);
		
	}
}
