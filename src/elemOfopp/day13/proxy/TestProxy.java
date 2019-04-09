package elemOfopp.day13.proxy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
interface Subject{
	void action();
}
class RealSubject implements Subject{
	@Override
	public void action() {
		// TODO Auto-generated method stub
		System.out.println("��������");
	}
}
class MyInvocationHandler implements InvocationHandler{
	Object obj;//ʵ���˽ӿڵı�������Ķ��������
	//��������Ķ���ʵ����������һ���������
	public Object blind(Object obj) {
		this.obj=obj;
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
	}
//��ͨ��������Ķ�����Ա�����ķ����ĵ���ʱ�Ƕ���ת���ɶ�invoke�����ĵ���
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		Object returnVal=method.invoke(obj, args);
		return returnVal;
	}
}
public class TestProxy {
public static void main(String[] args) {
	//��������Ķ���
	RealSubject realSubject=new RealSubject();
	//����һ��ʵ����InvocationHandler�ӿڵ���Ķ���
	MyInvocationHandler handler=new MyInvocationHandler();
	//����һ��blind��������̬�ķ���һ��ͬ��ʵ����real����������ʵ�ֽӿ�subject�Ĵ�����Ķ���
	Object object=handler.blind(realSubject);
	Subject subject=(Subject)object;//��ʱsubject���Ǵ�����Ķ���
	subject.action();//ת��InvacationHandler�ӿڵ�ʵ�����invoke���������ĵ���
	//�پ���
	NikeClothFactory nikeClothFactory=new NikeClothFactory();
	ClothFactory proxyCloth=(ClothFactory)handler.blind(nikeClothFactory);//proxyCloth�Ǵ�����Ķ���
	proxyCloth.productCloth();
}
}
