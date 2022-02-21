package com.cg.eis.exam4;

	public class EmployeeServiceImpl implements EmployeeService{

		public Employee getDetails(int empId) {
			EmployeeDao emp=new EmployeeDao();
			return emp.getDetails(empId);
		}
	 
	}
