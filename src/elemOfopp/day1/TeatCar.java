package elemOfopp.day1;



public class TeatCar {

}
class Car{
	String name;
	int wheel;
	
	public void info() {
		System.out.println();
	}
	
	
}
class factory{
	public Car produceCar() {
		return new Car();
	}
	public Car produceCar(String name,int whell) {
		Car car=new Car();
		car.name="xiao";
		return car;
		
	}
}