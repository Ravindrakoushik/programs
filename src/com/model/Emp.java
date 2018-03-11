package com.model;

public class Emp implements Comparable<Emp>{
  private String name;
  private String age;
  private int sal;
  public Emp(String name,String age,int sal){
	  this.name=name;
	  this.age = age;
	  this.sal =sal;
  }
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public int getSal() {
	return sal;
}
public void setSal(int sal) {
	this.sal = sal;
}
 
@Override
	public String toString() {
		return name+" "+age+" "+sal;
	}
@Override
public int compareTo(Emp o) {// based on sal
    
  return  o.getSal()-this.sal;
}
public Emp(){
	
}
}
