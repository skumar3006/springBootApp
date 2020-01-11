package sandeep.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ADDRESS")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Column(name = "CITY")
	private String city;

	@Column(name = "STREET")
	private String street;

	@Column(name = "ZIP")
	private String zip;

	@Column(name = "STATE")
	private String state;

	@Column(name = "COUNTRY")
	private String county;

	@OneToOne
	@JoinColumn(name="owner_id", foreignKey = @ForeignKey(name = "fk_address_owner_id"))
	private Owner owner;
}
