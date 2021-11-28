package country.model;


public class Spain extends AbstractEuroCountry {
	
	@Override
	public String greet() {
		return "Hola ! ";
	}
	
	@Override
	public String getCode() {
		return "es";
	}
	
}
