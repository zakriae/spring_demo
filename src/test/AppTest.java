package test;

import appConfig.PersistentAppConfig;
import country.dao.CountryDAO;
import country.model.Continent;
import country.model.Country;

import org.junit.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertEquals;


public class AppTest {


    ApplicationContext applicationContext =
            new AnnotationConfigApplicationContext(PersistentAppConfig.class);
    CountryDAO countryDAO = applicationContext.getBean(CountryDAO.class);

    @Test
    public void testAspectFunctionalOne() {

        Continent continent = new Continent("Europe","eur");
        Country  country=  new Country("france","fr","EUR","SALAM",continent);


        countryDAO.addNewCountry(country);

        Country actualCountry = countryDAO.getByCode("fr");
         System.out.println(actualCountry.getCode());
        assertEquals(country.getCode(),actualCountry.getCode());

        assertEquals(country.getName(),actualCountry.getName());
        assertEquals(country.getDevise(),actualCountry.getDevise());
        assertEquals(country.getGreetings(),actualCountry.getGreetings());
      assertEquals(country.getContinent().getCode(),actualCountry.getContinent().getCode());
       assertEquals(country.getContinent().getName(),actualCountry.getContinent().getName());

    }



}
