package sandeep.demo.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import sandeep.demo.entity.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Integer>, JpaSpecificationExecutor<Owner>{

}
