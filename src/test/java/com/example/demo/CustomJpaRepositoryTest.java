package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.NONE)
public class CustomJpaRepositoryTest {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	public void testFindOneReturnsValue() {
		System.out.println(employeeRepository.findAll().size());
		Employee employee = employeeRepository.findOne(1);
		assertNotNull(employee);
		assertEquals(1, employee.getId().intValue());
	}

	@Test
	public void testFindOneReturnssfd() {
		Employee employee = employeeRepository.findOne(5);

		assertNull(employee);

	}

}
