package sandeep.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressBO {

	private int id;
	private String city;
	private String street;
	private String zip;
	private String state;
	private String county;

}
