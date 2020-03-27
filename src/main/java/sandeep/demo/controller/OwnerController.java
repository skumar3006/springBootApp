package sandeep.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sandeep.demo.manager.OwnerManager;
import sandeep.demo.model.OwnerBO;

@RestController
@RequestMapping("/owners")
public class OwnerController {

	@Autowired
	OwnerManager ownerManager;

	@GetMapping
	public List<OwnerBO> getAllRecords() {
		List<OwnerBO> list = ownerManager.getAllRecords();
		return list;
	}

	@GetMapping(value = "/{ownerId}")
	public OwnerBO getById(@PathVariable Integer ownerId) {
		OwnerBO owner = ownerManager.getById(ownerId);
		return owner;
	}

	@PostMapping
	public OwnerBO createOrUpdateEmployee(@RequestBody OwnerBO owner) {
		OwnerBO ownerBO = ownerManager.createOwner(owner);
		return ownerBO;
	}

	@PutMapping(value = "{/ownerId}")
	public OwnerBO update(@RequestBody OwnerBO owner) {
		OwnerBO ownerBO = ownerManager.updateOwner(owner);
		return ownerBO;
	}
	
	@DeleteMapping(value = "/{ownerId}")
	public HttpStatus deleteById(@PathVariable Integer ownerId) {
		 ownerManager.deleteById(ownerId);
		return HttpStatus.ACCEPTED;
	}

	@GetMapping(value = "/name/{firstName}")
	public List<OwnerBO> byExample(@PathVariable String firstName) {
		List<OwnerBO> owners = ownerManager.getByExample(firstName);
		return owners;
	}

}
