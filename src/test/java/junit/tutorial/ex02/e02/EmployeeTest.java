package junit.tutorial.ex02.e02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.InputStream;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		InputStream input = getClass().getResourceAsStream("Employee.txt");
		List<Employee> empList = Employee.load(input);
		Employee emp = empList.get(0);//この０はリストのこと（従業員NO）
		
		assertEquals("Ichiro", emp.getFirstName(), "エラーが発生しました");

		assertEquals("Tanaka", emp.getLastName(), "エラーが発生しました");

		assertEquals("ichiro@example.com", emp.getEmail(), "エラーが発生しました");

	}

}
