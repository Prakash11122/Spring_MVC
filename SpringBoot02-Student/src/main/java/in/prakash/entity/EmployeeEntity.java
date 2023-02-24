package in.prakash.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class EmployeeEntity {
	
	private Integer empId;
	private String empFname;
	private String lastName;
	private Double empsal;
	private String empAdd;

}
