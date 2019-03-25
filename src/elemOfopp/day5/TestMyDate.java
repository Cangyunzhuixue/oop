package elemOfopp.day5;

public class TestMyDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate myDate=new MyDate(1, 2, 3);
		MyDate myDate2=new MyDate(2, 3, 4);
		MyDate myDate3=new MyDate(1, 2, 3);
		System.out.println(myDate.equals(myDate2));
		System.out.println(myDate.equals(myDate3));

	}

}
