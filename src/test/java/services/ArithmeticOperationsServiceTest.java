package services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class ArithmeticOperationsServiceTest {

	@Test
	void whenEmptyListUsedThenReturnZero() {
		List<Integer> emptyList = new ArrayList<Integer>(); 
		ArithmeticOperationsService service = new ArithmeticOperationsServiceImpl();
		int result = service.sum(emptyList);
		assertEquals(0, result, "Test of empty List sum is empty");
		
	}


	@Test
//	@Disabled
	void whenNonEmptuListUsedThenReturnTheCorrectSum() {
		List<Integer> list = Arrays.asList(1,1,1,1,1,1,1,1,1,1);
		int expectedSum = 10;
		ArithmeticOperationsService service = new ArithmeticOperationsServiceImpl();
		int result = service.sum(list);
		assertEquals(expectedSum, result, "Sum of Non-Empty list failed");
		
	}

}
