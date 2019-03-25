package elemOfopp.day8.ManagerOfSalary;

public class MyDate {
private int year;
private int month;
private int day;
public MyDate() {
	this.day=1;
	this.day=2;
	this.day=3;
	// TODO Auto-generated constructor stub
}
public MyDate(int year, int month, int day) {
	super();
	this.year = year;
	this.month = month;
	this.day = day;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public int getMonth() {
	return month;
}
public void setMonth(int month) {
	this.month = month;
}
public int getDay() {
	return day;
}
public void setDay(int day) {
	this.day = day;
}

public String toDateString() {
	return year+"Äê"+month+"ÔÂ"+day+"ÈÕ";
}

}
