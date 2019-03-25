package elemOfopp.day1;

public class ArrayUtil {
//最大
	public int getMax(int[] arr) {
		int max=arr[0];
		for (int i = 0; i < arr.length; i++) {
			max=(max>arr[i])?max:arr[i];
		}
		// TODO Auto-generated method stub
		return max;	
	}//最小
	public int getMin(int[] arr) {
		
		int min=arr[0];
		for (int i = 0; i < arr.length; i++) {
			min=(min<arr[i])?min:arr[i];
		}
		return min;
	}//总数
	public int getSum(int[] arr) {
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		return sum;
	}//平均数
	public int getAvg(int[] arr) {
		return getSum(arr)/8;
	}//翻转
	public void reverse(int[] arr) {
		System.out.println("reverse: ");

		for (int i = 0; i < arr.length/2; i++) {
			int temp=arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	    
		System.out.println();
	}//复制
	public void copyArry(int[] arr) {
		int[] arr2=new int[arr.length];
		System.out.println("arr: ");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i]=arr[i];
			System.out.print(arr[i]+" ");
		}
		System.out.println(arr);
		System.out.println("arr2: ");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
		System.out.println(arr2);
	}//排序
	public void sortArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int min=arr[i];
			for (int j = i; j < arr.length; j++) {
				if(min>arr[j]) {
					min=arr[j];
					arr[j]=arr[i];
				}
			}
			arr[i]=min;
		}
		System.out.println("sort: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}
}
