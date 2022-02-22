package middleware.app.repo.businessProfile;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import middleware.app.entity.businessProfile.InvestorsEntity;

@Repository
public interface InvestorsRepo extends CrudRepository<InvestorsEntity, Long> {
	
//	@Query("select i from InvestorsEntity i where i.businessId = :id")
//	public List<InvestorsEntity> findByBId(@Param("id") int id);
	

}
