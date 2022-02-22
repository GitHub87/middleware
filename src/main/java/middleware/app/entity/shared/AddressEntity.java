package middleware.app.entity.shared;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import middleware.app.entity.businessProfile.FounderEntity;

@Entity
@Table(name = "address")
public class AddressEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int addrid;
	private String street1;
	private String street2;
	private String state;
	private String city;
	private String zip;
	@Column(name = "addresstype")
	private char addressType; // F for founder, I for Investor etc for now.
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "address")
	private FounderEntity founder;
	
	public AddressEntity() {
		
	}

	public AddressEntity(int addrid, String street1, String street2, String state, String city, String zip, char addressType) {
		super();
		this.addrid = addrid;
		this.street1 = street1;
		this.street2 = street2;
		this.state = state;
		this.city = city;
		this.zip = zip;
		this.addressType = addressType;
	}

	public int getAddrid() {
		return addrid;
	}

	public void setAddrid(int addrid) {
		this.addrid = addrid;
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

	public FounderEntity getFounder() {
		return founder;
	}

	public void setFounder(FounderEntity founder) {
		this.founder = founder;
	}
	
	
	
}
