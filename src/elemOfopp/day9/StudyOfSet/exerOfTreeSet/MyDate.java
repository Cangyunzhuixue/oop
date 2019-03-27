package elemOfopp.day9.StudyOfSet.exerOfTreeSet;



public class MyDate implements Comparable{
private Integer year;
private Integer month;
private Integer day;
public MyDate() {
	this.day=1;
	this.day=2;
	this.day=3;
	// TODO Auto-generated constructor stub
}
public MyDate(Integer year, Integer month, Integer day) {
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
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + day;
	result = prime * result + month;
	result = prime * result + year;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	MyDate other = (MyDate) obj;
	if (day != other.day)
		return false;
	if (month != other.month)
		return false;
	if (year != other.year)
		return false;
	return true;
}
@Override
public int compareTo(Object o) {
	// TODO Auto-generated method stub
	if (o instanceof MyDate) {
		MyDate myDate=(MyDate)o;
		int i=this.year.compareTo(myDate.year);
		if(i==0) {
			int j=this.month.compareTo(myDate.month);
			if (j==0) {
				return  this.day.compareTo(myDate.day);
			}else {
				return j;
			}
		}else {
			return i;
		}
	}
	return 0;
}
@Override
public String toString() {
	return "MyDate [year=" + year + ", month=" + month + ", day=" + day + "]";
}

}
