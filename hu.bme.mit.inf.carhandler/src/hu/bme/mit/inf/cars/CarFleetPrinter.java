package hu.bme.mit.inf.cars;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class CarFleetPrinter {
	private List<Car> cars = new LinkedList<>();
	String manifest = "The car fleet consists of:\n";
	
	public List<Car> getCars() {
		return cars;
	}
	
	public static void main(String[] args) {
		CarFleetPrinter cf= new CarFleetPrinter();
		cf.print();
	}
	
	public CarFleetPrinter() {
		generateCarFleet();
	}
	
	public void print() {
		System.out.println(manifest);
	}
	
	private void generateCarFleet() {
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			cars.add(generateCar(random));
		}
		
		for (Car car : cars) {
			manifest += " - Car: " + car + "\n";
		}
	}

	private Car generateCar(Random random) {
		return new Car("MIT-" + String.format("%03d", random.nextInt(999)+1),
				2000+random.nextInt(20), 3.0+random.nextDouble()*4.0);
	}

}
