package elemOfopp.day8.ManagerOfSalary;

public abstract class Employee {
protected String name;
protected int number;
protected MyDate birthday=new MyDate();
abstract double earnings();


public String toString() {
	return "Employee [name=" + name + ", numnber=" + number + ", brithday=" + birthday + "]";
}
public Employee(String name,int number,int day,int month,int year) {
	super();
	this.name = name;
	this.number = number;
	this.birthday=new MyDate(day,month,year);
}

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

}
