package elemOfopp.day8;
/*
 * 局部内部类
 */
public class TestInnerClass1 {

}
class OuterClass{
	public void method1(){
		class InnerCalss{
			
		}
	}
	//常常使用一个方法，使其值为某个类或接口的对象，而这个类在类或接口在方法内部创建
	public Comparable GetComparable() {
		//创建一个实现Comparable接口的类
		class MyComparable implements Comparable{

			@Override
			public int compareTo(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}
			
		}
		//返回一个实现类的对象
		return new MyComparable();
	}
	public Comparable GetComparable1() {
		//返回一个实现Comparable
		return new Comparable() {

			@Override
			public int compareTo(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}
			
		};
	}
}