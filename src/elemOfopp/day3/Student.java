package elemOfopp.day3;
/*
 * 当子类和父类由同名属性，可以通过super.此属性显示调用
 * 重写之后，调用父类的方法，要加上super
 * super修饰构造器，通过在子类中使用super（形参列表）来显示调用父类中指定的构造器
 * 在构造器内部，super（形参列表）必须要声明在首航行
 * 在构造器内部，this（形参列表）和super（形参列表）只能出现了一个
 * 在构造器，不显示调用this（形参列表）和super（形参列表），默认调用的事父类的空参的构造器
 */
public class Student extends Person{
private String schoolName;
int id;
public Student() {
	super();
}
public  Student(String schoolName) {
	super(12,"samuro");
    this.schoolName=schoolName;
}
public void name() {
	System.out.println(this.id);
	System.out.println(super.id);
	System.out.println(super.name);
	System.out.println(this.schoolName);
	
}
}
