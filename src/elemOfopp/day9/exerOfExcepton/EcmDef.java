package elemOfopp.day9.exerOfExcepton;



public class EcmDef {
	
	public static void main(String[] args) {
		try{
		int i = Integer.parseInt(args[0]);//被除数
		int j = Integer.parseInt(args[1]);//除数
		ecm(i,j);
		}catch(NumberFormatException e){
			System.out.println("输入的数据类型不一致");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("缺少命令行参数");
		}catch(ArithmeticException e){
			System.out.println("分母为零了");
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
			System.out.println("数据输入类型不一致");
			// TODO: handle exception
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("缺少命令行参数");
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("分母为零");
		} catch (EcDef e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	
	}*/
	public static void ecm(int i,int j) {
		if(i < 0 || j < 0){
			throw new EcDef("您输入的数值存在负数！");
		}
		System.out.println(i / j);
	}
/*
	public static void ecm(int a, int b)  {

		if (b<0||a<0) {
		throw new EcDef("负数异常");	
		}else {
		
		System.out.println(a / b);
	}
		}*/

}
