package sandeep.demo.entity.data;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import sandeep.demo.entity.Owner;
import sandeep.demo.entity.data.res.Person;
/**
 * 
 * @author Sandeep Kumar Vishwakarm
 * Repository to test spring data rest
 * api/persons
 *
 */

@RepositoryRestResource(collectionResourceRel = "persons", path = "persons")
public interface PersonRepository extends PagingAndSortingRepository<Person, Integer> {

	public interface UserRepository extends PagingAndSortingRepository<Person, Integer> {
		List<Owner> findByName(@Param("firstName") String name);
	}

}
