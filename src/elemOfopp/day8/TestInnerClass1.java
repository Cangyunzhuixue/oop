package elemOfopp.day8;
/*
 * �ֲ��ڲ���
 */
public class TestInnerClass1 {

}
class OuterClass{
	public void method1(){
		class InnerCalss{
			
		}
	}
	//����ʹ��һ��������ʹ��ֵΪĳ�����ӿڵĶ��󣬶�����������ӿ��ڷ����ڲ�����
	public Comparable GetComparable() {
		//����һ��ʵ��Comparable�ӿڵ���
		class MyComparable implements Comparable{

			@Override
			public int compareTo(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}
			
		}
		//����һ��ʵ����Ķ���
		return new MyComparable();
	}
	public Comparable GetComparable1() {
		//����һ��ʵ��Comparable
		return new Comparable() {

			@Override
			public int compareTo(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}
			
		};
	}
}