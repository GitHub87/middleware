package middleware.app.model.shared;


public class FounderModel {
	
	private long fid;
	private String firstName;
	private String lastName;
	private String phoneNum;
	private AddressModel address;
	private String emailAddr;
	private String photourl;
	
	public FounderModel() { 
		
	}

	public long getFid() {
		return fid;
	}

	public void setFid(long fid) {
		this.fid = fid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public AddressModel getAddress() {
		return address;
	}

	public void setAddress(AddressModel address) {
		this.address = address;
	}

	public String getEmailAddr() {
		return emailAddr;
	}

	public void setEmailAddr(String emailAddr) {
		this.emailAddr = emailAddr;
	}

	public String getPhotourl() {
		return photourl;
	}

	public void setPhotourl(String photourl) {
		this.photourl = photourl;
	}

	public FounderModel(long fid, String firstName, String lastName, String phoneNum, AddressModel address,
			String emailAddr, String photourl) {
		super();
		this.fid = fid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNum = phoneNum;
		this.address = address;
		this.emailAddr = emailAddr;
		this.photourl = photourl;
	}	
	
	
	
	

}
