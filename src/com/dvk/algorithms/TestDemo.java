package com.dvk.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestDemo {

	String str;
	int i;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(str+"**********"+i);
		List<Employee> emps = new ArrayList<>();
		Employee e1 = new Employee("abc",55.0f);
		Employee e2 = new Employee("abc",55.0f);
		emps.add(e1);
		emps.add(e2);
		Set<Employee> empset = emps.stream().collect(Collectors.toSet());
				
				empset.stream().forEach(e -> System.out.println("@@@@@"+e.name));
			

	}
	
	

}

class Employee {
	
			String name;
			float salary;
			
			public Employee( String name, float sal){
				
				this.name=name;this.salary=sal;
			}

			/**
			 * @return the name
			 */
			public String getName() {
				return name;
			}

			/**
			 * @param name the name to set
			 */
			public void setName(String name) {
				this.name = name;
			}

			/**
			 * @return the salary
			 */
			public float getSalary() {
				return salary;
			}

			/**
			 * @param salary the salary to set
			 */
			public void setSalary(float salary) {
				this.salary = salary;
			}
			
			
}
