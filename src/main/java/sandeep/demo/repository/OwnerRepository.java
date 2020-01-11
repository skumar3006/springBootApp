package sandeep.demo.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import sandeep.demo.entity.Owner;

@RepositoryRestResource(collectionResourceRel = "owners", path = "owners")
public interface OwnerRepository extends PagingAndSortingRepository<Owner, Long> {

	public interface UserRepository extends PagingAndSortingRepository<Owner, Long> {
		List<Owner> findByName(@Param("name") String name);
	}

}
