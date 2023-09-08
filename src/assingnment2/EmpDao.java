package assingnment2;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmpDao {
	int MaleEmpCount(List<Employee> employeeList) {
		return listOfMaleEmp(employeeList).size();
	}
	int FemaleEmpCount(List<Employee> employeeList) {
		return listOfFemaleEmp(employeeList).size();
	}
	List<Employee> listOfMaleEmp(List<Employee> employeeList){
		return employeeList.stream().filter(emp->"Male".equals(emp.getGender())).collect(Collectors.toList());
	}
	List<Employee> listOfFemaleEmp(List<Employee> employeeList){
		return employeeList.stream().filter(emp->"Female".equals(emp.getGender())).collect(Collectors.toList());
	}
	List<String> nameOfDepartments(List<Employee> employeeList) {
		 HashSet <String>departments= new HashSet<>();
		 return employeeList.stream().map(emp->emp.getDepartment()).distinct().collect(Collectors.toList());
	
	}
	float averageAgeOfMale(List<Employee> employeeList) {
		List<Employee> listOfMaleEmp = listOfMaleEmp(employeeList);
		Integer sum = listOfMaleEmp.stream().map(e->e.getAge()).reduce(0,Integer::sum);
		return sum/listOfMaleEmp.size();
	}
	float averageAgeOfFemale(List<Employee> employeeList) {
		List<Employee> listOfFemaleEmp = listOfFemaleEmp(employeeList);
		Integer sum = listOfFemaleEmp.stream().map(e->e.getAge()).reduce(0,(c,e)->c+e);
		return sum/listOfFemaleEmp.size();
	}
	Employee detailsOfHighestPaidEmp(List<Employee> employeeList) {
		double maxSal=0;
		return (employeeList.stream().max(Comparator.comparing(Employee::getSal))).get();
		
	}
	void empJoinedAfter(List<Employee> employeeList ,int year) {
		employeeList.stream().filter(e->e.getJoining_year()>2015).forEach(e->System.out.println(e.getName()));
	}

	Map<String, Long> countNoOfEmpPerDep(List<Employee> employeeList) {
		Map<String, Long> collect = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		return collect;
	}
	Map<String, Double> avgSalPerDep(List<Employee> employeeList) {
		List<String> nameOfDepartments = nameOfDepartments(employeeList);
		Map<String, Double> collect = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSal)));
		return collect;
	}
	Employee getDetailOfYoungestMaleInProductdep(List<Employee> employeeList) {

		List<Employee> listOfMaleEmp = listOfMaleEmp(employeeList);
		Employee emp=listOfMaleEmp.stream().min((o1, o2) -> o1.getAge()-(o2.getAge())).get();
		return emp;
	}
	void avgSalOfMale(List<Employee> employeeList) {
		List<Employee> listOfMaleEmp = listOfMaleEmp(employeeList);
			Double sum = listOfMaleEmp.stream().map(e->e.getSal()).reduce(0.0,Double::sum);
			System.out.println("Avg sal of males is :"+(sum/listOfMaleEmp.size()));
	}
	void avgSalOfFemale(List<Employee> employeeList) {
		List<Employee> listOfFemaleEmp = listOfFemaleEmp(employeeList);
		Double sum = listOfFemaleEmp.stream().map(e->e.getSal()).reduce(0.0,Double::sum);
		System.out.println("Avg sal of males is :"+(sum/listOfFemaleEmp.size()));
	}
	void maleAndFemaleCountInSales(List<Employee> employeeList){
		List<Employee> maleEmployees = listOfMaleEmp(employeeList);
		List<Employee> femaleEmployees = listOfFemaleEmp(employeeList);
		long salesmate = maleEmployees.stream().filter(e->e.getDepartment().equals("Sales And Marketing")).count();
		long salesFemle= femaleEmployees.stream().filter(e->e.getDepartment().equals("Sales And Marketing")).count();
		System.out.println("Males is sales "+salesmate+" female count is "+salesFemle );
	}
	Map<String, List<Employee>> listOfEmpInEachDep(List<Employee> employeeList){
		 return employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
	}
	double avrageSalary(List <Employee> employeeList){
		double total= totalSalary(employeeList);
		return total/employeeList.size();
	}
	double totalSalary(List<Employee> employeeList){
		return employeeList.stream().map(e->e.getSal()).reduce(Double::sum).get();
	}

	List<Employee> empElderThen25(List<Employee> employeeList){
		return employeeList.stream().filter(e->e.getAge()>25).collect(Collectors.toList());
	}
	List<Employee> empYoungerThenOrEqual25(List<Employee> employeeList){
		return employeeList.stream().filter(e->e.getAge()<=25).collect(Collectors.toList());
	}
	Employee oldestEmp(List<Employee> employeeList){
		List<Employee> collect = employeeList.stream().sorted((e1, e2) -> e2.getAge()-(e1.getAge())).collect(Collectors.toList());
		return collect.get(0);
	}
}
