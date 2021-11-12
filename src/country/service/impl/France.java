package country.service.impl;

import country.service.Country;

public class France implements Country {
	
	@Override
	public String greet() {
		return "Bonjour ! ";
	}
}
