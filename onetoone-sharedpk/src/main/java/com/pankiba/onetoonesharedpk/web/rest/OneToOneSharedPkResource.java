package com.pankiba.onetoonesharedpk.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pankiba.onetoonesharedpk.domain.Employee;
import com.pankiba.onetoonesharedpk.service.EmployeeService;

@RestController
public class OneToOneSharedPkResource {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/employees")
	public ResponseEntity<List<Employee>> getEmployees() {
		return new ResponseEntity<List<Employee>>(employeeService.findAllEmployees(), HttpStatus.OK);
	}

}
