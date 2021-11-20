package country.service.impl;

import country.service.Country;
import org.springframework.stereotype.Component;

@Component("france")
public class France implements Country {
	
	@Override
	public String greet() {
		return "Bonjour ! ";
	}
	
}
