package country.model;

public class France extends AbstractEuroCountry {
	
	@Override
	public String greet() {
		return "Bonjour ! ";
	}
	
	@Override
	public String getCode() {
		return "fr";
	}
	
}
