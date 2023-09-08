package assingnment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Assignment2 {
	public static void main(String[] args) {
		 List<Employee> employeeList = new ArrayList<>();
			employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
			employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
			employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
			employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
			employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
			employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
			employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
			employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
			employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
			employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
			employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
			employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
			employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
			employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
			employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
			employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
			employeeList.add(new Employee(277, "Anuj Chettiar" ,31, "Male", "Product Development", 2012, 35700.0));

			EmpDao edao= new EmpDao();
			//Question 1
			int maleEmpCount = edao.MaleEmpCount(employeeList);
			System.out.println("No of Male EMp are:"+maleEmpCount);
			int femaleEmpCount = edao.FemaleEmpCount(employeeList);
			System.out.println("No. of Female EMp are:"+femaleEmpCount);
			//Question 2
			System.out.println(edao.nameOfDepartments(employeeList));
			//Question 3
			System.out.println("Average age of male Emp:"+edao.averageAgeOfMale(employeeList));
			System.out.println("Average age of female Emp:"+edao.averageAgeOfFemale(employeeList));
			//Question 4
			Employee detailsOfHighestPaidEmp = edao.detailsOfHighestPaidEmp(employeeList);
			System.out.println(detailsOfHighestPaidEmp);
			//Question 5
			edao.empJoinedAfter(employeeList, 2015);
			//Question 6
			edao.countNoOfEmpPerDep(employeeList);
			//Question7
			for(Map.Entry e:edao.avgSalPerDep(employeeList).entrySet()){
				System.out.println(e.getKey()+":"+e.getValue());
			}
			//Question 8
			System.out.println(edao.getDetailOfYoungestMaleInProductdep(employeeList));
			//Question 9
			edao.maleAndFemaleCountInSales(employeeList);
			//Question10
			edao.avgSalOfMale(employeeList);
			edao.avgSalOfFemale(employeeList);
			//Question11
			for(Map.Entry e: edao.listOfEmpInEachDep(employeeList).entrySet()){
				List<Employee> value =(List<Employee>) e.getValue();
				System.out.println(e.getKey()+":");
				for(Employee er:value){
					System.out.print(er.getName()+" ,");
				}
				System.out.println();
			}
			//Question12
			double v = edao.avrageSalary(employeeList);
			double v1 = edao.totalSalary(employeeList);
			System.out.println("Average salary of Organisation :"+v+" and total salary is "+v1);
			//Question13
			List<Employee> olderEmployees = edao.empElderThen25(employeeList);
			List<Employee> youngerEmployees = edao.empYoungerThenOrEqual25(employeeList);

			//Question14
			Employee emp = edao.oldestEmp(employeeList);
			System.out.println("Oldest Emp is in department "+emp.getDepartment()+" and his age is "+emp.getAge());

	}
}
