package country.model;

public class Germany extends AbstractEuroCountry {
	@Override
	public String greet() {
		return "Hallo !";
	}
	
	@Override
	public String getCode() {
		return "de";
	}
	
}
