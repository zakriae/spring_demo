package country.service.impl;

import country.dao.ContinentDAO;
import country.dao.CountryDAO;
import country.model.Continent;
import country.model.Country;
import country.service.ICountryService;
import country.service.IServiceWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class ServiceWorkerImpl implements IServiceWorker {
	@Autowired
	private CountryDAO countryDAO;
	@Autowired
	private ContinentDAO continentDAO;
	@Autowired
	private ApplicationContext applicationContext;
	
	@Override
	public void dealWithCountryByCode(String language) {

		Country pays = countryDAO.getByCode(language);

		// car c'est prototype
		ICountryService countryService = applicationContext.getBean(ICountryService.class, pays);
		
		System.out.println("WELCOME : " + countryService.welcome());
		System.out.println("Devise is :" + countryService.devise());
	}

	@Override
	public void addNewCountry(String data) {

		Country country = new Country();
		Continent continent = new Continent();

		 String [] dataArr = data.split(",");




		country.setCode(dataArr[0]);
		country.setName(dataArr[1]);
		country.setDevise(dataArr[2]);
		country.setGreetings(dataArr[3]);



		continent=continentDAO.getContient(dataArr[4]);
		country.setContinent(continent);
		countryDAO.addNewCountry(country);

	}
}
