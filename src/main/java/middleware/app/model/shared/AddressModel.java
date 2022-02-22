package middleware.app.model.shared;

public class AddressModel {
	
	private String street1;
	private String street2;
	private String state;
	private String city;
	private String zip;
	private char addressType;
	
	public AddressModel() {
		
	}

	public AddressModel(String street1, String street2, String state, String city, String zip, char addressType) {
		super();
		this.street1 = street1;
		this.street2 = street2;
		this.state = state;
		this.city = city;
		this.zip = zip;
		this.addressType = addressType;
	}

	public String getStreet1() {
		return street1;
	}

	public void setStreet1(String street1) {
		this.street1 = street1;
	}

	public String getStreet2() {
		return street2;
	}

	public void setStreet2(String street2) {
		this.street2 = street2;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public char getAddressType() {
		return addressType;
	}

	public void setAddressType(char addressType) {
		this.addressType = addressType;
	}
	
	
	
	

}
