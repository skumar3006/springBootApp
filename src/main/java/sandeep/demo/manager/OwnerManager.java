package sandeep.demo.manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Component;

import sandeep.demo.entity.Owner;
import sandeep.demo.entity.data.res.Person;
import sandeep.demo.model.ModelEntityMapper;
import sandeep.demo.model.OwnerBO;
import sandeep.demo.repository.OwnerRepository;

@Component
public class OwnerManager {

	@Autowired
	OwnerRepository ownerRepository;

	public OwnerBO createOwner(OwnerBO ownerBO) {
		Owner owner = ModelEntityMapper.convertToEntity(ownerBO);
		owner = ownerRepository.save(owner);
		return ModelEntityMapper.convertToBO(owner);
	}

	public List<OwnerBO> getAllRecords() {
		List<Owner> owners = (List<Owner>) ownerRepository.findAll();
		List<OwnerBO> list = new ArrayList<>();
		owners.forEach(owner -> list.add(ModelEntityMapper.convertToBO(owner)));
		return list;
	}

	public OwnerBO updateOwner(OwnerBO ownerBO) {
		Owner owner = ModelEntityMapper.convertToEntity(ownerBO);
		owner = ownerRepository.save(owner);
		return ModelEntityMapper.convertToBO(owner);
	}

	public OwnerBO getById(Integer ownerId) {
		Optional<Owner> owner = ownerRepository.findById(ownerId);
		return ModelEntityMapper.convertToBO(owner.get());
	}

	public void deleteById(Integer ownerId) {
		ownerRepository.deleteById(ownerId);
	}
	
	public List<OwnerBO> getByExample(String name){
		
		
		Owner owner = new Owner();
		owner.setFirstName(name);
		Example<Owner> example = Example.of(owner);
		List<Owner> results = ownerRepository.findAll(example);
		results.forEach(action-> {
			System.out.println("action "+action.getId());
		});
		List<OwnerBO> list = new ArrayList<>();
		results.forEach(o -> list.add(ModelEntityMapper.convertToBO(o)));
		return list;
		
	}

}
