package sandeep.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import sandeep.demo.entity.Owner;

public interface OwnerRepository extends JpaRepository<Owner, Integer>, JpaSpecificationExecutor<Owner>{

}
