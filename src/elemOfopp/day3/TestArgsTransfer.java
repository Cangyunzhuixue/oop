package elemOfopp.day3;
//传递的都是值

public class TestArgsTransfer {
public static void main(String[] args) {
	TestArgsTransfer testArgsTransfer=new TestArgsTransfer();
	DataSwap dataSwap=new DataSwap();
	System.out.println(dataSwap.i+" "+dataSwap.j);
	testArgsTransfer.swapData(dataSwap);
	System.out.println(dataSwap.i+" "+dataSwap.j);
}
public void swapData(DataSwap dataSwap) {
	int temp=dataSwap.i;
	dataSwap.i=dataSwap.j;
	dataSwap.j=temp;
}
}
class  DataSwap{
	int i=9;
	int j=10;
}