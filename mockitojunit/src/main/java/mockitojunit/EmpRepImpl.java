package mockitojunit;

import java.util.Arrays;
import java.util.List;

public class EmpRepImpl implements EmpRep {
	static List<EmployeeModel> list;
	static {
		list = Arrays.asList(
				new EmployeeModel(35, "utkarsh", "porwal", 101726L, "IT", "SPE", 100000L),
				new EmployeeModel(35, "Priyank", "Rai", 101729L, "IT", "SSE", 75000L));
	}

	public void saveEmp(EmployeeModel e) {
		list.add(e);

	}

	public EmployeeModel getEmp(long id) {
		// TODO Auto-generated method stub
		if(id == 100) return null;
		else  return  extractedFiltertedData(id);
	}

	public EmployeeModel extractedFiltertedData(long id) {
		return list.stream().filter(emp->emp.getEmpId()==id).findFirst().orElse(null);
	}

	public long getSalary(long id) {
		//return  list.stream().filter(emp->emp.getEmpId()==id).findAny().orElse(null).getSalary();
	return 750000L;

	}

}
