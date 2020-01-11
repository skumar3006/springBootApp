package sandeep.demo.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarBO {

	private int id;
	private String carName;
	private String registrationNumber;
	private Date modelYear;
	private String city;
	private String state;
	private short price;
	
}
