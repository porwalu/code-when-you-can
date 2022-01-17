package mockitojunit;

public class EmployeeService {

	private EmpRep empR;

	public EmployeeService() {
		empR = new EmpRepImpl();
	}

	public EmployeeModel getEmployee(long id) {
		return empR.getEmp(id);
	}

	public long getSalary(long id) {
//		EmployeeModel emp = getEmployee(id);
//		System.out.println("Salary of " + emp.getFName() + " is " +emp.getSalary());
		return empR.getSalary(id);
	}

}
