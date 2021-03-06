package element;

public class TransportationRent extends Rent {

	public TransportationRent(int baseRent) {
		super(baseRent);
	}
	
	public int getRent(int transportationAmount) {
		return getBaseRent() * transportationAmount;
	}

}
