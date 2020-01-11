package sandeep.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author -- Sandeep kumar vishwakarma
 *
 */

@Entity
@Table(name = "TEACHER")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private int id;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "PICTURE_URL")
	private String pictureURL;
	
	@Column(name = "EMAIL")
	private String email;
	
}