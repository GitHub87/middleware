package middleware.app.services;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import middleware.app.entity.businessProfile.FounderEntity;
import middleware.app.entity.shared.AddressEntity;
import middleware.app.model.shared.AddressModel;
import middleware.app.model.shared.FounderModel;
import middleware.app.repo.businessProfile.FoundersRepo;
import middleware.app.repo.businessProfile.InvestorsRepo;
import middleware.app.repo.shared.AddressRepo;

@Service
public class BusinessProfileService {
	
	@Autowired
	FoundersRepo founderRepo;
	@Autowired
	InvestorsRepo investorsRepo;
//	@Autowired
//	AddressRepo addressRepo;
	
	
	public BusinessProfileService() {
		
	}
	
	public void saveFounder(FounderModel model) {
		FounderEntity entity = setAttributesToEntity(model);
		founderRepo.save(entity);
	}
	
	public FounderModel getFounderById(long fid) {
		FounderEntity entity = founderRepo.findById(fid).get();
		return setAttributesToModel(entity);
	}
	
//	public Iterable<InvestorsEntity> getInvestorList(int businessId) {
//		return investorsRepo.findByBId(businessId);
//	}
	
	private FounderModel setAttributesToModel(FounderEntity entity) {
		if(entity == null) throw new NoSuchElementException("No founder found in the database.");
		
		FounderModel model = new FounderModel();
		model.setFid(entity.getFid());
		model.setFirstName(entity.getFname());
		model.setLastName(entity.getLname());
		model.setEmailAddr(entity.getEmailId());
		model.setPhoneNum(entity.getPhone());
		model.setPhotourl(entity.getPhotourl());
		//model.setAddress(entity.getAddress());
		
		AddressEntity addrEntity = entity.getAddress();
		AddressModel addrModel = new AddressModel();
		addrModel.setCity(addrEntity.getCity());
		addrModel.setAddressType(addrEntity.getAddressType());
		addrModel.setState(addrEntity.getState());
		addrModel.setStreet1(addrEntity.getStreet1());
		addrModel.setStreet2(addrEntity.getStreet2());
		addrModel.setZip(addrEntity.getZip());
		
		model.setAddress(addrModel);
		
		return model;
	}
	
	private FounderEntity setAttributesToEntity(FounderModel model) {
		
		AddressModel addrModel = model.getAddress();
		AddressEntity addrEntity = new AddressEntity();
		addrEntity.setAddressType('F');
		addrEntity.setCity(addrModel.getCity());
		addrEntity.setState(addrModel.getState());
		addrEntity.setStreet1(addrModel.getStreet1());
		addrEntity.setStreet2(addrModel.getStreet2());
		addrEntity.setZip(addrModel.getZip());
		
		FounderEntity entity = new FounderEntity();
		entity.setFname(model.getFirstName());
		entity.setLname(model.getLastName());
		entity.setEmailId(model.getEmailAddr());
		entity.setIsactive('Y');
		entity.setPhone(model.getPhoneNum());
		
		entity.setAddress(addrEntity);
		
		return entity;
	}
	
	
	

}
