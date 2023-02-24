package in.prakash.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="student")
@Data
public class StudentEntity {
	@Id
	@GeneratedValue
	private Integer stdId;
	private String stdFname;
	private String stdLname;

}
