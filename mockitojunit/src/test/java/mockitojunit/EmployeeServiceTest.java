package mockitojunit;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeServiceTest {

	@Mock
	private EmpRepImpl empR;

	@InjectMocks
	private EmployeeService empS;

	@Test
	public void testGetEmployee() {
	//	when(empR.getEmp(101726)).thenReturn(new EmployeeModel(35, "Ramesh", "porwal", 101726L, "IT", "SPE", 100000L));
		empS.getEmployee(101726);
		//assertTrue("Should return utkarsh but returned " + empS.getEmployee(101726).getFName(),empS.getEmployee(101726).getFName().equalsIgnoreCase("utkarsh"));
		verify(empR).extractedFiltertedData(101726);

	}

}
