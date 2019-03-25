package elemOfopp.day1;

public class TestArrayUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] arr=new int[] {2,8,63,12,55,1,47,98};
     ArrayUtil arrayUtil=new ArrayUtil();
     System.out.println("avg: "+arrayUtil.getAvg(arr));
     System.out.println("max: "+arrayUtil.getMax(arr));
     System.out.println("min: "+arrayUtil.getMin(arr));
     System.out.println("sum: "+arrayUtil.getSum(arr));
     arrayUtil.copyArry(arr);
     arrayUtil.reverse(arr);
     arrayUtil.sortArray(arr);
	}

}
