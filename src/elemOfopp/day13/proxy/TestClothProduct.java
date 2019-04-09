package elemOfopp.day13.proxy;
//��̬����ģʽ
//�ӿ�
interface ClothFactory{
	void productCloth();
}
//��������
class NikeClothFactory implements ClothFactory{
	@Override
	public void productCloth() {
		// TODO Auto-generated method stub
		System.out.println("nike");
	}
}
//������
class ProxyFactory implements ClothFactory{
	ClothFactory cf;
	//�������������ʱ��ʵ�ʴ���һ�������������
	public ProxyFactory(ClothFactory cFactory) {
		this.cf=cFactory;
	}
	@Override
	public void productCloth() {
		// TODO Auto-generated method stub
		System.out.println("����ʼ");
		cf.productCloth();
	}
}
public class TestClothProduct {
public static void main(String[] args) {
	NikeClothFactory nikeClothFactory=new NikeClothFactory();//������������Ķ���
	System.out.println("#");
	ProxyFactory proxyFactory=new ProxyFactory(nikeClothFactory);//����������Ķ���
	System.out.println("%%");
	proxyFactory.productCloth();
}
}
