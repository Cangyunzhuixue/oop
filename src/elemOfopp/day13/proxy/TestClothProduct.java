package elemOfopp.day13.proxy;
//静态代理模式
//接口
interface ClothFactory{
	void productCloth();
}
//被代理类
class NikeClothFactory implements ClothFactory{
	@Override
	public void productCloth() {
		// TODO Auto-generated method stub
		System.out.println("nike");
	}
}
//代理类
class ProxyFactory implements ClothFactory{
	ClothFactory cf;
	//创建代理类对象时，实际传入一个被代理类对象
	public ProxyFactory(ClothFactory cFactory) {
		this.cf=cFactory;
	}
	@Override
	public void productCloth() {
		// TODO Auto-generated method stub
		System.out.println("代理开始");
		cf.productCloth();
	}
}
public class TestClothProduct {
public static void main(String[] args) {
	NikeClothFactory nikeClothFactory=new NikeClothFactory();//创建被代理类的对象
	System.out.println("#");
	ProxyFactory proxyFactory=new ProxyFactory(nikeClothFactory);//创建代理类的对象
	System.out.println("%%");
	proxyFactory.productCloth();
}
}
