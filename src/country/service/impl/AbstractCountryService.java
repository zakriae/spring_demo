package country.service.impl;

import country.dao.DataAccess;

import org.springframework.beans.factory.annotation.Autowired;

import country.service.ICountryService;


public abstract class AbstractCountryService implements ICountryService {
	@Autowired
	DataAccess dataAccess;
	public String welcome() {
		dataAccess.getCountryByCode();
		return getCountry().greet();
	}
	
	@Override
	public String devise() {
		return getCountry().devise();
	}
	
	public abstract Country getCountry();// c'est quoi ton pays ?
}
