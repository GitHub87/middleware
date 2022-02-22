package middleware.app.repo.businessProfile;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import middleware.app.entity.businessProfile.FounderEntity;

@Repository
public interface FoundersRepo extends CrudRepository<FounderEntity, Long>{

}
