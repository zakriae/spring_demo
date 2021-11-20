package country;

import country.service.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("spainCountryService")

public class SpainCountryServiceImpl extends AbstractCountryService {
	@Autowired
	private Country spain;
	
	@Override
	public Country getCountry() {
		return spain;
	}
	
	
}
