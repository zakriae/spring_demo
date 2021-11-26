package country;

import country.service.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("englandCountryService")

public class EnglandCountryServiceImpl extends AbstractCountryService {
	@Autowired
	@Qualifier("england")
	private Country unknown;
	
	@Override
	public Country getCountry() {
		return unknown;
	}
	
	
}
