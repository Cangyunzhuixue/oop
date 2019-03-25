package elemOfopp.day8.ManagerOfSalary;

public class HourlyEmployee extends Employee{
private double wage;
private int hour;

	public double getWage() {
	return wage;
}
public void setWage(double wage) {
	this.wage = wage;
}
public int getHour() {
	return hour;
}
public void setHour(int hour) {
	this.hour = hour;
}
	public HourlyEmployee(String name,int number,int day,int month,int year,double wage, int hour) {
	super(name,number,day,month,year);
	this.wage = wage;
	this.hour = hour;
}
	public HourlyEmployee() {
	super();
	// TODO Auto-generated constructor stub
}
	@Override
	double earnings() {
		// TODO Auto-generated method stub
		return wage*hour;
	}
	@Override
	public String toString() {
		return "HourlyEmployee : "+this.name+" "+this.number+" "+this.birthday.toDateString();
	}

}
