package sandeep.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sandeep.demo.entity.Owner;
import sandeep.demo.manager.OwnerManager;

@RestController
@RequestMapping("/owners")
public class OwnerController {

	@Autowired
	OwnerManager ownerManager;

	@GetMapping
	public ResponseEntity<List<Owner>> getAllRecords() {
		List<Owner> list = ownerManager.getAllRecords();

		return new ResponseEntity<List<Owner>>(list, new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping(value = "/{ownerId}")
	public Optional<Owner> getById(@PathVariable Integer ownerId) {
		Optional<Owner> owner = ownerManager.getById(ownerId);
		return owner;
	}

	@PostMapping
	public ResponseEntity<Owner> createOrUpdateEmployee(@RequestBody Owner owner) {
		Owner response = ownerManager.createOwner(owner);
		return new ResponseEntity<Owner>(response, new HttpHeaders(), HttpStatus.OK);
	}

	@PutMapping(value = "{/ownerId}")
	public ResponseEntity<Owner> update(Owner owner) {
		Owner response = ownerManager.updateOwner(owner);
		return new ResponseEntity<Owner>(response, new HttpHeaders(), HttpStatus.OK);
	}

}
