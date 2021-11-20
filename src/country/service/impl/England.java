package country.service.impl;

import country.service.Country;


public class England implements Country {
	
	@Override
	public String greet() {
		return "Hello World";
	}
}
