
public class Cars {
	
	static abstract class Car {
		
		public Car() {
			;
		}
		
		public String toString() {
			return "super Car";
		}
	}
	
	static class Ford extends Car {
		
		public Ford() {
			;
		}
		
		public String toString() {
			return "Ford Car";
		}
	}

	public static void main(String[] args) {
		Car car = new Ford();
		System.out.println(car);
	}

}
