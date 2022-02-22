package middleware.app.repo.shared;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import middleware.app.entity.shared.AddressEntity;

@Repository
public interface AddressRepo extends CrudRepository<AddressEntity, Long> {

}
