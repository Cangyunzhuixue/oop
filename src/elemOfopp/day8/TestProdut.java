package elemOfopp.day8;

public class TestProdut {
public static void main(String[] args) {
	TestProdut testProdut=new TestProdut();
	//��ʽһ������һ��ʵ��Product�ӿ���Ķ��󣬲����˶����뷽����
	NoteBook noteBook=new NoteBook();
	testProdut.show(noteBook);
	//��ʽ����
	Product p=new Product() {

		@Override
		public void getName() {
			// TODO Auto-generated method stub
			System.out.println();
		}

		@Override
		public void getPrice() {
			// TODO Auto-generated method stub
			System.out.println();
		}
		
	};
	//������һ��ʵ��Product�ӿڵ�������Ķ���
	testProdut.show(new Product() {
		
		@Override
		public void getPrice() {
			// TODO Auto-generated method stub
			System.out.println("i5");
		}
		
		@Override
		public void getName() {
			// TODO Auto-generated method stub
			System.out.println("��10000");
		}
	});
			
}

//�ֲ��ڲ����ʹ��

public Product getProduct() {
	//��ʽһ:ʵ��Product�ӿڵ���Ķ���
	class  Camera implements Product{

		@Override
		public void getName() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void getPrice() {
			// TODO Auto-generated method stub
			
		}
		
	}
	return new Camera();
}
public void show(Product p) {
	p.getName();
	p.getPrice();
}
}

interface Product{
	void getName();
	void getPrice();
}


class NoteBook implements Product{

	@Override
	public void getName() {
		// TODO Auto-generated method stub
		System.out.println("HP");
	}

	@Override
	public void getPrice() {
		// TODO Auto-generated method stub
		System.out.println(10000);
	}
	
}