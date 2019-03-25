package elemOfopp.day5;

public class MyDate {
private int year;
private int month;
private int day;

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
@Override
public boolean equals(Object obj) {
	if (obj==null) {
		return false;
	}else if (obj==this) {
		return true;
	}else if(obj instanceof MyDate) {
		MyDate myDate=(MyDate)obj;
		if(this.year==myDate.year&&this.month==myDate.month&&this.day==myDate.day) {
			return true;
		}
		else return false;
	}
			
	return false;
}
}
