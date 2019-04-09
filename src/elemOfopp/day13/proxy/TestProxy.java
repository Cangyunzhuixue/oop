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
		System.out.println("被代理类");
	}
}
class MyInvocationHandler implements InvocationHandler{
	Object obj;//实现了接口的被代理类的对象的声明
	//给被代理的对象实例化：返回一个代理对象
	public Object blind(Object obj) {
		this.obj=obj;
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
	}
//当通过代理类的对象发起对被代理的方法的调用时们都会转换成对invoke方法的调用
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		Object returnVal=method.invoke(obj, args);
		return returnVal;
	}
}
public class TestProxy {
public static void main(String[] args) {
	//被代理类的对象
	RealSubject realSubject=new RealSubject();
	//创建一个实现了InvocationHandler接口的类的对象
	MyInvocationHandler handler=new MyInvocationHandler();
	//返回一个blind方法。动态的返回一个同样实现了real（）所在类实现接口subject的代理类的对象
	Object object=handler.blind(realSubject);
	Subject subject=(Subject)object;//此时subject就是代理类的对象
	subject.action();//转到InvacationHandler接口的实现类的invoke（）方法的调用
	//再举例
	NikeClothFactory nikeClothFactory=new NikeClothFactory();
	ClothFactory proxyCloth=(ClothFactory)handler.blind(nikeClothFactory);//proxyCloth是代理类的对象
	proxyCloth.productCloth();
}
}
