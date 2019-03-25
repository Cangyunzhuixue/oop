package elemOfopp.day4;

public class Man extends Person{
private boolean smoking;
int id=100;
public boolean isSmoking() {
	return smoking;
}

public void setSmoking(boolean smoking) {
	this.smoking = smoking;
}

public Man() {
	super();
	// TODO Auto-generated constructor stub
}

public Man(boolean smoking) {
	super();
	this.smoking=smoking;
	// TODO Auto-generated constructor stub
}
@Override
public void eat() {
	System.out.println("shijinchi ");
}
private void makeLove() {
	// TODO Auto-generated method stub
	System.out.println("happy");

}
}
