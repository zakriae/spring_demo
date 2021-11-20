package country.service.impl;

import country.service.Country;

public class Spain implements Country {
	
	@Override
	public String greet() {
		return "Hola ! ";
	}
	
	
	public static Spain getInstance() {
		return new Spain();
	}
}
