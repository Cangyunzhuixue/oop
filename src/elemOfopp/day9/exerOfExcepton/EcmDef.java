package elemOfopp.day9.exerOfExcepton;



public class EcmDef {
	
	public static void main(String[] args) {
		try{
		int i = Integer.parseInt(args[0]);//������
		int j = Integer.parseInt(args[1]);//����
		ecm(i,j);
		}catch(NumberFormatException e){
			System.out.println("������������Ͳ�һ��");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ȱ�������в���");
		}catch(ArithmeticException e){
			System.out.println("��ĸΪ����");
		}catch(EcDef e){
			System.out.println(e.getMessage());
		}
	}
	/*public static void main(String[] args) {
		
		try {
			int a =Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			ecm(a, b);
		} catch (NumberFormatException e) {
			System.out.println("�����������Ͳ�һ��");
			// TODO: handle exception
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("ȱ�������в���");
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("��ĸΪ��");
		} catch (EcDef e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	
	}*/
	public static void ecm(int i,int j) {
		if(i < 0 || j < 0){
			throw new EcDef("���������ֵ���ڸ�����");
		}
		System.out.println(i / j);
	}
/*
	public static void ecm(int a, int b)  {

		if (b<0||a<0) {
		throw new EcDef("�����쳣");	
		}else {
		
		System.out.println(a / b);
	}
		}*/

}
