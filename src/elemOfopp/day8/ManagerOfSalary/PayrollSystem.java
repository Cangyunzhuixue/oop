package elemOfopp.day8.ManagerOfSalary;

import java.util.Scanner;

public class PayrollSystem {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Employee[] employee=new Employee[4];
		employee[0]=new SalariedEmployee("samuro",1001,28,7,1995,20000);
		employee[1]=new SalariedEmployee("samuro2",1002,21,12,1994,4000);
		employee[2]=new HourlyEmployee("samuro3",1003,8,10,1997,200,5);
		employee[3]=new HourlyEmployee("samuro4",1004,16,9,1994,100,5);
		for (int i = 0; i < employee.length; i++) {
			System.out.println(employee[i].toString());
		}
		System.out.println("输入 本月月份");
		int mon=scanner.nextInt();
		for (int i = 0; i < employee.length; i++) {
			if (employee[i].birthday.getMonth()==mon) {
				System.out.println(employee[i].toString()+" "+employee[i].earnings());
				
			}
		}
		scanner.close();              
	}
}
