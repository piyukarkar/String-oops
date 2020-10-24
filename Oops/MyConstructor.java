class Vehicle{   
	
	int wheels;
	int headLights;
	String color;
	 
	Vehicle(){
		
	}
	Vehicle(int wheels ){   
		this.wheels = wheels;
		headLights = 2;
		
	}
	
	Vehicle(int wheels, String color){
		this.wheels = wheels;
		this.color = color;
		headLights = 2;
	}
}
public class MyConstructor {
    Myconstructor(){
		System.out.println("object is now created");
	}
	public static void main(String[] args) {
		
//		Myconstructor obj = new Myconstructor();
//		
             
		Vehicle car = new Vehicle(4);
		
		Vehicle scooty = new Vehicle(2);
		
		Vehicle eRikshaw = new Vehicle (3,"yellow");
		
		Vehicle random = new Vehicle();
		
		System.out.println(eRikshaw.wheels + " wheels and color = " + eRikshaw.color );
	}
}
