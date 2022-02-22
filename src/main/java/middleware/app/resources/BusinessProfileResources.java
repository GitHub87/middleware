package middleware.app.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import middleware.app.entity.businessProfile.InvestorsEntity;
import middleware.app.model.shared.FounderModel;
import middleware.app.services.BusinessProfileService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BusinessProfileResources {
	
	@Autowired
	private BusinessProfileService businessProfileService;
	
//	@GetMapping("/bp/getInvestorListAsQuickLinks")
//	public Iterable<InvestorsEntity> findAllInvestorQuickLinks(@RequestParam int businessId){
//		return businessProfileService.getInvestorList(businessId);
//	}
	
	@GetMapping("/bp/businessProfileFounder")
	public FounderModel findFounder(@RequestParam int founderId) {
		return businessProfileService.getFounderById(founderId);
	}
	
	@PostMapping("/registration/founder")
	public void saveFounderProfile(@RequestBody FounderModel model) {
		businessProfileService.saveFounder(model);
	}

}
