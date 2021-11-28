package country.model;

public abstract class AbstractEuroCountry implements Country {
	@Override
	public String devise() {
		return "euro";
	}
}
