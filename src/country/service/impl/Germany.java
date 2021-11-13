package country.service.impl;

import country.service.Country;

public class Germany implements Country {
	@Override
	public String greet() {
		return "Hallo !";
	}
}
