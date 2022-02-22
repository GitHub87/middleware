package middleware.app.entity.businessProfile;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import middleware.app.entity.shared.AddressEntity;

@Entity
@Table(name = "founder")
public class FounderEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long fid;
	private String fname;
	private String lname;
	private String phone;
	@Column(name = "emailid")
	private String emailId;
	private String photourl;
	@CreationTimestamp
	@Column(nullable = false, updatable = false)
	private Timestamp createddt;
	private char isactive;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "addressid", referencedColumnName = "addrid")
	private AddressEntity address;
	
	public FounderEntity() {
		
	}

	public FounderEntity(long fid, String fname, String lname, String phone, AddressEntity address, String emailId,
			String photourl, Timestamp createddt, char isactive) {
		super();
		this.fid = fid;
		this.fname = fname;
		this.lname = lname;
		this.phone = phone;
		this.address = address;
		this.emailId = emailId;
		this.photourl = photourl;
		this.createddt = createddt;
		this.isactive = isactive;
	}

	public long getFid() {
		return fid;
	}

	public void setFid(long fid) {
		this.fid = fid;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public AddressEntity getAddress() {
		return address;
	}

	public void setAddress(AddressEntity address) {
		this.address = address;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhotourl() {
		return photourl;
	}

	public void setPhotourl(String photourl) {
		this.photourl = photourl;
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
	
	
	
	

}
