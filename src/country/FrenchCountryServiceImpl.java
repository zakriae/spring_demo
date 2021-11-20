package country;

import country.service.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("frenchCountryService")
public class FrenchCountryServiceImpl extends AbstractCountryService {
	@Autowired
	@Qualifier("france")
	private Country france;
	
	@Override
	public Country getCountry() {
		return france;
	}
	
	
}
