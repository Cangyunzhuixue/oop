package elemOfopp.day3;

public class Kids extends TestExtends {
	private int yearsOld;

	public static void main(String[] args) {
		Kids someKid = new Kids();
		someKid.setSex(1);
		someKid.setSalasry(10000);
		someKid.setYearsOld(18);
		someKid.manOrWomen();
		someKid.employeed();
		someKid.printAge();
	}

	private void printAge() {
		System.out.println(yearsOld);
	}

	public int getYearsOld() {
		return yearsOld;
	}

	public void setYearsOld(int yearsOld) {
		this.yearsOld = yearsOld;
	}

	@Override
	public void employeed() {
		System.out.println("study");
	}
}