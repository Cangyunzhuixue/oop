package elemOfopp.day3;
/*
 * 咦、子类继承负累之后 ，父类中声明的属性、方法，子类就可以得到
 * 每次调用子类，都会自动运行父类的构造函数，因此不会继承父类构造函数
 * 明确：仿佛类中有私有的属性或方法的时候，子类同样可以获取得到。只是由于封装性的设计
 * 是的子类不可以直接调用
 * 子类除了基础父类的结构之外，还可以定义自己特有的成分
 * 子类只能单继承，一个子类只能继承一个父类，父类可以有多个子类
 * 二、方法的重写
 * 1、前提，有子类继承父类
 * 2、子类继承父类之后，若适用，那么子类可以对父类重写（override,overwirte）、覆盖，即方法名一样，但是内容不养
 * 3、规则：要求二子类的方法“返回类型 方法名（参数列表）”与父类的方法一样
 *        子类的修饰符不能小于父类的修饰符
 *        若父类的方法异常，子类抛出的异常不能大于父类的
 *        致富路方法必须同为static或非static
 */
public class TestExtends {
private int sex;
private int salary;

public int getSex() {
	return sex;
}
public void setSex(int sex) {
	this.sex = sex;
}
public int getSalasry() {
	return salary;
}
public void setSalasry(int salasry) {
	this.salary = salasry;
}
public TestExtends() {
	
}
public TestExtends(int sex, int salasry) {
	this.sex = sex;
	this.salary = salasry;
}
public void manOrWomen() {
	if (sex==1) {
		System.out.println("man");
	}else if(sex==0){
	System.out.println("women");	
	}else {
		System.out.println("flase");
	}
}
public void employeed() {
	if (salary==1) {
		System.out.println("no job");
	}else {
		System.out.println("job");
	}
}

}
