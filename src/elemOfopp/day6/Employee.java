package elemOfopp.day6;


public abstract class Employee {
private String name;
private int Id;
private double salary;

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(String name, int id, double salary) {
	super();
	this.name = name;
	Id = id;
	this.salary = salary;
}
public abstract void  work() ;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}

}
