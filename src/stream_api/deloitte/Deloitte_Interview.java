/*
empList.add(new Employee(1,500));
empList.add(new Employee(2,500));
empList.add(new Employee(3,500));
empList.add(new Employee(4,500));
empList.add(new Employee(5,500));
empList.add(new Employee(6,500));
empList.add(new Employee(7,500));

1) Given an Employee list, sort employees based on their salaries in desc order ?
2) Fetch top 3 salaried employees details ?
3) Fetch all employees having salary less than 3rd highest salary ?

1) Find sum of all elements in an array using java 8 ?    : {2,3,4,5,7}
*/


package stream_api.deloitte;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Deloitte_Interview {

	public static void main(String[] args) {
		
		List<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(1,500));
		empList.add(new Employee(2,1000));
		empList.add(new Employee(3,1500));
		empList.add(new Employee(4,2000));
		empList.add(new Employee(5,2500));
		empList.add(new Employee(6,3000));
		empList.add(new Employee(7,3500));
		
		List<Employee> empSortedList = empList.stream().sorted((o1,o2)->(int)(o2.getSalary()-o1.getSalary())).collect(Collectors.toList());
		System.out.println(empSortedList);
		
		List<Employee> empTop3List = 
				                   empList.stream()
				                   .sorted((o1,o2)->(int)(o2.getSalary()-o1.getSalary()))
				                   .limit(3)
				                   .collect(Collectors.toList());
		System.out.println(empTop3List);
		
		

		List<Employee> empLess3Salary = 
				                   empList.stream()
				                   .sorted((o1,o2)->(int)(o2.getSalary()-o1.getSalary()))
				                   .skip(3)
				                   .collect(Collectors.toList());
		System.out.println(empLess3Salary);
		
	}
}

