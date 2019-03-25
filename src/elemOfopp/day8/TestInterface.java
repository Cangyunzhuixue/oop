package elemOfopp.day8;

public class TestInterface {
public static void main(String[] args) {
	ComparableCircle c1=new ComparableCircle(10);
	ComparableCircle c2=new ComparableCircle(10);
	System.out.println(c1.compareTo(c2));
}

}
