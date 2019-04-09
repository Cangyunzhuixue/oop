package elemOfopp.day13.proxy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
interface Human {
	void info();
	void fly();
}
// 被代理类
class SuperMan implements Human {
	@Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.println("超人");
	}
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("fly");
	}
}
class HumanUtil {
	public void method1() {
		System.out.println("方法1");
	}
	public void method2() {
		System.out.println("方法2");
	}
}
class MyInvocationHandler1 implements InvocationHandler {
	Object obj;
	public void SetObject(Object obj) {
		this.obj = obj;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		HumanUtil human=new HumanUtil();
		human.method1();
		Object returnVal = method.invoke(obj, args);
		human.method2();
		return returnVal;
	}
}
class MyProxy{
	public static Object getProxyInstance(Object obj) {
		MyInvocationHandler1 handler=new MyInvocationHandler1();
		handler.SetObject(obj);
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), handler);
	}
}
public class TesAop {
	public static void main(String[] args) {
		SuperMan man=new SuperMan();
		Object object=MyProxy.getProxyInstance(man);
		Human human=(Human)object;
		human.info();
		System.out.println();
		human.fly();
		NikeClothFactory nikeClothFactory=new NikeClothFactory();
		Object object2=MyProxy.getProxyInstance(nikeClothFactory);
		ClothFactory nik=(ClothFactory)object2;
		nik.productCloth();
	}
}
