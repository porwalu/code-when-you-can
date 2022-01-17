package mockitojunit;

public class EmployeeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeService empService = new EmployeeService();
		System.out.println("Employee details : " + empService.getEmployee(101726));
		System.out.println("Salary is " + empService.getSalary(101716));

	}

}
