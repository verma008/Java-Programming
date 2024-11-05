package stream_api.TCS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
1) Get Details of Highest Paid Employee using java 8?
2) List of Employee who joined after 2014 using java 8 ?
3) Replace all the occurrences of the given character from the given String ?

new Employee(1,"Archana",50000,"SE","female",2014),
new Employee(2,"Abhinav",100000,"UPSC","male",2019),
new Employee(3,"Aman",100000,"G","male",2017),
new Employee(4,"Arpit",51000,"S","male",2014)

*/


public class TCSInterview {
	
	public static void main(String[] args) {
		
		List<Employee> empList=Arrays.asList(new Employee(24,"Archana",50000,"SE","female",2014),
        new Employee(25,"Abhinav",9000,"UPSC","male",2019),
        new Employee(21,"Aman",100000,"G","male",2017),
        new Employee(14,"Arpit",51000,"S","male",2014));
		
		List<Employee> list = empList.stream().sorted((o1,o2)->(o2.getSalary()-o1.getSalary())).limit(1).collect(Collectors.toList());
		System.out.println(list);
		
		System.out.println("Get details of Highest Paid Employee");
		String nameOfHighestPaid = empList.stream().
				collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)))
				.get().getName();
		System.out.println(nameOfHighestPaid);
		
       System.out.println("List of Employee who joined  after 2014");
   	   List<Employee> empjoindafter2014 = empList.stream().filter(emp->emp.getYearOfJoining()>2014).collect(Collectors.toList());
	   System.out.println(empjoindafter2014);
	
	}

}
