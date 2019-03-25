package elemOfopp.day8;

public class TestProdut {
public static void main(String[] args) {
	TestProdut testProdut=new TestProdut();
	//方式一：闯将一个实现Product接口类的对象，并将此对象传入方法中
	NoteBook noteBook=new NoteBook();
	testProdut.show(noteBook);
	//方式二：
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
	//创建了一个实现Product接口的匿名类的对象
	testProdut.show(new Product() {
		
		@Override
		public void getPrice() {
			// TODO Auto-generated method stub
			System.out.println("i5");
		}
		
		@Override
		public void getName() {
			// TODO Auto-generated method stub
			System.out.println("￥10000");
		}
	});
			
}

//局部内部类的使用

public Product getProduct() {
	//方式一:实现Product接口的类的对象
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