package country.service.impl;

import country.service.Country;

@Pays
public class Spain implements Country {
	
	@Override
	public String greet() {
		return "Hola ! ";
	}
	
}
