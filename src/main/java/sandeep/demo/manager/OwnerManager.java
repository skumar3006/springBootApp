package sandeep.demo.manager;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sandeep.demo.entity.Owner;
import sandeep.demo.repository.OwnerRepository;

@Component
public class OwnerManager {

	@Autowired
	OwnerRepository ownerRepository;

	public Owner createOwner(Owner owner) {
		ownerRepository.save(owner);
		return owner;
	}

	public List<Owner> getAllRecords() {
		return (List<Owner>) ownerRepository.findAll();
	}

	public Owner updateOwner(Owner owner) {
		ownerRepository.save(owner);
		return owner;
	}

	public Optional<Owner> getById(Integer ownerId) {
		return ownerRepository.findById(ownerId);
	}

}
