package elemOfopp.day5;import com.sun.org.apache.bcel.internal.generic.RETURN;

public class Circle extends GeometricObject{
private double radius;

public Circle() {
	super("white",1.0);
	this.radius=1.0;
	// TODO Auto-generated constructor stub
}

public Circle( double radius) {
	super("white",1.0);
	this.radius=radius;
	// TODO Auto-generated constructor stub
}

public Circle(double radius,String color,double weight) {
    super(color,weight);
	this.radius = radius;
}

public double getRadius() {
	return radius;
}

public void setRadius(double radius) {
	this.radius = radius;
}
public double findArea() {
	return Math.PI*radius*radius;
}
@Override
public boolean equals(Object obj) {
	if(this==obj) {
		return true;
	}else if (obj==null) {
		return false;
	}else if (obj instanceof Circle) {
		Circle circle=(Circle)obj;
		if(this.radius==circle.radius) {
			return true;
		}else {
			return false;
		}
	}
	return false;	
}
@Override
public String toString() {
	return "This circle's radius is : "+this.radius;
}
}
