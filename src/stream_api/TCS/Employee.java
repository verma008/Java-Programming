package stream_api.TCS;

public class Employee {
	

	private int age;
	private String name;
	private int salary;
	private String department;
	private String gender;
	private int yearOfJoining;

	public Employee() {
	
		// TODO Auto-generated constructor stub
	}

	public Employee(int age, String name, int salary, String department, String gender, int yearOfJoining) {
		super();
		this.age = age;
		this.name = name;
		this.salary = salary;
		this.department = department;
		this.gender = gender;
		this.yearOfJoining = yearOfJoining;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + ", salary=" + salary + ", department=" + department
				+ ", gender=" + gender + ", yearOfJoining=" + yearOfJoining + "]";
	}
	
	
}
