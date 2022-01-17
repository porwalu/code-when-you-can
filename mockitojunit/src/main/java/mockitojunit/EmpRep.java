package mockitojunit;

public interface EmpRep {

	public void saveEmp(EmployeeModel e);
	public EmployeeModel getEmp(long id);
	public long getSalary(long id);

}
