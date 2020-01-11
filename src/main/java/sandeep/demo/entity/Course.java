package sandeep.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "COURSE")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private int id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "WORK_LOAD")
	private int workload;

	@Column(name = "RATE")
	private short rate;

	@ManyToOne
	@JoinColumn(foreignKey = @ForeignKey(name = "fk_course_teacher"))
	private Teacher teacher;

}