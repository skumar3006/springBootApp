package sandeep.demo.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OwnerBO {

	private int id;
	private String firstName;
	private String lastName;
	private String phone1;
	private String phone2;
	private Date dob;

}
