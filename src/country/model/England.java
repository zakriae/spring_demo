package country.model;


public class England implements Country {
	
	@Override
	public String greet() {
		return "Hello World";
	}
	
	@Override
	public String devise() {
		return "gbp";
	}
	
	@Override
	public String getCode() {
		return "en";
	}
}
