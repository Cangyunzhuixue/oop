package elemOfopp.day8.ManagerOfSalary;

public class SalariedEmployee extends Employee{
private double monthlySalary;

	public double getMonthlySalary() {
	return monthlySalary;
}

public void setMonthlySalary(double monthlySalary) {
	this.monthlySalary = monthlySalary;
}

	public SalariedEmployee(String name,int number,int day,int month,int year,double monthlySalary) {
	super(name,number,day,month,year);
	this.monthlySalary = monthlySalary;
}

	public SalariedEmployee() {
	super();
	// TODO Auto-generated constructor stub
}

	@Override
	double earnings() {
		// TODO Auto-generated method stub
		return monthlySalary;
	}

	
	public String toString() {
		return "SalariedEmployee : "+this.name+" "+this.number+" "+this.birthday.toDateString();
	}

}
