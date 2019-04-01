package elemOfopp.day11.exer2;

public class Account {
private String ID;
private double balance;
public Account() {
	super();
	// TODO Auto-generated constructor stub
}
public Account(String iD, double balance) {
	super();
	ID = iD;
	this.balance = balance;
}
public String getID() {
	return ID;
}
public void setID(String iD) {
	ID = iD;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((ID == null) ? 0 : ID.hashCode());
	long temp;
	temp = Double.doubleToLongBits(balance);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Account other = (Account) obj;
	if (ID == null) {
		if (other.ID != null)
			return false;
	} else if (!ID.equals(other.ID))
		return false;
	if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
		return false;
	return true;
}

}
