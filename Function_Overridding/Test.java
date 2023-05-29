class Vehicle{
	
	
	public  void run() {
		
		
		System.out.println("This is main class");
	}
}
class Bike extends Vehicle{
	
	
	public void run()
	{
		System.out.println("This is child class");
	}
}




public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Bike b1 = new Bike();
     Vehicle v1 = new Bike();
     
     b1.run();
     v1.run();
 	}

}
