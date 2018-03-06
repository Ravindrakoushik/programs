package programs.collections;

import java.util.HashMap;
import java.util.Map;

public class EqualsAndHashcodeDemo {

	public static void main(String[] args) {
		Employee emp1 = new Employee(1,"String", "String");
		Employee emp2 = new Employee(1,"String", "String");
		Map<Employee, String> map = new HashMap<Employee, String>();
		map.put(emp1, "Hello");
		map.put(emp2, "Hello");
		System.out.println(map.size());

		Integer i = new Integer(1);
		Integer i1 = new Integer(1);
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(i, "One");
		map1.put(i1, "One");
		System.out.println(map1.size());

	}

}

class Employee {
	String firstName;

	@Override
	public int hashCode() {
		return 31*id+firstName.hashCode()+lastName.hashCode();
	}

	/*@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (obj instanceof Employee) {
			Employee employee = (Employee) obj;
			if (this.firstName == employee.firstName && this.lastName == employee.lastName) {
				return true;
			}
		}
		return false;
	}*/
	@Override
	public boolean equals(Object obj) {
	if(!(obj instanceof Employee)) return false;
		Employee employee=(Employee)obj;
		return this.id==employee.id && firstName.equals(employee.firstName) && lastName.equals(employee.lastName);
				
	}
	
     int id;
	String lastName;

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + "lastName=" + lastName + "]";
	}

	Employee(int id,String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

}
