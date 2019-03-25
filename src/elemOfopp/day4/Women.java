package elemOfopp.day4;

public class Women extends Person{
private boolean isBeauty;
int id=1000;
public boolean isBeauty() {
	return isBeauty;
}

public void setBeauty(boolean isBeauty) {
	this.isBeauty = isBeauty;
}

public Women(boolean isBeauty) {
	super();
	this.isBeauty = isBeauty;
}
public Women() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public void eat() {
	System.out.println("manmanchi");
}
public void makeLove() {
	System.out.println("veryHappy");
	// TODO Auto-generated method stub

}
}
