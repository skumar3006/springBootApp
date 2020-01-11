package sandeep.demo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "OWNER")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Owner implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Column(name = "FIRST_NAME")
	private String firstName;
	
	@Column(name = "LAST_NAME")
	private String lastName;
	
	@Column(name = "PHONE1")
	private String phone1;
	
	@Column(name = "PHONE2")
	private String phone2;
	
	@Column(name = "DOB")
	private Date dob;
	
	@OneToOne(mappedBy = "owner", fetch= FetchType.LAZY)
	private Address address;
	
}
