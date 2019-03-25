package elemOfopp.day8;

import elemOfopp.day8.CompareObject;

public class ComparableCircle extends Circle implements CompareObject{

	public ComparableCircle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ComparableCircle(double radius) {
		super(radius);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if(this==o) {
			
		}else if (o instanceof Circle) {
			Circle circle=(Circle)o;
			if (this.getRadius()==circle.getRadius()) {
				return 1;
			}
		}
		return 0;
	}
	

}
