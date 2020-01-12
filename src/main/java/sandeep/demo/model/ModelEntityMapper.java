package sandeep.demo.model;

import org.modelmapper.ModelMapper;

import sandeep.demo.entity.Owner;

public class ModelEntityMapper {

	public static OwnerBO convertToBO(Owner owner) {

		ModelMapper modelMapper = new ModelMapper();
		OwnerBO ownerBO = modelMapper.map(owner, OwnerBO.class);
		return ownerBO;

	}

	public static Owner convertToEntity(OwnerBO ownerBO) {
		ModelMapper modelMapper = new ModelMapper();
		Owner owner = modelMapper.map(ownerBO, Owner.class);
		return owner;

	}

}
