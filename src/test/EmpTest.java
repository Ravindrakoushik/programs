package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.model.Emp;

import customSortOrder.SortBasedOnSal;
import cutomInterface.EmpDao;

public class EmpTest {
   //@autowired
	private EmpDao dao;;
public static void main(String[] args) {
	List<Emp> empList = new ArrayList<>();
	Emp e = new Emp();
	e.setAge("");
	empList.add(new Emp("Siva", "24", 20000)); //1
	empList.add(new Emp("venkat", "28", 22000));//2
	empList.add(new Emp("raju", "20", 10000));//3
	//SortBasedOnAge aa = new SortBasedOnAge();
	Collections.sort(empList,new SortBasedOnSal());
	System.out.println(empList);
}
public EmpDao getDao() {
	return dao;
}
public void setDao(EmpDao dao) {
	this.dao = dao;
}
}
