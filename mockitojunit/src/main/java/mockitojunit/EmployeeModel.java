package mockitojunit;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmployeeModel {

	private int age;
	private String fName;
	private String lName;
	private long empId;
	private String department;
	private String designation;
	private long salary;
	
}
