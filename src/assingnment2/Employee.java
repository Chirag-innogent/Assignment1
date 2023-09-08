package assingnment2;

import java.util.List;

public class Employee {
	 private int id;
	    private String name;
	    private int age;
	    private String gender;
	    private String department;
	    private int yearOfJoining;
	    private double salary;
	    
	    
	    public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Employee(int id, String name, int age, String gender, String department, int joining_year, double sal) {
	        this.id = id;
	        this.name = name;
	        this.age = age;
	        this.gender = gender;
	        this.department = department;
	        this.yearOfJoining = joining_year;
	        this.salary = sal;
	    }
	    public int getId() {
	        return id;
	    }
	    public void setId(int id) {
	        this.id = id;
	    }
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public int getAge() {
	        return age;
	    }
	    public void setAge(int age) {
	        this.age = age;
	    }
	    public String getGender() {
	        return gender;
	    }
	    public void setGender(String gender) {
	        this.gender = gender;
	    }
	    public String getDepartment() {
	        return department;
	    }
	    public void setDepartment(String department) {
	        this.department = department;
	    }
	    public int getJoining_year() {
	        return yearOfJoining;
	    }
	    public void setJoining_year(int joining_year) {
	        this.yearOfJoining = joining_year;
	    }
	    public double getSal() {
	        return salary;
	    }
	    public void setSal(double sal) {
	        this.salary = sal;
	    }
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
					+ department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
		}
	 
}
