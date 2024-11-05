package stream_api.deloitte;

public class Employee {
	
	private int id;
	private long Salary;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int id, long salary) {
		super();
		this.id = id;
		Salary = salary;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getSalary() {
		return Salary;
	}
	public void setSalary(long salary) {
		Salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", Salary=" + Salary + "]";
	}
}
