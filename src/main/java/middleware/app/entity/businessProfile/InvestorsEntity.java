package middleware.app.entity.businessProfile;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "investors")
public class InvestorsEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long iid;
	private String fname;
	private String lname;
	private String organisation;
	private String email;
	private String phone;
	private int portfolioid;
	private Timestamp createddt;
	private char isactive;
	private String iphotourl;
	
	public InvestorsEntity() {
		
	}

	public InvestorsEntity(long iid, String fname, String lname, String organisation, String email, String phone,
			int portfolioid, Timestamp createddt, char isactive, String iphotourl) {
		super();
		this.iid = iid;
		this.fname = fname;
		this.lname = lname;
		this.organisation = organisation;
		this.email = email;
		this.phone = phone;
		this.portfolioid = portfolioid;
		this.createddt = createddt;
		this.isactive = isactive;
		this.iphotourl = iphotourl;
	}

	public long getIid() {
		return iid;
	}

	public void setIid(long iid) {
		this.iid = iid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getOrganisation() {
		return organisation;
	}

	public void setOrganisation(String organisation) {
		this.organisation = organisation;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getPortfolioid() {
		return portfolioid;
	}

	public void setPortfolioid(int portfolioid) {
		this.portfolioid = portfolioid;
	}

	public Timestamp getCreateddt() {
		return createddt;
	}

	public void setCreateddt(Timestamp createddt) {
		this.createddt = createddt;
	}

	public char getIsactive() {
		return isactive;
	}

	public void setIsactive(char isactive) {
		this.isactive = isactive;
	}

	public String getIphotourl() {
		return iphotourl;
	}

	public void setIphotourl(String iphotourl) {
		this.iphotourl = iphotourl;
	}
	
	
	
	

}
